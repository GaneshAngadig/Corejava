package com.xworkz.telecommunictaion;
import com.xworkz.telecommunictaion.dto.Telecom;

public class TelecomTester {
	public static void main(String[] args) {
		Telecom tel1=new Telecom();
		tel1.setBestPackage("@459");
		tel1.setCname("BSNL");
		tel1.setOwner("GVT OF INDIA");
		System.out.println(tel1);
		
		Telecom tel2=new Telecom();
		tel2.setBestPackage("@500");
		tel2.setCname("JIO");
		tel2.setOwner("MUKESH AMBANI");
		System.out.println(tel2);
	
		System.out.println();
	}

}
