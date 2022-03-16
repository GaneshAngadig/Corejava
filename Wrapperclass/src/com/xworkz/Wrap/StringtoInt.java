package com.xworkz.Wrap;

public class StringtoInt {
	public static void main(String[] args) {
		String phoneNumber="782918768";
		int contactnum1=Integer.parseInt(phoneNumber);
		System.out.println(contactnum1);
		
		int i=20;
		Integer i1=i;
		System.out.println(i1.toString());
		System.out.println(i1.hashCode());
		
		short y=222;
		Short y1=y;
		System.out.println(y1.toString());
		System.out.println(y1.hashCode());
	}
}
