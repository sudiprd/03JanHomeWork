package practice.preparedstatement.jdbc;

import java.util.List;



public interface EmployeeInterface {
	
	public abstract void createEmployeeDetails(Employee emp);
	public abstract Employee getEmployeeById(Integer empId);
	public abstract void updateEmployeebySalarylUsingId(Double Salary, Integer empId);
	public abstract void deleteEmployeeById(Integer empId);
	public abstract List<Employee> getemplist();
}
