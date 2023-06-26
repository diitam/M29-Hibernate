package dayfour.client;

import dayfour.service.BookService;
import dayfour.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {
		BookService service=new BookServiceImpl();
		System.out.println("Book with specific id: ");
		System.out.println(service.getBookByID(101));
		System.out.println("Book with specific author: ");
		System.out.println(service.getAuthorBooks("Nancy"));
		System.out.println("Book with specific Title: ");
		System.out.println(service.getBookByTitle("AI"));
		System.out.println("Get Book Count: ");
		System.out.println(service.getBookCount());
		System.out.println("Book withprice range ");
		System.out.println(service.getBookByPrice(300, 500));
		

	}

}
