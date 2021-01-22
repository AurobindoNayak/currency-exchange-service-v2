package com.microservice.currencyexchnageservicev2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CurrencyExchnageServiceV2Application {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchnageServiceV2Application.class, args);
	}

}
