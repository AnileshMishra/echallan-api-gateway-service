package com.aeologic.echallan.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EchallanApiGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EchallanApiGatewayServiceApplication.class, args);
	}

}
