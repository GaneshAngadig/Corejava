package com.xworkz.AbstractionATM;

public class AtmFactory {
	public static Atm getmoney(String type) {
		if(type.equalsIgnoreCase("UnionBankAtm")) {
			return new UnionBankAtmImpl();
		}
		else if(type.equalsIgnoreCase("HdfcBankAtm")) {
			return new HdfcBankAtmImpl();
			
		}
		return null;
		
	}

}
