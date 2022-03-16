package com.xworkz.atm.dto;
import com.xworkz.atm.dto.Atm;

public class Atmtester {
	public static void main(String []args) {
		 Atm atm=new Atm();
		 atm.setName("UNION BANK OF INDIA");
		 atm.setNumber(78297829);
		 atm.setTyep("RUPIES");
		 System.out.println(atm.hashCode());
		 
		 System.out.println(atm);
		 
		 Atm atm1=new Atm();
		 atm1.setName("STATE BANK OF INDIA");
		 atm1.setNumber(8546885);
		 atm1.setTyep("DOLLER");
		 System.out.println(atm1.hashCode());
		 
		 System.out.println(atm1);
		 System.out.println(atm.equals(atm1));
	}

}
