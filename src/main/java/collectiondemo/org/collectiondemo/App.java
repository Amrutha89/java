package collectiondemo.org.collectiondemo;

import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		int choice;
		int ch;
		Scanner s=new Scanner(System.in);
		EmployeeService es =new EmployeeService();
		EmployeeInfo ei;
		do
		{
			System.out.println("Press 1 to add record");
			System.out.println("Press 2 to delete record");
			System.out.println("Press 3 to search record");
			System.out.println("Press 4 to displaylist of Employees");
			System.out.println("Press 5 to update record");
			choice =s.nextInt();
			switch(choice)
			{
			case 1:
				ei=new EmployeeInfo();
				System.out.println("Enter Id ,Name ,age and salary of Employee");
				ei.setId(s.nextInt());
				ei.setName(s.next());
				ei.setAge(s.nextInt());
				ei.setSalary(s.nextDouble());
				String msg=es.addEmployee(ei);
				System.out.println(msg);
				break;
			case 2:
				int tempId;
				System.out.println("Enter the id to delete record");
				tempId=s.nextInt();
				String dmsg=es.deleteEmployee(tempId);
				System.out.println(dmsg);
				break;
			case 3:
				int serchId;
				System.out.println("Enter the id to delete record");
				serchId=s.nextInt();
				EmployeeInfo se=es.searchEmployee(serchId);
				System.out.println(se);
				break;

			case 4:
				List<EmployeeInfo> emplist=es.diplayListEmployee();
				for(EmployeeInfo e:emplist)
				{
					System.out.println(e.getId()+e.getName()+e.getSalary()+e.getAge());
				}

				break;

			}


			System.out.println("Press any key to exit or 0  to continue");
			ch=s.nextInt();
		}while(ch==0);
	}
}
