package com.app.runner;

import java.util.Map;
import java.util.Properties;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("app.format")
public class ProdRunner implements CommandLineRunner{
	private Map<String, Integer> pdtls;
	private Properties empdtls;
	

	@Override
	public String toString() {
		return "ProdRunner [pdtls=" + pdtls + ", empdtls=" + empdtls + "]";
	}


	public Map<String, Integer> getPdtls() {
		return pdtls;
	}


	public void setPdtls(Map<String, Integer> pdtls) {
		this.pdtls = pdtls;
	}


	public Properties getEmpdtls() {
		return empdtls;
	}


	public void setEmpdtls(Properties empdtls) {
		this.empdtls = empdtls;
	}


	@Override
	public void run(String... args) throws Exception {
       System.out.println(this);		
	}

}
