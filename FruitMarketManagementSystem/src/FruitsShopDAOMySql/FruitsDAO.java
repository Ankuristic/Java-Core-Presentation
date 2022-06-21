package FruitsShopDAOMySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import FruitsJdbcConnection.FruitsShopJdbcConnection;
import OnlineFruitShop.dto.Fruits;


public class FruitsDAO {
	
	
	public static boolean addFruits(Fruits f)
	{
		boolean f1 = false;
		try {
			
			// jdbc code...
			Connection con =FruitsShopJdbcConnection.createDatabase();
			String q = "insert into fruit(fruitid,fruitname,price,description) values(?,?,?,?)";
			
			//prepared stmt
			PreparedStatement pst = con.prepareStatement(q);
			
			//set the values of parameters
			pst.setInt(1, f.getFruidid());
			pst.setString(2, f.getFruitname());
			pst.setInt(3, f.getPrice());
			pst.setString(4, f.getDescription());

			
			//execute
			pst.executeUpdate();
			f1=true;
			
			
		} catch(Exception e)
		{
			e.printStackTrace();
		}
		return f1;
		
	}


	
	
public static boolean deleteFruit(int fruidid) {
	// TODO Auto-generated method stub
	boolean f1 = false;
	try {
		
		// jdbc code...
		Connection con = FruitsShopJdbcConnection.createDatabase();
		String q = "delete from fruit where fruitid=?";	
		//prepared stmt
		PreparedStatement pst = con.prepareStatement(q);
		
		//set the values of parameters
		pst.setInt(1,fruidid);
		
		//execute
		pst.executeUpdate();
		f1=true;
		
		
	} catch(Exception e)
	{
		e.printStackTrace();
	}
	return f1;
}

public static void showAllFruits() {
	// TODO Auto-generated method stub
	boolean f = false;
	try {
		
		// jdbc code...
		Connection con = FruitsShopJdbcConnection.createDatabase();
		String q = "select * from fruit;";
		PreparedStatement pst =con.prepareStatement(q);
		
		
		// stmt
		pst.executeQuery(q);
		ResultSet set = pst.executeQuery(q);
		
		while(set.next())
		{
			int fruitid = set.getInt(1);
			String fruitname = set.getString(2);
			int price  = set.getInt(3);
			String description =set.getString(4);
			
			System.out.println("ID : "+ fruitid);
			System.out.println("NAME : "+fruitname);
			System.out.println("PRICE : "+price);
			System.out.println("DESCRIPTION : "+description);
		}
		
		
	} catch(Exception e)
	{
		e.printStackTrace();
	}
	
	
}

public static boolean updateFruits(Fruits f) {
	boolean f1 = false;
	try {
		Connection con = FruitsShopJdbcConnection.createDatabase();
		String q="update fruit set fruitname= ? where fruitid= ?";


		PreparedStatement pst = con.prepareStatement(q);
		
		pst.setString(1, f.getFruitname());
		pst.setInt(2, f.getFruidid());
		pst.executeUpdate();
		
        f1=true;
		
		
	} catch(SQLException  e)
	{
		e.printStackTrace();
	}
	return f1;
		

	}

}


