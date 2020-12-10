package com.app.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("htc")
public class SocialAlertService implements AlertService {

	@Override
	public void alertSer() {

		System.out.println("SOCIAL ALERT SERVICE");
	}

}
