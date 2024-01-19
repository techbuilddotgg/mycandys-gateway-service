package com.feri.mycandysgatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MyCandysGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyCandysGatewayServiceApplication.class, args);
	}

}
