package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Book;

public class BookDAOImpl implements BookDAOInterface {

	Connection con = DataManager.getConnect();


	@Override
	public ArrayList<Book> getAllBooks(){
		ArrayList<Book> bList = new ArrayList<Book>();
		try {
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select * from book");
		
		while(rs.next())
		{
			Book book = new Book(rs.getInt(1), rs.getString(2), rs.getInt(3));
			bList.add(book);
		}
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		return bList;
		
	}


	@Override
	public String addBook(Book book) {

		String sql = "insert into book value(?,?,?)";
		PreparedStatement ps;
		int res = 0;
		try {
		ps = con.prepareStatement(sql);
		ps.setInt(1, book.getbId());
		ps.setString(2,book.getbName());
		ps.setInt(3,book.getbPrice());
		
		res = ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		if(res!=1)
		
			return ("Insertion failed");
		
		else
		
			return ("Row inserted successfully");
		
	
	}


	@Override
	public boolean updatePrice(int bid, int bprice) {

		String query = "update book set bprice=? where bookid=?";
		PreparedStatement ps;
		boolean flag = false;
		int res = 0;
		try {
			ps = con.prepareStatement(query);
			ps.setInt(1, bprice);
			ps.setInt(2, bid);
			
			res = ps.executeUpdate();
			}
		
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		if(res==1)
			flag = true;
		
		return flag;
		
		
	}


	@Override
	public Book searchBookbyName(String bname) {

		Statement st;
		Book book = null;
		String query = "select * from book where bname='"+bname+"'";
		try {
		st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while(rs.next())
		{
			book = new Book(rs.getInt(1), rs.getString(2), rs.getInt(3));
		}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return book;
	}
		}

	

