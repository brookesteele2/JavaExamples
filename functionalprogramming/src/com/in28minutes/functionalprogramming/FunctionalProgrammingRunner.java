package com.in28minutes.functionalprogramming;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
		List<Integer> list2 = List.of(1, 4, 7, 9);
		printBasic(list);
		printWithFP(list);
		printBasicWithFiltering(list);
		printWithFPWithFiltering(list);
		printOddWithFPWithFiltering(list2);
		printEvenWithFPWithFiltering(list2);

	}

	private static void printBasic(List<String> list) {
		for (String string : list) {
			System.out.println(string);
		}
	}

	private static void printWithFP(List<String> list) {
		list.stream().forEach(element -> System.out.println("element - " + element));
	}

	private static void printBasicWithFiltering(List<String> list) {
		for (String string : list) {
			if (string.endsWith("at")) {
				System.out.println(string);
			}
		}
	}

	private static void printWithFPWithFiltering(List<String> list) {
		list.stream().filter(element -> element.endsWith("at"))
				.forEach(element -> System.out.println("element - " + element));
	}

	private static void printOddWithFPWithFiltering(List<Integer> list2) {
		list2.stream().filter(element -> element % 2 == 1)
				.forEach(element -> System.out.println(element));
	}

	private static void printEvenWithFPWithFiltering(List<Integer> list2) {
		list2.stream().filter(element -> element % 2 != 1).forEach(element -> System.out.println(element));
	}

}