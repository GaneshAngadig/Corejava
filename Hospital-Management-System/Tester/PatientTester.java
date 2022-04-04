package com.xworkz.HospitalDTo.Tester;

import com.xworkz.HospitalDTo.Dto.HospitalDTO;
import com.xworkz.HospitalDTo.PatientDTO.PatientDTO;
import com.xworkz.HospitalDTo.constant.Gender;

import java.util.Scanner;

public class PatientTester {
	public static void main(String []args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=scanner.nextInt();
		HospitalDTO hp=new HospitalDTO();
		
		for(int i = 0;i<size;i++) {
		
		PatientDTO pt=new PatientDTO();
		System.out.println("Enter the age");
		pt.setAge(scanner.nextInt());
		System.out.println("Enter the id");
		pt.setId(scanner.nextInt());
		System.out.println("Enter the Contact number");
		pt.setCoNum(scanner.nextLong());
		System.out.println("Enter the name");
		pt.setName(scanner.next());
		System.out.println("Enter the Desease");
		pt.setDisease(scanner.next());
		System.out.println("Enter the adress");
		pt.setAdress(scanner.next());
		System.out.println("Enter the gender");
		String gender=scanner.next();
		System.out.println(Gender.valueOf(gender));
		
		
		System.out.println(hp.CreatePatientDetails(pt));
		
		}

		hp.getAllpatientDetails();
		
		System.out.println("get all patientDetailes");
		hp.getAllpatientDetails();
		
		System.out.println("get patient by ID");
		hp.getPatientByID(scanner.nextInt());
		
		System.out.println("get patient Id by Name");
		hp.getPatientIdByName(scanner.next());
		
		System.out.println("get patientId By contact");
		hp.getpatientIdByContact(scanner.nextLong());
		
		System.out.println("get patient Id By Age");
		hp.getpatientIdByAge(scanner.nextInt());
		
		System.out.println("get patient Name By Id");
		hp.getpatientNameById(scanner.nextInt());
		
		System.out.println("get Patient Adress By Name");
		hp.getPatientAdressByName(scanner.nextLine());
		
		System.out.println("get Patient Gender By Name");
		hp.getPatientGenderByName(scanner.next());
		
		
		
		
	
		
		
		
		
		
		
		
		
	
		
		
		
	}

}
