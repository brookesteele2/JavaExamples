package com.in28minutes.api.d;




public class StringNewApiRunner {

	public static void main(String[] args) {

		System.out.println("".isBlank());
		// checks for non white space characters like null
		System.out.println(" LR ".strip().replace(" ", "@"));
		// removes spaces
		System.out.println(" L R ".stripLeading().replace(" ", "@"));
		System.out.println(" L R ".stripTrailing().replace(" ", "@"));

		"Line1\nLine2\nLine3\nLine4".lines().forEach(System.out::println);
		// multiple lines stream
		System.out.println("UPPER".transform(s -> s.substring(2)));

		System.out.println("My name is %s. My age is %d.".formatted("Ranga", 25));

		SampleClass sample = new SampleClass();
		String str = null;
		System.out.println(str.isBlank());
	}

	class SampleClass() {
		String str = null;
	}
}
