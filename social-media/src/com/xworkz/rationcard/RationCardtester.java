package com.xworkz.rationcard;
import com.xworkz.rationcard.dto.RationCard;

public class RationCardtester {
	public static void main(String []args) {
		
		 RationCard card1=new RationCard();
		 card1.setAge((byte)22);
		 card1.setCarType("BPL");
		 card1.setOwnerName("KUMAR");
		 
		 
		 System.out.println(card1);
		 
		 RationCard card2=new RationCard();
		 card2.setAge((byte)53);
		 card2.setCarType("APL");
		 card2.setOwnerName("GANESH");
		 
		 System.out.println(card2);
	}

}
