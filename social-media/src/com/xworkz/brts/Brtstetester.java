package com.xworkz.brts;
import com.xworkz.brts.dto.Brts;

public class Brtstetester {
	public static void main(String[] args) {
		 Brts bus1=new Brts();
		 bus1.setBusName("CHIGARI");
		 bus1.setBrand("TATA");
		 bus1.setBusNumber("KA29EJ2928");
		 System.out.println(bus1);
	
		Brts bus2=new Brts();
		bus2.setBusName("PANCH LINGESHWAR");
		bus2.setBrand("TESLA");
		bus2.setBusNumber("KA22JU2000");
		System.out.println(bus2);
	}

}
