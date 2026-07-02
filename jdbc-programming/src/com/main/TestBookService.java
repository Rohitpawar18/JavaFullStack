package com.main;
import com.dao.BookDao;
import com.dao.BookDaoJdbcImpl;
import com.service.BookService;
import com.service.BookServiceImpl;

public class TestBookService {

	public static void main(String[] args) {
		
		BookDao dao = new BookDaoJdbcImpl();
		
		BookService service = new BookServiceImpl(dao);
		BookCLI cli = new BookCLI(service);
		cli.execute();
//		BookDao dao = new BookDaoCollectionImpl();
		
//		BookService service = new BookServiceImpl(dao);

//		service.save(new Book(101, "Wings Of Fire", "APJ Kalam", 700));
//		service.save(new Book(102, "Metamorphisis", "Frank Kafka", 230));
//		service.save(new Book(103, "Normal People", "Sally Rooney", 500));
		
//		System.out.println("Books : ");
//		for(Book b : service.list()) {
//			System.out.println(b);
//		}
//		
//		System.out.println("\nFind Book ISBN = 103 : ");
//		try {
//			System.out.println(service.find(103));
//		} catch (BookNotFoundException e) {
//			
//			e.printStackTrace();
//		}
//		
//		System.out.println("\nFind Book Between Price 200 - 550 : ");
//		for(Book b : service.findByPrice(200, 550)) {
//			System.out.println(b);
//		}
//		
//		System.out.println("\nDelete Book ISBN = 102 : ");
//		try {
//			service.delete(102);
//			System.out.println("Deleted Book Successfully!");
//		} catch (BookNotFoundException e) {
//			
//			e.printStackTrace();
//		}
		
//		service.listOrderByTitle().forEach(System.out::println);
	}

}
