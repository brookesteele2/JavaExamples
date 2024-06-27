package com.in28minutes.api.e;

import java.util.List;

public class TypeInferencesRunner {

	public static void main(String[] args) {
		List<String> names1 = List.of("Ranga", "Ravi");
		List<String> names2 = List.of("John", "Adam");
		
		// List<List<String>> names = List.of(names1, names2);
		var var = "";
		// var is not a keyword

		final var names = List.of(names1, names2);

		names.stream().forEach(System.out::println);

		for (var i = 1; i <= 10; i++) {
			System.out.println(i);

		}
		for(String name:names1) {
			System.out.println(name);
		}
	}

}
