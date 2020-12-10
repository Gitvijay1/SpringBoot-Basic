package com.app.runner;

import java.util.Map;
import java.util.Properties;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("app")
public class CollRunner implements CommandLineRunner{
	private Map<String, String> pinfo;
	private Map<String, Integer> pmcount;
	
	private Properties mydata;
	

	public CollRunner() {
		super();
	}


	public Map<String, String> getPinfo() {
		return pinfo;
	}


	public void setPinfo(Map<String, String> pinfo) {
		this.pinfo = pinfo;
	}


	public Map<String, Integer> getPmcount() {
		return pmcount;
	}


	public void setPmcount(Map<String, Integer> pmcount) {
		this.pmcount = pmcount;
	}


	public Properties getMydata() {
		return mydata;
	}


	public void setMydata(Properties mydata) {
		this.mydata = mydata;
	}
	


	@Override
	public String toString() {
		return "CollRunner [pinfo=" + pinfo + ", pmcount=" + pmcount + ", mydata=" + mydata + "]";
	}


	@Override
	public void run(String... args) throws Exception {
       System.out.println(this);		
	}

}
