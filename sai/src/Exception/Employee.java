package Exception;

import java.util.UUID;

public class Employee {
	String empId;
	String name;
	String address;
	int amount;
	private Employee em=null;
	

	public Employee() {
		super();
	}



	public Employee(String empId, String name, String address, int amount) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.amount = amount;
	}



	public String getEmpId() {
		return empId;
	}



	public void setEmpId(String empId) {
		this.empId = empId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public int getAmount() {
		return amount;
	}



	public void setAmount(int amount) {
		this.amount = amount;
	}



	public Employee createEmployee(int amount)throws EmployeeNotCreated
	{
		Employee em=new Employee(UUID.randomUUID().toString(),"nir","ndl",amount);
		if(em.getAmount()<=2)
		{
			throw new EmployeeNotCreated("not Eligible");
		}
		return em;	
			
		
			
	}



	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + ", amount=" + amount + "]";
	}
}
	
		
    

