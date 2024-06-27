package com.in28minutes.oops.level2.inheritance;

public class StudentRunner {

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Brooke");
		student.setEmail("something@mail.com");

		Person person = new Person();
		String value = person.toString();

		System.out.println(value);
		System.out.println(person);
	}

}
