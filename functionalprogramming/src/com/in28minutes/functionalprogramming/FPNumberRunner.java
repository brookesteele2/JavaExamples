package com.in28minutes.functionalprogramming;

import java.util.List;
import java.util.stream.IntStream;

public class FPNumberRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);
		printFirst10(numbers);
		// Exercise 2 List.of("Apple", "Ant", "Bat).stream() Map all of these to
		// lowercase and print
		List.of("Apple", "Ant", "Bat").stream().map(s -> s.toLowerCase()).forEach(p -> System.out.println(p));
		// Exercise 3 List.of("Apple", "Ant", "Bat).stream() Print the length of each
		// element
		List.of("Apple", "Ant", "Bat").stream().map(s -> s.length()).forEach(p -> System.out.println(p));






	}
	//Exercise - Print squares of first 10 numbers! IntStream.range(1,10) *Note this only works in jshell <eyeroll>
	private static void printFirst10(List<Integer> numbers) {
		numbers.stream().sorted().limit(10).map(e -> e * e).forEach(p -> System.out.println(p));
		IntStream.range(1, 11).reduce(0, (n1, n2) -> (n1 + n2));

	}


}
