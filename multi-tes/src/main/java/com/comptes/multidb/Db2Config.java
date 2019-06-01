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
@EnableJpaRepositories(
		entityManagerFactoryRef="db2entityManagerFactory",
		transactionManagerRef = "db2transactionManager",
		basePackages={"com.comptes.multidb.db2.repo"}
		)

public class Db2Config {

	
	@Bean(name="db2Datasource")
	//@ConfigurationProperties(prefix = "db2.datasource")
	public DataSource dataSource(){
		
		DriverManagerDataSource driverManagerDataSource = new
				  DriverManagerDataSource();
				  driverManagerDataSource.setDriverClassName("org.postgresql.Driver");
				  driverManagerDataSource.setUrl("jdbc:postgresql://127.0.0.1:5434/db2"
				  ); driverManagerDataSource.setUsername("postgres");
				  driverManagerDataSource.setPassword("");
				  
		return driverManagerDataSource;
		//return DataSourceBuilder.create().build();
	}
	
	  @Bean(name = "db2entityManagerFactory")
	  public LocalContainerEntityManagerFactoryBean 
	  entityManagerFactory(
	    EntityManagerFactoryBuilder builder,
	    @Qualifier("db2Datasource") DataSource dataSource
	  ) {
	    return builder
	      .dataSource(dataSource)
	      .packages("com.comptes.multidb.db2.domain")
	      .persistenceUnit("db2")
	      .build();
	  }
	
	
	  @Bean(name = "db2transactionManager")
	  public PlatformTransactionManager transactionManager(
	    @Qualifier("db2entityManagerFactory") EntityManagerFactory 
	    db2entityManagerFactory
	  ) {
	    return new JpaTransactionManager(db2entityManagerFactory);
	  }

	
}
