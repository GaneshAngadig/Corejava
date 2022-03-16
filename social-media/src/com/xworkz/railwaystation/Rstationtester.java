package com.xworkz.railwaystation;
import javax.print.attribute.SetOfIntegerSyntax;

import com.xworkz.railwaystation.dto.Rstation;
public class Rstationtester {
	public static void main (String []args) {
		Rstation station1=new Rstation();
		station1.setTrainName("GOL GUMBAJ EXPRESS");	
		station1.setEngineName("DESAIL ENGINE");
		station1.setTicketPrice(454.99);
		System.out.println(station1);
		
	Rstation	station2=new Rstation();
	station2.setTrainName("CHARMINAR EXPRESS");
	station2.setEngineName("ELECTRICAL");
	station2.setTicketPrice(565.2555);
	
	System.out.println(station2);
	
	}

}
