package com.cg.placeproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableDiscoveryClient
@EnableJpaRepositories("com.cg.placeproduct.repository")
public class PlaceProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlaceProductApplication.class, args);
		
	}

}
