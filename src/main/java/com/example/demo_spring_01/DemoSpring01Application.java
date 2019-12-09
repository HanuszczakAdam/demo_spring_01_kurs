package com.example.demo_spring_01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:knightRepository.properties")
public class DemoSpring01Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpring01Application.class, args);
	}

}
