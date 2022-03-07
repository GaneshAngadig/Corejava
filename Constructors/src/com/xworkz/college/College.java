package com.xworkz.college;

public class College {
	public String name;
	public String place;
	public int pincode;
	public String principle;
	public int noOfbus;
	public int noOfstudents;
	public int noOfTeacher;
	public boolean university;
	public boolean degree;
	public String founder;
	public double hPER;

	public College(String na,String pl,int pin,String pri,int bus,int stu,int tech,boolean uni,boolean deg,String fun,double per) {
	name=na;
	place=pl;
	pincode=pin;
	principle=pri;
	noOfbus=bus;
	noOfstudents=stu;
	noOfTeacher=tech;
	university=uni;
	degree=deg;
	founder=fun;
	hPER=per;
	
	System.out.println(name+"\t"+place+"\t"+pincode+"\t"+principle+"\t"+noOfbus+"\t"+noOfstudents+"\t"+noOfTeacher+"\t"+university+"\t"+degree+"\t"+founder+"\t"+hPER);
}
	public void quality() {
		System.out.println("one of the best college in guledagudda");
	}
	public void old() {
		System.out.println("just 6 years old");
}
	public void spcl() {
		System.out.println("All teachers from out of state");
	}
	public void disad() {
		System.out.println("No Disadvantage");
	}
	public void food() {
		System.out.println("Providing Free food ");
	}
}

