package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("emp")
public class EmpRunner implements CommandLineRunner{
	private int id;
	private String name;
	private String job;
	private double sal;
	

	public EmpRunner() {
		super();
	}


	

	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getJob() {
		return job;
	}




	public void setJob(String job) {
		this.job = job;
	}




	public double getSal() {
		return sal;
	}




	public void setSal(double sal) {
		this.sal = sal;
	}




	@Override
	public String toString() {
		return "EmpRunner [id=" + id + ", name=" + name + ", job=" + job + ", sal=" + sal + "]";
	}




	@Override
	public void run(String... args) throws Exception {
       System.out.println(this.toString());		
	}

}
