package dayfour.service;

import java.util.List;

import dayfour.entities.Book;

public interface BookService {

	Book getBookByID(int id);   //single entity
	List<Book>getAllBooks();    //To return all the books
	Long getBookCount();        //For the book count
	List<Book>getAuthorBooks(String author); 			//Get list of book based on author name
	List<Book>getBookByTitle(String title);            //Get list of book based on title
	List<Book>getBookByPrice(double low,double high);  //price range
	
}
