package com.xworkz.metro;
import com.xworkz.metro.dto.Metro;
public class Metrotester {
	
	public static void main(String []args) {
		 Metro metro1=new Metro();
		 metro1.setName("KVEMPU METROSTATION");
		 metro1.setNumber("4446446d");
		 metro1.setTicketType("QR TYPE");
		 
		 System.out.println(metro1);
		 
		  Metro metro2=new Metro();
		  metro2.setName("NAVARANG METRO STATION");
		  metro2.setNumber("21115154j");
		  metro2.setTicketType("SENSOR");
		  
		  System.out.println(metro2);
	}
}
