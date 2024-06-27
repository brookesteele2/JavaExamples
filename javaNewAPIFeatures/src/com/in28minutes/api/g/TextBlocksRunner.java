package com.in28minutes.api.g;

public class TextBlocksRunner {

	public static void main(String[] args) {
		// new line required after 3 quotes
		String str = """
				"Line 1"
				Line 2
					Line 3
				Line5
				Line6""";
//if you don't want a new line after Line3 move the 3 quotes up
		System.out.print(str);
	}

}
