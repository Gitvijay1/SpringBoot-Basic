package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Employee;

@Component
public class MyRunner implements CommandLineRunner{
	@Autowired
	private Employee emp;

	@Override
	public void run(String... args) throws Exception {

		System.out.println(emp);
	}

}
