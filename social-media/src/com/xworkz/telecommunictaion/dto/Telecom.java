package com.xworkz.telecommunictaion.dto;

public class Telecom {
	private String Cname;
	private String owner;
	private String bestPackage;
	
	public Telecom() {
		System.out.println(this.getClass().getSimpleName()+ "Object is created");
		
	}

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getBestPackage() {
		return bestPackage;
	}

	public void setBestPackage(String bestPackage) {
		this.bestPackage = bestPackage;
	}
	@Override
	public String toString() {
		return "Telecom-[telecomCname="+Cname+" , ownername="+owner+" , bestpackage="+bestPackage+"]";
	
		
		}
}

