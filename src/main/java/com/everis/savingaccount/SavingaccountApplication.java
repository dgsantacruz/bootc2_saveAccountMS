package com.everis.savingaccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SavingaccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(SavingaccountApplication.class, args);
	}

}
