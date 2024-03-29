package com.Oops.basic;

public class Employee {

	String employeeName;
	int employeeId;
	double salary;

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.employeeName ="farhan";
		employee.employeeId =12;
		employee.salary =2000;
		System.out.println("Name "+ employee.employeeName );
		System.out.println("Id "+ employee.employeeId );
		System.out.println("Id "+ employee.salary );
		
	}

}
