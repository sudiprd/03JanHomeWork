package practice.statementjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementExample {
	
	public static void main(String[] args) {
//		createEmployee();
//		updateEmployeebyEmailUsingId();
//		deleteEmployeeByID();
		readEmployeeDetails();
		
		
	}
	
	// -----------createMethod--------------------->
	public static void createEmployee() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stexample", "root","sudip@4879");
			Statement stmt = con.createStatement();
			
			String sqlinsert = "INSERT INTO stexample(employee_id, employee_name, email, salary,date_of_joining)"
					+ " VALUES(012,'sudip','sdipradhan@gmail.com', 60000, '2022-02-15' )";
			String sqlinsert1 = "INSERT INTO stexample(employee_id, employee_name, email, salary,date_of_joining)"
					+ " VALUES(011,'pradhan','pradhan123@gmail.com', 80000, '2022-02-27' )";
			String sqlinsert2 = "INSERT INTO stexample(employee_id, employee_name, email, salary,date_of_joining)"
					+ " VALUES(010,'pratap','pratap813@yahoo.com', 90000, '2022-02-15' )";
			
			int executeUpdate = stmt.executeUpdate(sqlinsert2);
			if(executeUpdate == 1) {
				System.out.println("Employee data has created in MySql Database.");
			}
		}
		catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
	}
	
	//-------------update_method-------------------------->
	public static void updateEmployeebyEmailUsingId() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stexample", "root", "sudip@4879");
			
			Statement stmt = con.createStatement();
			
			String sqlinsert = "UPDATE stexample set email= 'regmi1243@yahoo.com' WHERE employee_id = 010";
			
			int executeUpdate = stmt.executeUpdate(sqlinsert);
			if(executeUpdate == 1) {
				System.out.println("Employee data has updated in MySql Database.");
			}
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	// delete_method----------------------->
	public static void deleteEmployeeByID() {
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stexample", "root", "sudip@4879");
				
				Statement stmt = con.createStatement();
				
				String sqlinsert = "DELETE from stexample WHERE employee_id = 010";
				
				int executeUpdate = stmt.executeUpdate(sqlinsert);
				if(executeUpdate == 1) {
					System.out.println("Employee data has deleted in MySql Database.");
				}
			}catch(ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
	//-------------read_method------------------------->
	public static void readEmployeeDetails() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stexample", "root", "sudip@4879");
			
			Statement stmt = con.createStatement();
			
			ResultSet res = stmt.executeQuery("select * from stexample");
			
			while(res.next()) {
			System.out.println(res.getInt(1)+ " "
					+ res.getString(2) +" "
					+ res.getString(3)+ " "
					+ res.getDouble(4)+ " "
					+ res.getDate(5));
			}
		
		}	
			catch(ClassNotFoundException | SQLException e) {	
			e.printStackTrace();
		}
	}


}
