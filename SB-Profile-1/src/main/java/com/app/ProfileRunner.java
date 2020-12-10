package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.service.AlertService;

@Component
public class ProfileRunner implements CommandLineRunner {
	@Autowired
	private AlertService service;
	@Value("${app.db}")
	private String db;

	@Override
	public void run(String... args) throws Exception {

		service.alertSer();
		System.out.println(db);
	}

}
