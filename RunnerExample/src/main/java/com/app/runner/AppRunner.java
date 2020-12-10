package com.app.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Component
@Configuration
@Order(50)
public class AppRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("App Runner");
	}

}
