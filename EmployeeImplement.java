package practice.preparedstatement.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeImplement implements EmployeeInterface {

	@Override
	public void createEmployeeDetails(Employee emp) {
		
		String insert= "INSERT INTO stexample (emp_no, emp_name, email, salary)"+ "VALUE(?,?,?,?)";
		try {
					
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stexample", "root","sudip@4879");
					
			PreparedStatement pstmt = con.prepareStatement(insert);
					
					
				pstmt.setInt(1,emp.getEmp_no());
				pstmt.setString(2,emp.getEmployee_name());
				pstmt.setString(3,emp.getEmail());
				pstmt.setDouble(4, emp.getSalary());
				
				int executeUpdate =  pstmt.executeUpdate();
				if(executeUpdate == 1) {
					System.out.println("Data has added in Sql Database");
				}
			}
			catch(ClassNotFoundException | SQLException e){
					e.printStackTrace();
		}
		
	}

//	public Employee getEmployeeDetails(Integer empId) {
//		
//		Employee em= null;
//		
//		String read= "SELECT * from stexample WHERE emp_no=?";
//		try {
//					
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stexample", "root","sudip@4879");
//					
//			PreparedStatement pstmt = con.prepareStatement(read);
//					
//				ResultSet rs= pstmt.executeQuery();
//				while(rs.next()) {
//					int eNo= rs.getInt("emp_no");
//					String eName= rs.getString("emp_name");
//					String email= rs.getString("email");
//					Double salary= rs.getDouble("salary");
//					
//					System.out.println(eNo + "\t" + eName + "\t" + email+ "\t" + salary + "\t");
//				}
//			}
//			catch(ClassNotFoundException | SQLException e){
//					e.printStackTrace();
//		}
//	}

	@Override
	public void deleteEmployeeById(Integer empId) {
		String delete= "DELETE FROM stexample WHERE emp_no= ?;";
		try {
					
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stexample", "root","sudip@4879");
					
			PreparedStatement pstmt = con.prepareStatement(delete);
				
				
				pstmt.setInt(1, empId);
				
				int executeUpdate =  pstmt.executeUpdate();
				if(executeUpdate == 1) {
					System.out.println("Requested Data has delete in Sql Database");
				}
			}
			catch(ClassNotFoundException | SQLException e){
					e.printStackTrace();
		}
		
	}

	@Override
	public List<Employee> getemplist() {
	List<Employee> emplist = new ArrayList<>();
	
		String read= "SELECT * FROM stexample";
		try {
					
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stexample", "root","sudip@4879");
					
			PreparedStatement pstmt = con.prepareStatement(read);
					
				ResultSet rs= pstmt.executeQuery();

				while(rs.next()) {
					int eNo= rs.getInt("emp_no");
					String eName= rs.getString("emp_name");
					String email= rs.getString("email");
					Double salary= rs.getDouble("salary");
					
//					System.out.println(eNo + "\t" + eName + "\t" + email+ "\t" + salary + "\t");
					Employee emp = new Employee();
					emp.setEmp_no(eNo);
					emp.setEmployee_name(eName);
					emp.setEmail(email);
					emp.setSalary(salary);
					
					emplist.add(emp);
				}
			}
			catch(ClassNotFoundException | SQLException e){
					e.printStackTrace();
		}
		return emplist;
	}


	@Override
	public Employee getEmployeeById(Integer empId) {
		// TODO Auto-generated method stub
		String read= "SELECT * from stexample WHERE emp_no=?";
		try {
					
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stexample", "root","sudip@4879");
					
			PreparedStatement pstmt = con.prepareStatement(read);
					
				ResultSet rs= pstmt.executeQuery();
				while(rs.next()) {
					int eNo= rs.getInt("emp_no");
					String eName= rs.getString("emp_name");
					String email= rs.getString("email");
					Double salary= rs.getDouble("salary");
					
					System.out.println(eNo + "\t" + eName + "\t" + email+ "\t" + salary + "\t");
				}
			}
			catch(ClassNotFoundException | SQLException e){
					e.printStackTrace();
		}
		return null;
	}


	@Override
	public void updateEmployeebySalarylUsingId(Double Salary, Integer empId) {
		// TODO Auto-generated method stub
		String update= "UPDATE stexample set salary= ? WHERE emp_no= ?;";
		try {
					
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stexample", "root","sudip@4879");
					
			PreparedStatement pstmt = con.prepareStatement(update);
				
				 
				pstmt.setDouble(1, Salary);
				pstmt.setInt(2, empId);
				
				
				int executeUpdate =  pstmt.executeUpdate();
				if(executeUpdate == 1) {
					System.out.println("Data has updated in Sql Database");
				}
			}
			catch(ClassNotFoundException | SQLException e){
					e.printStackTrace();
		}
		
	}



}
