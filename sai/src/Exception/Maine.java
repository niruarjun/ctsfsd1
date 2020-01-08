package Exception;

import java.util.UUID;

public class Maine {
	public static void main(String[] args)throws EmployeeNotCreated
	{
		Employee em=new Employee(UUID.randomUUID().toString(),"john","nand",4);
		em.createEmployee(1);
		System.out.println(em);
	}

}
