package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataManager {

	private  static Connection con;
	public static Connection getConnect()
	{
		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/telstra_database","root","root");
			} 
			catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return con;
	}
}
