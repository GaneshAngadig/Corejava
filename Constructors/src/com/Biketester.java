package com;
import com.xwrokz.Motorcycle.Bike;

public class Biketester {
	public static void main(String []args) {
		
		 Bike Bi=new Bike("MT-15","YAMAHA", 155, 13.5 , 18.9f , 140 , 10 , true , true , "LED" , "2seater");
		 Bike du=new Bike("RC390","KTM", 390, 22 , 35.5f , 180 , 19 , true , true , "LED" , "2seater");
		 Bike te=new Bike("panigale","Ducati", 1000, 180 , 310.5f , 310 , 19 , true , false , "LED" , "single seater");
	
		 Bi.yamaha();
		 Bi.mt();
		 Bi.speed();
		 Bi.engine();
		 Bi.color();
	}
	

}
