package practice.preparedstatement.jdbc;

public class Employee {
	private int emp_no;
	private String emp_name;
	private String email;
	private Double salary;
	
	public Employee() {
		
	}
	@Override
	public String toString() {
		return "Employee [emp_no=" + emp_no + ", emp_name=" + emp_name + ", email=" + email + ", salary=" + salary
				+ "]";
	}
	public Employee(int emp_no, String emp_name, String email, Double salary) {
		super();
		this.emp_no = emp_no;
		this.emp_name = emp_name;
		this.email = email;
		this.salary = salary;
	
	}
	
	public int getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	public String getEmployee_name() {
		return emp_name;
	}

	public void setEmployee_name(String employee_name) {
		this.emp_name = employee_name;
	}

	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
}
