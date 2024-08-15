package main_app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import book_model.Book; 

public class MainAPP3_Libray {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Book[] books = new Book[10];
	
	public static void main(String[] args) throws IOException {
		String flag = "";
		do {
			Book book = getBookInfo();
			books[Book.getTotalBooks()-1] = book;
			System.out.print("Do you want to Enter another student? (yes/no) : ");
			flag = br.readLine();
			
		}while(flag.equalsIgnoreCase("yes"));
		display();
	}

	public static Book getBookInfo() throws IOException {
		
		System.out.print("Enter Book Title : " );
		String title = br.readLine();
		System.out.print("Enter Book Subtitle : ");
		String subtitle = br.readLine();
		
		Book book; 
		if(subtitle.isEmpty()) {
			book = new Book(title);  
		}else {
			book = new Book(title, subtitle);
		}
		return book;
	}

	public static void display() {
		System.out.println("Library Inventory: ");
		for(int i = 0; i < Book.getTotalBooks(); i++) {
			books[i].display();			
		}
		System.out.print("Total Number of Books: " + Book.getTotalBooks());
	}
}
