package com.xworkz.railwaystation.dto;

public class Rstation {
	private double ticketPrice;
	private String trainName;
	private String engineName;
	
	public Rstation() {
		System.out.println(this.getClass().getSimpleName()+  "Object is created");
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getEngineName() {
		return engineName;
	}

	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}
	@Override
	public String toString() {
		return "Rstation-[ticketprice="+ticketPrice+" , trainname="+trainName+" , enginename="+engineName+"]";
	}

}
