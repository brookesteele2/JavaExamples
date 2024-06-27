package com.in28minutes.oops.level2;

public class CustomerRunner {

	public static void main(String[] args) {
		Address homeAddress = new Address("123 test", "Macon", "GA", "31217");
		Customer customer = new Customer("Ranga", homeAddress);

		Address workAddress = new Address("123 work st", "Macon", "GA", "31217");
		customer.setWorkAddress(workAddress);

		System.out.println(customer);
	}

}
