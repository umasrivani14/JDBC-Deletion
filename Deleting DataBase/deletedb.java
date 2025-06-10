package deletion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class deletedb {
	public static void main(String[] args) {
		
		
		// 1. loading db
		// 2. creating connection
		// 3. creating statements: 2 ways
		// 4. execute statements
		// 5. close
		
		
		try {
			Scanner src=new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");
			System.out.println("enter db to be deleted:");
			String sql= "drop database "+src.next();
			PreparedStatement pmst =conn.prepareStatement(sql);
			int i= pmst.executeUpdate();
			if(i==0) {
				System.out.println("db deleted");
			}
			else {
				System.out.println("db not deleted");
			}
			conn.close();
			pmst.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
