package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("app.format")
public class EmpRunner implements CommandLineRunner{
	private String[] model;
	private List<String> empdtl;
	private Set<Integer> empsal;
	

	@Override
	public String toString() {
		return "EmpRunner [model=" + Arrays.toString(model) + ", empdtl=" + empdtl + ", empsal=" + empsal + "]";
	}


	public String[] getModel() {
		return model;
	}


	public void setModel(String[] model) {
		this.model = model;
	}


	public List<String> getEmpdtl() {
		return empdtl;
	}


	public void setEmpdtl(List<String> empdtl) {
		this.empdtl = empdtl;
	}


	public Set<Integer> getEmpsal() {
		return empsal;
	}


	public void setEmpsal(Set<Integer> empsal) {
		this.empsal = empsal;
	}


	@Override
	public void run(String... args) throws Exception {

		System.out.println(this);
	}

}
