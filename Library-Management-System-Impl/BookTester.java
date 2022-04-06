package com.xworkz.LibraryApp;

import java.util.Scanner;

import com.xworkz.LibraryApp.Library.LibraryApp;
import com.xworkz.LibraryApp.dto.BookDTO;
import com.xworkz.LibraryApp.dto.libraryimpl.LibraryImpl;

public class BookTester {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a size");
			int size=sc.nextInt();
			
			LibraryApp lib=new LibraryImpl(size);
			
			for (int i = 0; i <size; i++) {
				
		
			
				BookDTO book=new BookDTO();
				
			System.out.println("enter book id");
			book.setBookId(sc.nextInt());
			
			System.out.println("enter book name");
			book.setBookName(sc.next());
			
			System.out.println("enter author name");
			book.setBookAuthorName(sc.next());
			
			System.out.println("enter price");
			book.setBookPrice(sc.nextFloat());
			
			System.out.println("enter a addition");
			book.setBookAddition(sc.next());;
			
			System.out.println("enter publisher name");
			book.setBookPublisher(sc.next());
			
			System.out.println(lib.createBookDetails(book));
			}
			
			String text;
			do {
				System.out.println("enter 1 to get all book detailes");
				System.out.println("enter 2 to update book edition by book author name");
				System.out.println("enter 3 to delete book detailes by book name");
				int choice =sc.nextInt();
				switch(choice) {
				case 1:lib.getAllBookDetails();
				break;
				case 2:System.out.println("enter author name to update Book eddition");
				lib.updateAdditionByAuthor(sc.next(),sc.next());
				break;
				case 3:System.out.println("enter book name to delete all the book detailes");
				lib.deleteBookDetailsByName(sc.next());
				break;
				}
				System.out.println("do you want to continue type Yes/No");
				text=sc.next();
				
				
			}
			while(text.equalsIgnoreCase("Yes"));
			
		}
		
		
	}


