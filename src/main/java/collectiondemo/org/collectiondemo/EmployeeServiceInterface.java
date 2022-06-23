package collectiondemo.org.collectiondemo;

import java.util.List;

public interface EmployeeServiceInterface  {
	
	public String addEmployee(EmployeeInfo ef);
	public String deleteEmployee(int id);
	public EmployeeInfo searchEmployee(int id);
	public String updateEmployee(EmployeeInfo ef);
	public List diplayListEmployee();
	

	
}
