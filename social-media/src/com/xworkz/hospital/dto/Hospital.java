package com.xworkz.hospital.dto;

public class Hospital {
	private String name;
	private int noOFdoctor;
	private String dName;
	
	public  Hospital() {
		System.out.println(this.getClass().getSimpleName()+ "Object is created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOFdoctor() {
		return noOFdoctor;
	}

	public void setNoOFdoctor(int noOFdoctor) {
		this.noOFdoctor = noOFdoctor;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}
	@Override
	public String toString() {
		return "Hospital-[hospitalname="+name+" , noofdoctors="+noOFdoctor+" , dname="+dName+"]";
	}
	@Override
	public int hashCode() {
		return this.noOFdoctor;
	}
}
