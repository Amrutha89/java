package collectiondemo.org.collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements  EmployeeServiceInterface {//unimplimenteds () just clicking

	public ArrayList<EmployeeInfo> empList=new ArrayList<EmployeeInfo>();

	public String addEmployee(EmployeeInfo ef) {
		if(ef instanceof EmployeeInfo) {

			empList.add(ef);
			System.out.println(empList);
			return "Employee Record Added Succefully";
		}
		else

			return "Please add only employee object";
	}

	public String deleteEmployee(int id) {
		for(EmployeeInfo e:empList)
		{
			if(e.getId()==id)
			{
				empList.remove(e);
				return "Record Deleted";
			}
		}
		return "Record Not found";
	}

	public EmployeeInfo searchEmployee(int id) {
		EmployeeInfo temp=null;
		for(EmployeeInfo e:empList)
		{
			if(e.getId()==id)
			{
				temp=e;
				return temp;
			}
		}

		return temp;
	}

	public String updateEmployee(EmployeeInfo ef) {
		// TODO Auto-generated method stub
		return null;
	}

	public List diplayListEmployee() {
		return empList;
	}


}
