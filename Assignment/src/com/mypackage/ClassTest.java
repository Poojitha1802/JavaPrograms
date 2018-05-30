package com.mypackage;

public class ClassTest {
public static void main(String[] args) {
	//Creating an object for Class Employee
	Employee e1=new Employee();
	e1.setEmployeeId(10);
	e1.setEmployeeName("Bindu");
	e1.setSalary(10000);
	
	System.out.println(e1.getEmployeeId());
	System.out.println(e1.getEmployeeName());
	System.out.println(e1.getSalary());
	
	//Creating an object for Class Employee
	Employee e2=new Employee();
	e2.setEmployeeId(20);
	e2.setEmployeeName("Sahaja");
	e2.setSalary(20000);
	
	System.out.println(e2.getEmployeeId());
	System.out.println(e2.getEmployeeName());
	System.out.println(e2.getSalary());
	
}
}


class Employee{
	//Class with Constructors, Getters and Setters
	
	//Constructor
	Employee(){
		System.out.println("Inside Employee constructor");
	}
	
	//Instance variables
	private int employeeId;
	private String employeeName;
	private int salary;
	
	//Methods
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}