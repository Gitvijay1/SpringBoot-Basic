package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("emp.format")
public class EmpRunner implements CommandLineRunner{
	private int eid;
	private String ename;
	private String job;
	private double sal;
	

	@Override
	public String toString() {
		return "EmpRunner [eid=" + eid + ", ename=" + ename + ", job=" + job + ", sal=" + sal + "]";
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
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


	public EmpRunner() {
		super();
	}


	@Override
	public void run(String... args) throws Exception {

		System.out.println(this);
	}

}
