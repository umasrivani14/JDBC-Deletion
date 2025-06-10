package deletion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class staticdeletedb {
public static void main(String[] args) {
		
		
		// 1. loading db
		// 2. creating connection
		// 3. creating statements: 2 ways
		// 4. execute statements
		// 5. close
		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");
			
			String sql= "drop database vani";
			PreparedStatement pmst =conn.prepareStatement(sql);
		    pmst.executeUpdate();
		    System.out.println("deleted successfully");
			
			conn.close();
			pmst.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}



