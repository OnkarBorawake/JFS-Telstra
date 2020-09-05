
		package viewpack;
		import java.util.ArrayList;
		import java.util.Scanner;

import data.BookDAOImpl;
import model.Book;

		public class Main {

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				BookDAOImpl ob = new BookDAOImpl();
		     //  int i=0;
				while(true){
					
					System.out.println("1. Add  a book");
					System.out.println("2. Get all books");
					System.out.println("3. Update a book price by id");
					System.out.println("4. Get a book by name");
					System.out.println("5. Exit"); 
					System.out.println("Enter your choice");
					int choice = sc.nextInt();
					switch(choice){
					case 1:
					{
						System.out.println("Enter the book id:");
						int bid = sc.nextInt();
						System.out.println("Enter the book name");
						String bname = sc.next();
						System.out.println("enter the book price");
						int bprice = sc.nextInt();
						
						Book book = new Book(bid,bname,bprice);
						
						System.out.println(ob.addBook(book)); 				
						break;
					
					}
					case 2: 
					{
						
						ArrayList<Book> bList= ob.getAllBooks();
						System.out.println();
						for (Book b:bList)
						{
							System.out.print(b);
						}
						System.out.println();
						
						break;
					}
					case 3:
					{
						System.out.println(" Enter the book id to be updated:");
						int bid = sc.nextInt();
						System.out.println(" Enter the updated price:");
						int bprice = sc.nextInt();
						boolean flag = ob.updatePrice(bid, bprice);
						if(ob.updatePrice(bid, bprice))
							System.out.println("Book price updated");
						else
							System.out.println("No updation");
						break;
					}
					case 4:
					{
						System.out.println(" Enter the book name to be searched:");
						String bname = sc.next();
						
						Book book = ob.searchBookbyName(bname);
						if(book != null)
						{
							System.out.println("Book found");
							System.out.println(book);
						}
						else
							System.out.println("Book not found");
						
						break;
					}
				
					case 5:
					{	
						sc.close();
						System.exit(0);
					}
					
				}
				
			}
			
			

			}

		}

