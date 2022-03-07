package com.xwrokz.Motorcycle;

public class Bike {
	public String name;
	public String company;	
	public int cC;
	public double torque;
	public float power;
	public int topSpeed;
	public int fuleTank;
	public boolean abs;
	public boolean disk;
	public String headlight;
	public String seat;
	
	public Bike(String na , String com , int c , double tor , float pow , int tank ,  int fule , boolean ab , boolean dis , String head , String sea  ) {
		name=na;
		company=com;
		cC=c;
		torque=tor;
		power=pow;
		topSpeed=tank;
		fuleTank=fule;
		abs=ab;
		disk=dis;
		headlight=head;
		seat=sea;
		System.out.println(name + "\t" +company +"\t" + cC + "\t" + torque+ "\t" + power +"\t" + topSpeed+ "\t" + fuleTank +"\t" + abs + "\t" +disk +"\t" +headlight +"\t"+ seat);
		
	}
	public void yamaha(){
		System.out.println("One of the best companay in the world");
	}
	public void mt(){
		System.out.println("Best naked bike series in yamaha");
	}
	public void speed() {
		System.out.println("Any other naked bikes cant beat in speed ");
	}
	public void engine(){
		System.out.println("Better engines they made compare to other company");
	}
	public void color() {
		System.out.println("Racing Blue is thier brand color");
	}
}
