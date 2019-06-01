package com.comptes.multidb;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.comptes.multidb.db1.domain.Tab1;
import com.comptes.multidb.db1.repo.Tab1Repo;
import com.comptes.multidb.db2.domain.Tab2;
import com.comptes.multidb.db2.repo.Tab2Repo;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App implements CommandLineRunner
{
	
	@Autowired
	private Tab1Repo tab1Repo;
	
	@Autowired
	private Tab2Repo tab2Repo;
	
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);

        System.out.println( "Hello World!" );
    }
    
    @Override
    	public void run(String... args) throws Exception {
    	
    	List<Tab1> tab1 = tab1Repo.findAll();
        
        List<Tab2> tab2 = tab2Repo.findAll();
        
        System.out.println(tab1.get(0));
        
        System.out.println(tab2.get(0));
        
    	}
}
