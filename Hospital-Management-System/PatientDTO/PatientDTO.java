package com.xworkz.HospitalDTo.PatientDTO;

import com.xworkz.HospitalDTo.constant.Gender;

public class PatientDTO {
	private int id;
	private long coNum;
	private int age;
	private String name;
	private String disease;
	private String adress;
	private Gender gender;
	
	
	
	public Gender getGender() {
		return gender;
	}



	public void setGender(Gender gender) {
		this.gender = gender;
	}



	public  PatientDTO() {
		
		
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public long getCoNum() {
		return coNum;
	}



	public void setCoNum(long coNum) {
		this.coNum = coNum;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDisease() {
		return disease;
	}



	public void setDisease(String disease) {
		this.disease = disease;
	}



	public String getAdress() {
		return adress;
	}



	public void setAdress(String adress) {
		this.adress = adress;
	}



	@Override
	public String toString() {
		return "PatientDTO [id=" + id + ", coNum=" + coNum + ", age=" + age + ", name=" + name + ", disease=" + disease
				+ ", adress=" + adress + "]";
	}
	
	

}
