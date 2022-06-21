package FruitsJdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class FruitsShopJdbcConnection {
	public static	Connection con;
	public static Connection createDatabase() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Jdeveloper","root","1234");
			 
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}

}


