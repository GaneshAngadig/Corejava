package com.xworkz.LibraryApp.dto.libraryimpl;

import com.xworkz.LibraryApp.Library.LibraryApp;
import com.xworkz.LibraryApp.dto.BookDTO;

public class LibraryImpl implements LibraryApp {
	BookDTO bookDTO[];
	int index;
	
	public LibraryImpl(int size) {
		bookDTO=new BookDTO[size];
		
	}

	@Override
	public boolean createBookDetails(BookDTO dto) {
		{
			System.out.println("invoked createBookDetails()");
			boolean bookAdded=false;
			try {
			if(dto != null) {
				bookDTO[index++]=dto;
				bookAdded=true;
			}
			else {
				System.out.println("no book found");
			}
			System.out.println("end of createBookDetails()");
			}catch (Exception e) {
				System.out.println();
			}
			return bookAdded;
		}
	}

	@Override
	public void getAllBookDetails() {
		{
			try {
			for (int i = 0; i < bookDTO.length; i++) {
				System.out.println(bookDTO[i]);
			}
			}catch (Exception e) {
				System.out.println();
			}
		}
	}

	@Override
	public boolean updateAdditionByAuthor(String authorName, String bookAddition) {
		
			boolean isBookAdditionUpdated=false;
			try {
			for (int i = 0; i < bookDTO.length; i++) {
				
				if(bookDTO[i].getBookAuthorName().equals(authorName)) {
					bookDTO[i].setBookAddition(bookAddition);
					isBookAdditionUpdated=true;
					System.out.println(bookDTO[i]);
				}
				else {
					System.out.println("book addition is no updated");
				}
			}
			}
			catch (Exception e) {
			System.out.println();
			}
			
		
		return isBookAdditionUpdated ;
		
	}

	@Override
	public boolean deleteBookDetailsByName(String bookName) {
		
			boolean delete=false;
			try {
				for (int i = 0; i < bookDTO.length; i++) {
					if(bookDTO[i].getBookName().equals(bookName)) {
						bookDTO[i]=null;
						System.out.println("book ddetails are deleted");
						delete=true;
					}
					else {
						System.out.println("book ddetails are not deleted");
					}
				}
			}
			catch (Exception e) {
				System.out.println();
			}
			return delete;
		}
	}
	


