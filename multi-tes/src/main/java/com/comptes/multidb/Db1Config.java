package com.comptes.multidb;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactory", basePackages = {
		"com.comptes.multidb.db1.repo" })

public class Db1Config {

	@Primary
	@Bean (name="dataSource")
	//@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource dataSource() {

		
		  DriverManagerDataSource driverManagerDataSource = new
		  DriverManagerDataSource();
		  driverManagerDataSource.setDriverClassName("org.postgresql.Driver");
		  driverManagerDataSource.setUrl("jdbc:postgresql://127.0.0.1:5434/db1"
		  ); driverManagerDataSource.setUsername("postgres");
		  driverManagerDataSource.setPassword("");
		 
		return driverManagerDataSource;

		//return DataSourceBuilder.create().build();

	}

	@Primary
	@Bean(name = "entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder,
			@Qualifier("dataSource") DataSource dataSource) {
		return builder.dataSource(dataSource).packages("com.comptes.multidb.db1.domain").persistenceUnit("db1").build();
	}

	@Primary
	@Bean(name = "transactionManager")
	public PlatformTransactionManager transactionManager(
			@Qualifier("entityManagerFactory") EntityManagerFactory entityManagerFactory) {
		return new JpaTransactionManager(entityManagerFactory);
	}

}
