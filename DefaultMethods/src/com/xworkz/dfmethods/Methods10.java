package com.xworkz.dfmethods;

public class Methods10 {
	public static void main(String[] args) {
	
		String name="Devendra Singh";
		String name1="Nikunj";
		String name2="Devendra Singh";
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.concat(" chavan"));
		System.out.println(name.toString());
		System.out.println(name.equals(name1));
		System.out.println(name.equals(name2));
		System.out.println(name.hashCode());
		System.out.println(name.indexOf("e"));
		System.out.println(name.charAt(5));
		System.out.println(name.split(name2));
		
		char ch[]=name.toCharArray();
		for(int i=0;i<=ch.length-1;i++) {
			System.out.println(ch[i]);
			
		}
		System.out.println(name.valueOf(ch[5]));
		
	}
	

}
