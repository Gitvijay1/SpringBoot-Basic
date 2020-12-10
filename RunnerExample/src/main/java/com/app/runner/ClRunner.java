package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ClRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
        System.out.println("Command Line Ruynner");
	}

}
