package com.main;

import java.util.Scanner;

import com.pojo.Book;
import com.service.BookNotFoundException;
import com.service.BookService;

public class BookCLI {
	private BookService service;
    private Scanner sc;

    public BookCLI(BookService service) {
        this.service = service;
        sc = new Scanner(System.in);
    }
    
    public void execute() {
    	while(true) {
    		showMenu();

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

	            case 1:
	                addBook();
	                break;
	
	            case 2:
	                showBooks();
	                break;
	
	            case 3:
	                findBook();
	                break;
	
	            case 4:
	                findBookByPrice();
	                break;

	            case 5:
	                deleteBook();
	                break;
	
	            case 0:
	                System.out.println("Thank You...");
	                sc.close();
	                return;
	
	            default:
	                System.out.println("Invalid Choice...");
            }
    	}     
    }
    
    private void showMenu() {

        System.out.println("\n==============================");
        System.out.println("   BOOK MANAGEMENT SYSTEM");
        System.out.println("==============================");
        System.out.println("1. Add Book");
        System.out.println("2. Show Books");
        System.out.println("3. Find Book");
        System.out.println("4. Find Books By Price");
        System.out.println("5. Delete Book");
        System.out.println("0. Exit");
        System.out.print("Enter Choice : ");
    }
    
    private void addBook() {

        System.out.print("Enter ISBN : ");
        int isbn = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Title : ");
        String title = sc.nextLine();

        System.out.print("Enter Author : ");
        String author = sc.nextLine();

        System.out.print("Enter Price : ");
        double price = sc.nextDouble();

        service.save(new Book(isbn, title, author, price));

        System.out.println("Book Added Successfully.");

    }

    private void showBooks() {

        System.out.println("\n----- Book List -----");

        for (Book b : service.list()) {
            System.out.println(b);
        }

    }
    
    private void findBook() {

        System.out.print("Enter ISBN : ");

        int isbn = sc.nextInt();

        try {

            Book book = service.find(isbn);

            System.out.println(book);

        } catch (BookNotFoundException e) {

            System.out.println(e.getMessage());

        }

    }
    
    private void findBookByPrice() {

        System.out.print("Enter Minimum Price : ");
        double min = sc.nextDouble();

        System.out.print("Enter Maximum Price : ");
        double max = sc.nextDouble();

        System.out.println("\nBooks Found:");

        for (Book b : service.findByPrice(min, max)) {
            System.out.println(b);
        }

    }
    
    private void deleteBook() {

        System.out.print("Enter ISBN : ");

        int isbn = sc.nextInt();

        try {

            service.delete(isbn);

            System.out.println("Book Deleted Successfully.");

        } catch (BookNotFoundException e) {

            System.out.println(e.getMessage());

        }

    }
    
}
