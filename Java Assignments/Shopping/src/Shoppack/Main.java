package Shoppack;


import java.util.ArrayList;
import java.util.Scanner;

import Prodpack.Product;
import ProductAccesspack.ProductAccess;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductAccess paob = new ProductAccess();
		
     //  int i=0;
		while(true){
			
			System.out.println("1. Add  a product");
			System.out.println("2. Get all products");
			System.out.println("3. Get a product by id");
			System.out.println("4. Get a product by name");
			System.out.println("5. Exit"); 
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch(choice){
			case 1:
			{
				System.out.println("Enter the product id:");
				int pid = sc.nextInt();
				System.out.println("Enter the product name");
				String pname = sc.next();
				System.out.println("enter the product price");
				int pprice = sc.nextInt();
				
				Product p = new Product(pid,pname,pprice);
				
				System.out.println(paob.addProduct(p)); 				
				break;
			
			}
			case 2: 
			{
				
				ArrayList<Product> plist= paob.getAllProducts();
				System.out.println();
				for (Product p:plist)
				{
					System.out.print(p);
				}
				System.out.println();
				
				break;
			}
			case 3:
			{
				System.out.println(" Enter the product id to be searched:");
				int id = sc.nextInt();
				Product product= paob.getAProductbyId(id);
				if (product!=null)
				{
				System.out.println("Product found");
				System.out.println(product);
				}
				else 
					System.out.println("Product not found ");
				break;
			}
			case 4:
			{
				 // equals() with strings 
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
