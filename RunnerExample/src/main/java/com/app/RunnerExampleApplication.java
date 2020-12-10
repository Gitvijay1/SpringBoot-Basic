package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunnerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RunnerExampleApplication.class, args);
		System.out.println("hello");
	}
	public int getOrder() {
		return 50;
	}

}
