package com.xworkz.Scanner;
import java.util.Scanner;

public class IplTeam {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Team Name");
		String teamName = sc.next();
		
		System.out.println("Enter NO Of Plyrs");
		int noofPlyrs = sc.nextInt();
		
		System.out.println("Enter no of Trophy");
		byte trophy=sc.nextByte();
		
		System.out.println("Wicket Taker");
		short wicketTaker=sc.nextShort();
		
		System.out.println("Best Economy");
		float bestEnc=sc.nextFloat();
		
		System.out.println("hPaid player Ishan Kishan");
		double hPaidPlyr=sc.nextDouble();
		
		System.out.println("Mumbai is Successfull team");
		boolean sucessfullTeam=sc.nextBoolean();
		
		System.out.println("Enter jursy color");
		String jursyColor=sc.next();
		
		sc.close();
	}

}
