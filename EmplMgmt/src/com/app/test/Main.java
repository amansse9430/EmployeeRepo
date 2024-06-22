package com.app.test;

public class Main {
	
	    public static void main(String[] args) {
	        // Create some employees
	        Employee emp1 = new Employee("Alice", 1);
	        Employee emp2 = new Employee("Bob", 2);

	        // Create an address
	        Address address = new Address("123 Main St", "Anytown");

	        // Add employees to the address
	        address.addEmployee(emp1);
	        address.addEmployee(emp2);

	        // Print the address with employees
	        System.out.println(address);

	        // Remove an employee
	        //address.removeEmployee(emp1);

	        // Print the address again
	       // System.out.println(address);
	    }
	}



