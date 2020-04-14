package com.cg.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	Address address;
	Employee()
	{
		System.out.println("Employee class");
	}
	
   
	public Address getAddress() {
		return address;
	}
    @Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	

	public void checkFunction()
	{
		System.out.println(address.grandchild());
		address.data();
		 employeeData();
	}
	public void employeeData()
	{
		System.out.println("employee function");
	}
	
	
}
