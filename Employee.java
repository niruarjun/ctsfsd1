package Thread1;

import java.util.Date;
import java.util.Comparator;

public class Employee implements Comparable<Employee> {
	 static int count;
	private int id;
	private String name;
	private String department;
	private Date dateOfJoining;
	private int age;
	private int salary;
	public Employee( String name, String department, Date dateOfJoining, int age, int salary) {
		super();
		id=++count;
		this.id = id;
		this.name = name;
		this.department = department;
		this.dateOfJoining = dateOfJoining;
		this.age = age;
		this.salary = salary;
	}
	public int getId() {
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", dateOfJoining="
				+ dateOfJoining + ", age=" + age + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		Employee e= (Employee)o;
		int result=0;
		if(this.getSalary()>e.getSalary())
		{
			result=1;
		}
		if(this.getSalary()<e.getSalary())
		{
			result=1;
			
		}
		if(this.getSalary()==e.getSalary())
		{
			result=0;
		}
		return result;
		
		
	}
	}
	
	
	



