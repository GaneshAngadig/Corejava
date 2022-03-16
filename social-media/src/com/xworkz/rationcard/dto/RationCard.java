package com.xworkz.rationcard.dto;

public class RationCard {
	private String carType;
	private String ownerName;
	private byte age;
	
	public void RationCard() {
		
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	
	public byte getAge() {
		return age;
	}

	
	public void setAge(byte age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "RationCard-[cartype="+carType+" , ownername="+ownerName+" ,age="+age+"]"; 
	}
	
	

}
