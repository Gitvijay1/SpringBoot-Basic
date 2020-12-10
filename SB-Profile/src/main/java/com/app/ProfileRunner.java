package com.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("app.format")
public class ProfileRunner implements CommandLineRunner {
	private String db;
	

	@Override
	public String toString() {
		return "ProfileRunner [db=" + db + "]";
	}


	public String getDb() {
		return db;
	}


	public void setDb(String db) {
		this.db = db;
	}


	@Override
	public void run(String... args) throws Exception {

		System.out.println(this);
	}

}
