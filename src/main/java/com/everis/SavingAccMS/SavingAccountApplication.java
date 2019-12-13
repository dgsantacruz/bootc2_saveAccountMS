package com.everis.SavingAccMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SavingAccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(SavingAccountApplication.class, args);
	}

}
