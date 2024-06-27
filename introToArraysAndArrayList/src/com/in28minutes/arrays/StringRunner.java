package com.in28minutes.arrays;

public class StringRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		String dayWithMostCharacters = "";

		for (String day : daysOfWeek) {
			if (day.length() > dayWithMostCharacters.length()) {
				dayWithMostCharacters = day;
			}
		}
		System.out.println("Days with Most number of characters " + dayWithMostCharacters);

		for (int i = 0; i < daysOfWeek.length; i++) {
			System.out.println(daysOfWeek[i]);
		}

		for (int i = daysOfWeek.length - 1; i >= 0; i--) {
			System.out.println(daysOfWeek[i]);
		}
	}

}
