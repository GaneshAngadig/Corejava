package com.xworkz.metro.dto;

public class Metro {
	private String number;
	private String name;
	private String ticketType;
	
	public  Metro() {
		System.out.println(this.getClass().getSimpleName()+  "Object is created ");
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTicketType() {
		return ticketType;
	}

	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}
	@Override
	public String toString () {
		return "Metro-[Metronumber="+number+" ,Metroname="+name+" , MetroticketTYPE="+ticketType+"]";
	}

}
