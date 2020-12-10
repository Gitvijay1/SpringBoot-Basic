package com.app.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("nit")
public class SmsAlertService implements AlertService {

	@Override
	public void alertSer() {

		System.out.println("SMS ALERT SERVICE");
	}

}
