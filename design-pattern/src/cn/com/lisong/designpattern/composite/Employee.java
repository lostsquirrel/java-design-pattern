package cn.com.lisong.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String name;
	private String dept;
	private int salary;
	private List<Employee> subordinates;
	public Employee(String name, String dept, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.subordinates = new ArrayList<Employee>();
	}
	
	public void addSubordinate(Employee e) {
		this.subordinates.add(e);
	}
	
	public void removeSubordinate(Employee e) {
		this.subordinates.remove(e);
	}
	
	public List<Employee> getSubordinates() {
		return this.subordinates;
	}

	@Override
	public String toString() {
		return "Employee [name: " + name + ", dept: " + dept + ", salary: "
				+ salary + "]";
	}
}
