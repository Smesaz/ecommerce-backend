package com.project.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class BackendEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendEcommerceApplication.class, args);
	}

}
