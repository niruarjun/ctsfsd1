package task;

public class person {
private String name;
private double phone;
private Address address;

public person() {
	this("john");
	System.out.println("default");
	
}

public person(String name) {
	this(name,new Address("dsf", "gsydg",3456));
	
	System.out.println("one");
}


public person(String name, Address address) {
	
	this(name,349,address);
	System.out.println("two");
}

public person(String name, double phone, Address address) {
	
	this.name = name;
	this.phone = phone;
	this.address = address;
	System.out.println("three");
}

@Override
public String toString() {
	return "person [name=" + name + ", phone=" + phone + ", address=" + address + "]";
}

}
