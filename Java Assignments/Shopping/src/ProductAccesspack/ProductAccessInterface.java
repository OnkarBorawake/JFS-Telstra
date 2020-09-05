package ProductAccesspack;


import java.util.ArrayList;

import Prodpack.Product;

// Client contract
public interface ProductAccessInterface {
	
	 String addProduct(Product prod);
	 ArrayList<Product>  getAllProducts();
	 Product getAProductbyId(int id);
	 Product getAPrdouctbyName();
	 

}

