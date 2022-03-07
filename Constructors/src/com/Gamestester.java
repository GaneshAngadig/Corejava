package com;
import com.xworkz.Sports.Games;

public class Gamestester {
	public static void main(String []args) {
		 Games Cricket=new Games("Cricket","Dontknow",11,3,"Bat Ball",17.5,true);
		 Games Football=new Games("Football","Dontknow",11,5,"Ball",90.5,true);
		 Games gambling=new Games("Cards","Pradeep",2,1,"Cards",5.2,false);
		 
		 Cricket.adv();
		 Football.dis();
		 gambling.money();
		 Football.fame();
		 Cricket.gF();
	}

}
