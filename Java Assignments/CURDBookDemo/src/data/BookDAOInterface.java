package data;

import model.Book;
import java.util.*;

public interface BookDAOInterface {

	ArrayList<Book> getAllBooks();
	String addBook(Book book);
	boolean updatePrice(int bid,int bprice);
	Book searchBookbyName(String bname);

}
