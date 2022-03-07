package com.xworkz.oops.inheritence.chainCons;

public class Fan {
	public byte noOfwings;
	public String brandName;
	public String color;

	public Fan() {
		System.out.println("Invoking default Fan Constructor");	
		}
	public Fan(byte win,String brand,String col) {
		noOfwings=win;
		brandName=brand;
		color=col;
	}
	@Override
	public String toString() {
		return "win "+noOfwings+"\t brand "+brandName+"\t col"+color;
	}
	
	

	
}
