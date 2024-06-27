package com.in28minutes.oops.level2;

public class Customer {
	
	// state
	private String name;
	private Address homeAddress;
	private Address workAddress;

	//create
	public Customer(String name, Address homeAddress) {

		this.setName(name);
		this.setHomeAddress(homeAddress);
	}

	// operations
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}
	
	@Override
	public String toString() {

		return String.format("name - [%s] home address - [%s] work address - [%s])", name, homeAddress, workAddress);
	}
}
