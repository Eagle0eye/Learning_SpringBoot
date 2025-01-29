package com.study.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		// SpringApplication.run(ExampleApplication.class, args);
		// responsable for create a container IOC in jvm
		ConfigurableApplicationContext context = SpringApplication.run(ExampleApplication.class, args);
		Dev dev = context.getBean(Dev.class);
		dev.build();
	}

}
