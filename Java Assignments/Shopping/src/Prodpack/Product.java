package Prodpack;



public class Product {
 private final int pId;
 private String pName;
 private int pPrice;  // double
 
 
public Product(int pId, String pName, int pPrice) {
	super();
	this.pId = pId;
	this.pName = pName;
	this.pPrice = pPrice;
}


@Override
public String toString() {
	return "Product [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice
			+ "]";
}
// Getters are added 


public int getpId() {
	return pId;
}


public String getpName() {
	return pName;
}


public int getpPrice() {
	return pPrice;
}






 
}
