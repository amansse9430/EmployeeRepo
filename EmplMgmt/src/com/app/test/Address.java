package com.app.test;

import java.util.ArrayList;
import java.util.List;


	public class Address {
	    private String street;
	    private String city;
	    private List<Employee> employees;

	    // Constructor
	    public Address(String street, String city) {
	        this.street = street;
	        this.city = city;
	        this.employees = new ArrayList<>();
	    }

	    // Method to add an employee to the address
	    public void addEmployee(Employee employee) {
	        this.employees.add(employee);
	    }

	    // Method to remove an employee from the address
	    public void removeEmployee(Employee employee) {
	        this.employees.remove(employee);
	    }

	    // Method to get the list of employees
	    public List<Employee> getEmployees() {
	        return employees;
	    }

	    // Getters and Setters for street and city
	    public String getStreet() {
	        return street;
	    }

	    public void setStreet(String street) {
	        this.street = street;
	    }

	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    // toString method for easy printing
	    @Override
	    public String toString() {
	        return "Address{street='" + street + "', city='" + city + "', employees=" + employees + "}";
	    }
	}



