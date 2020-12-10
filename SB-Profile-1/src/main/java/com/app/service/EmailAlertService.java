package com.app.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class EmailAlertService implements AlertService {

	@Override
	public void alertSer() {

		System.out.println("EMAIL ALERT SERVICE");
	}

}
