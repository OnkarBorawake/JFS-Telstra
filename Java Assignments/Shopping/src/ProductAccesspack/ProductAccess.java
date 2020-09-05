package ProductAccesspack;



import java.util.ArrayList;

import Prodpack.Product;


public class ProductAccess implements ProductAccessInterface {
  // resource is arraylist 
	public ArrayList<Product>  alist = new ArrayList<Product>();
	 
	@Override
	public String addProduct(Product prod) {
		
		alist.add(prod);
		
		return "Product added successfully";
	}

	@Override
	public ArrayList<Product> getAllProducts() {
		//System.out.println(alist);
		
		return alist;
	}

	@Override
	public Product getAProductbyId(int id) {
		Product temp=null;
		for (Product p:alist)  // enhanced for loop 
		{
			if (p.getpId()==id)
			{	
				temp =p;
				break;
			}
		}
		
		return temp;
	}

	@Override
	public Product getAPrdouctbyName() {
		// TODO Auto-generated method stub
		return null;
	}


	

}
