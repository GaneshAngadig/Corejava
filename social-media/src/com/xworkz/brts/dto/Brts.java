package com.xworkz.brts.dto;

public class Brts {
	private String busName;
	private String busNumber;
	private String brand;


	public Brts() {
		System.out.println(this.getClass().getSimpleName()+ "Object is created");
	}


	public String getBusName() {
		return busName;
	}


	public void setBusName(String busName) {
		this.busName = busName;
	}


	public String getBusNumber() {
		return busNumber;
	}


	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Brts-[brtsbusname="+busName+" , brtsbusnumber="+busNumber+" , brtsbrand="+brand+"]";
	}


}