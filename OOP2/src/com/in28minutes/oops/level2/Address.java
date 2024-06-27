package com.in28minutes.oops.level2;

public class Address {
	private String line1;
	private String city;
	private String state;
	private String zip;

	// creation
	public Address(String line1, String city, String state, String zip) {
		super();
		this.line1 = line1;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return line1 + " " + city + ", " + state + " " + zip;
	}
}
