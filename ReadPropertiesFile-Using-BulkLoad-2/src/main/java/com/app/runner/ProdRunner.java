package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("app")
public class ProdRunner implements CommandLineRunner{
	private int prodId;
	private String prodCode;
	private double prodCast;
	
	//multiple values -> Collections
		//1D collections (Array/List/Set)
		private String[] projs;
		private Set<Double> versions; 
		private List<Integer> projFmtCodes; 
		
		

	public ProdRunner() {
			super();
		}



	public int getProdId() {
		return prodId;
	}



	public void setProdId(int prodId) {
		this.prodId = prodId;
	}



	public String getProdCode() {
		return prodCode;
	}



	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}



	public double getProdCast() {
		return prodCast;
	}



	public void setProdCast(double prodCast) {
		this.prodCast = prodCast;
	}



	public String[] getProjs() {
		return projs;
	}



	public void setProjs(String[] projs) {
		this.projs = projs;
	}



	public Set<Double> getVersions() {
		return versions;
	}



	public void setVersions(Set<Double> versions) {
		this.versions = versions;
	}



	public List<Integer> getProjFmtCodes() {
		return projFmtCodes;
	}



	public void setProjFmtCodes(List<Integer> projFmtCodes) {
		this.projFmtCodes = projFmtCodes;
	}



	@Override
	public String toString() {
		return "ProdRunner [prodId=" + prodId + ", prodCode=" + prodCode + ", prodCast=" + prodCast + ", projs="
				+ Arrays.toString(projs) + ", versions=" + versions + ", projFmtCodes=" + projFmtCodes + "]";
	}



	@Override
	public void run(String... args) throws Exception {

		System.out.println(this);
	}

}
