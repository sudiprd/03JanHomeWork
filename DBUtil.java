package practice.preparedstatement.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static final String DB_DRIVER_CLASS = "com.mysql.jdbc.Driver";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "sudip@4879";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/stexample";
	
	
	private static Connection connection = null;
	
	static {
		try {
			Class.forName(DB_DRIVER_CLASS);
			connection = DriverManager.getConnection(DB_URL);
			
		}catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
			
		}
		
	}
	public static Connection getConnection() {
		return connection;
	}
}
