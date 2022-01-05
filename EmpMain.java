package practice.preparedstatement.jdbc;

public class EmpMain {

	public static void main(String[] args) {
		
		
		
		EmployeeInterface emi = new EmployeeImplement();
		
		Employee emp1 = new Employee(01, "sudip","sudip@gmail.com", 50000.00);
		
		
		
		
		emi.updateEmployeebySalarylUsingId(45000.00, 4);

	}

}
