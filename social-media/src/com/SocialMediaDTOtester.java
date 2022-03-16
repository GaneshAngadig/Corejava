package com;
import com.xworkz.socialMedia.dto.SocialMediaDTO;

public class SocialMediaDTOtester {

	public static void main(String []args) {
		 SocialMediaDTO dto=new SocialMediaDTO();
	
		 dto.setid(1233566);
		 dto.setname("INSTAGRAM");
		 dto.setfounder("MARK ZUKARBERG");
		 dto.setsize("55.5Mb");
		 dto.setversion(3.1);
		 System.out.println(dto.hashCode());
		 
		 System.out.println(dto);
		 
		 SocialMediaDTO dto1=new SocialMediaDTO();
		 dto1.setid(1223332333);
		 dto1.setname("FACEBOOK");
		 dto1.setfounder("MARK ZUKERBERG");
		 dto1.setsize("56.55Mb");
		 dto1.setversion(6.5);
		  
		 System.out.println(dto1);
		 System.out.println(dto.equals(dto1));
	}
}
