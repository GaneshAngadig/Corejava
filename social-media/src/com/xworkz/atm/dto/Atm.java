package com.xworkz.atm.dto;

public class Atm {
	private String type;
	private String name;
	private int number;
	
	public  Atm() {
		System.out.println(this.getClass().getSimpleName()+ "Object is created ");
	}

	public String getTyep() {
		return type;
	}

	public void setTyep(String tyep) {
		this.type = tyep;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Atm-[Atmtype="+type+",Atmname="+name+",Atmnumber="+number+"]";
	}
	@Override
	public int hashCode() {
		return this.number;
	}
	@Override
	public boolean equals(Object obj) {
		Atm atm=(Atm)obj;
				if(this.name==atm.name)
					return true;
		return false;
	}
	

}
