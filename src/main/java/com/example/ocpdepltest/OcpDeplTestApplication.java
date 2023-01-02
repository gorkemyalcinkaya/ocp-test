package com.example.ocpdepltest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class OcpDeplTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(OcpDeplTestApplication.class, args);
	}

}
