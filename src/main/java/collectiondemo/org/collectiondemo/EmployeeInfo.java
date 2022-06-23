package collectiondemo.org.collectiondemo;

public class EmployeeInfo {

	private int id;//attribute
	private String name;
	private int age;
	private double salary;

	public int getId() {//get and setmethod
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	//tostring()
	@Override
	public String toString() {
		return "EmployeeInfo [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}


}



