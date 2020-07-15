package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjuctionDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext conxt = SpringApplication.run(DependencyInjuctionDemoApplication.class, args);
	Customers c = conxt.getBean(Customers.class);
	c.display();
	}

}
