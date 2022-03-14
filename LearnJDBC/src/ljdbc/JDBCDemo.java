package ljdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
	// CONNECT
		String url = "jdbc:mysql://127.0.0.1:3306/employee_database";
		int rowsAffected = 0;
		try {
			//establishing connection object
			Connection conn = DriverManager.getConnection(url,"root","1593");
			
			// create a statement object to send to the database
			Statement statement = conn.createStatement();
			
			//EXECUTE the statement object
			// To query
			ResultSet resultSet =statement.executeQuery("select * from employee_tbl");
			//Process the result
			
						while (resultSet.next()) {
							System.out.println(resultSet.getString("name"));
						}	
			
			
			// to update record by inserting data
//			statement.executeUpdate("insert into employee_tbl(id,name,dept,salary) \r\n"
//					+ "values(800,'Juliet','Sales',5500);");
//			
//			System.out.println("Executed an Insert statement - rows affected: "+rowsAffected);
//			
			
//			// to delete record
//			statement.executeUpdate("DELETE  FROM employee_tbl");
//			System.out.println("Executed an DELETE statement - rows affected: "+rowsAffected);
//			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error while insertion");
		}
	}

}
