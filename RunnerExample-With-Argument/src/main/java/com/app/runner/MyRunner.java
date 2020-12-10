package com.app.runner;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Hello Command Line Runner");
		System.out.println(args[1]);
		System.out.println(Arrays.asList(args));
		System.out.println("end of the Command line Runner");
	}

}
