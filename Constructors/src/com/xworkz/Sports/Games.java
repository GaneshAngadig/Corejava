package com.xworkz.Sports;

public class Games {
	
	public String name;
	public String father;
	public int noOFplyrs;
	public int umpires;
	public String things;
	public double pitch;
	public boolean healthImp;
	
	public Games(String na,String fa,int plyrs,int ump,String th,double pich,boolean hel){
	name=na;
	father=fa;
	noOFplyrs=plyrs;
	umpires=ump;
	things=th;
	pitch=pich;
	healthImp=hel;
	
	System.out.println(name+"\t"+father+"\t"+noOFplyrs+"\t"+umpires+"\t"+things+"\t"+pitch+"\t"+healthImp);
}
	public void adv() {
		System.out.println("Physical improvment");
	}
	public void dis() {
		System.out.println("No disadvantges");
	}
	public void money() {
		System.out.println("make lot of money from sports");
	}
	public void fame() {
		System.out.println("sports gave lot of fame ");
	}
	public void gF() {
		System.out.println("Sports gave lot of GF's");
	}
	}