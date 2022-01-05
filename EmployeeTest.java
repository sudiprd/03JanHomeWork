package practice.preparedstatement.jdbc;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee(01, "sudip","sudip@gmail.com", 50000.00);
		Employee emp2 = new Employee(02, "pradhan","pradhan@yahoo.com", 60000.00);
		Employee emp3 = new Employee(03, "rajan","rajan@hotmail.com", 87000.00);
		Employee emp4 = new Employee(04, "Suresh","suresh@yahoo.com", 20000.00);
		Employee emp5 = new Employee(05, "Aashish","ashish@gmail.com", 70000.00);
		
		List<Employee> emplist = new ArrayList<Employee>();
		
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		emplist.add(emp4);
		emplist.add(emp5);
		
		EmployeeInterface emi = new EmployeeImplement();
		
//		for(Employee employee :emplist) {
//			emi.createEmployeeDetails(employee);
//		}
		
		//updateElements
//		 emi.updateEmployeebySalarylUsingId(45000.0, 4);
		
		 //Delete the elements
		 
		 emi.deleteEmployeeById(2);
		 
		 //ShowAllList
		 List<Employee> emplist1 = emi.getemplist();
		 emplist1.forEach(System.out::println);
		 
	}

}
