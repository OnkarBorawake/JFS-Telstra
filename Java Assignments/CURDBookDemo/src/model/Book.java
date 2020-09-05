package model;

public class Book {

	private int bId;
	private String bName;
	private int bPrice;
	public Book(int bId, String bName, int bPrice) {
		super();
		this.bId = bId;
		this.bName = bName;
		this.bPrice = bPrice;
	}
	public int getbId() {
		return bId;
	}
	public String getbName() {
		return bName;
	}
	public int getbPrice() {
		return bPrice;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public void setbPrice(int bPrice) {
		this.bPrice = bPrice;
	}
	@Override
	public String toString() {
		return "Book [bId=" + bId + ", bName=" + bName + ", bPrice=" + bPrice + "]";
	}
	
	
}
