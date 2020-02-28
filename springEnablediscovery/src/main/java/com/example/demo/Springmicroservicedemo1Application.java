package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class Springmicroservicedemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springmicroservicedemo1Application.class, args);
	}

}
