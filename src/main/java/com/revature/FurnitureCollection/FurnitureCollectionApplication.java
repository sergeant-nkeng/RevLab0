package com.revature.FurnitureCollection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.revature") //scan the com.revature package for Spring Bean
@EntityScan("com.revature.Models") //scan the models package for Database entities
@EnableJpaRepositories("com.revature.Repos") //this allows all dao interfaces to be a JpaRepository
public class FurnitureCollectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(FurnitureCollectionApplication.class, args);
	}

}
