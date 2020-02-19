package Aiub.Lab5;

public class Employee {
	 private String name;
	 private String id;
	 private double salary;
	 
	 
	 
	 
	public Employee() {
	
	}


	public Employee(String name, String id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	 
	 

}
