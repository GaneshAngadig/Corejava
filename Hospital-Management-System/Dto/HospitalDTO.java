package com.xworkz.HospitalDTo.Dto;
import com.xworkz.HospitalDTo.PatientDTO.PatientDTO;
import com.xworkz.HospitalDTo.constant.Gender;

public class HospitalDTO {

	public PatientDTO patientDTO[];
	int index;
	
	
	public void Hospital(int size) {
		patientDTO = new PatientDTO[size];
		
	}
	public boolean CreatePatientDetails(PatientDTO dto) {
		System.out.println("invoked createPatientDetailes()");
		boolean patientAdded=false;
		if(dto !=null) {
			patientDTO[index++]=dto;
			 patientAdded = true;
			
		}
		else {
			System.out.println("No patient found");
		}
		System.out.println("end of create patientDetailes");
		return patientAdded;
		}
	
		
	public void getAllpatientDetails() {
		System.out.println("inside getAllpatientDetails ()...fetching the data");
		for (int i = 0; i < patientDTO.length; i++) {
			System.out.println(patientDTO[i]);
		}
		System.out.println("end of getpatientDetails");	
		
			System.out.println("inside getPatientId()");
			}
	public int getPatientByID(int patientID) {
		System.out.println("inside getpatientID ()");
		System.out.println("arg 1 Patient ID :"+patientID);
		for(int i=0;i<patientDTO.length;i++) {
			System.out.println(patientDTO[i].getId());
		}
		return patientID;
		
		
		}
	public String getPatientIdByName(String patientName) {
		System.out.println("inside getPatientIdByName()..");
		for (int i = 0; i < patientDTO.length; i++) {
			if(patientDTO[i].getName().equals(patientName)) {
				System.out.println("patient name:"+patientDTO[i].getName() + "," + "patient ID:"+patientDTO[i].getId());
			}
			else {
					System.out.println("patient id :"+patientName+" is not available");
			}
		}
		return patientName;
	}
	public Gender getPatientIdByGender(Gender patientGender) {
		System.out.println("inside getPatientIdBygender()...");
		for (int i = 0; i < patientDTO.length; i++) {
			if(patientDTO[i].getGender()==patientGender) {
				System.out.println("patient gender:"+ patientDTO[i].getGender());
				}
			else {
				System.out.println("patient gender: "+ patientGender+ "is not available");
			}
		}
		return patientGender;
	}
	public long getpatientIdByContact(long patientContact) {
		System.out.println("inside getPatientByContact");
		for (int i = 0; i < patientDTO.length; i++) {
			if(patientDTO[i].getCoNum()==patientContact){
				System.out.println("patientContact:"+patientDTO[i].getCoNum());
				}
			else {
				System.out.println("patient Contact:"+ patientContact+ "is not available");
			}
		}
		return patientContact;
	}
	public int getpatientIdByAge(int patientAge) {
		System.out.println("inside getPatientByAge");
		for (int i = 0; i < patientDTO.length; i++) {
			if(patientDTO[i].getAge()==patientAge){
				System.out.println("patientContact:"+patientDTO[i].getAge());
				}
			else {
				System.out.println("patient Contact:"+ patientAge+ "is not available");
	
	}
		
	}
		return patientAge;
	}
	public int getpatientNameById(int patientId) {
		System.out.println("inside getpatientNameById ");
		for (int i = 0; i < patientDTO.length; i++) {
			if (patientDTO[i].getId() == patientId) {
				System.out.println("patient name:"+ patientDTO[i].getId());
			}
			else{
				System.out.println("patient id:"+patientId+"is not available");
			}
		}
		return patientId;
	}
	public String getPatientAdressByName(String patientName) {
		System.out.println("inside getPatientAdressByName()  ");
		for (int i = 0; i < patientDTO.length; i++) {
			if(patientDTO[i].getName()==patientName) {
				System.out.println("patient name: "+patientDTO[i].getName());
			}
			else {
				System.out.println("patient name:"+patientName+"is not available");
			}
		}
		return patientName;
	}
	public String getPatientGenderByName(String name) {
		System.out.println("inside getPatientGenderByName()...");
		for (int i = 0; i < patientDTO.length; i++) {
			if(patientDTO[i].getName()==name) {
				System.out.println("patient name:"+name+"is not available");
				}
			else {
				System.out.println("patient name:"+patientDTO[i].getName());
			}
		}
		return name;			
		}
	}
	


// 	getPatientByname
//	getPatientByGender
//	getpatientByContactNo
//	getPatientByAge

//	getPatientNameById
//	getPatientIdByName
// 	getPatientAdressByName
// 	getGenderByPatientName
