package com.xworkz.AbstractionATM;

public class AtmTester {
	public static void main(String[] args) {
		
	
	UnionBankAtmImpl swipe1=new UnionBankAtmImpl();
	swipe1.swipe();
	
	
	HdfcBankAtmImpl swipe2=new HdfcBankAtmImpl();
	swipe2.swipe();
}
}