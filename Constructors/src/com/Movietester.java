package com;
import com.xworkz.movie.Movie;

public class Movietester {
	public static void main(String []args) {
		
		 Movie mov=new Movie("KGF", "YASH","pradeep","prashanth neel",250.22,"ravi basrur","Bhuvan",3.2,false,false,"kannada");
		 Movie mo=new Movie("Roberrt", "Darshan","Asha","Tarun sudhir",120.5,"arjun janya","mahendra",3.0,false,false,"kannada");
		 Movie m=new Movie("Duniya", "vijay","poorni","soori",20.2,"v hari","hari",2.8,true,false,"kannada");
		 
		 mov.KGF();
		 mov.gross();
		 mov.vill();
		 mov.producer();
		 mov.production();
		 
	}

}
