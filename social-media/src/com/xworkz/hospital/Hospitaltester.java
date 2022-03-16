package com.xworkz.hospital;
import com.xworkz.hospital.dto.Hospital;

public class Hospitaltester {
	public static void main(String[] args) {
		
	Hospital hos1=new Hospital();
	hos1.setdName("DEVENDRA SINGH");
	hos1.setName("NARAYAN HEART HOSPITAL");
	hos1.setNoOFdoctor(500);
	System.out.println(hos1);
	System.out.println(hos1.hashCode());
	
	 Hospital hos2=new Hospital();
	 hos2.setdName("NIKUNJ");
	 hos2.setName("XWORKZ");
	 hos2.setNoOFdoctor(1000);
	 
	 System.out.println(hos2);
	 System.out.println(hos2.hashCode());
	}

}
