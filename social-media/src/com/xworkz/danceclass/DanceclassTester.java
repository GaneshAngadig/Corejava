package com.xworkz.danceclass;
import com.xworkz.danceclass.dto.Danceclass;

public class DanceclassTester {
	public static void main(String[] args) {
		Danceclass class1=new Danceclass();
		class1.setClassName("LETS DANCE");
		class1.setMasterName("CHETAN");
		class1.setNoOfstuents((byte)50);
		System.out.println(class1);
		
		Danceclass class2=new Danceclass();
		class2.setClassName("DANCE MACHA DANCE");
		class2.setMasterName("PRADEEP");
		class2.setNoOfstuents((byte)55);
		
		System.out.println(class2);
	}
}
