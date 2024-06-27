package com.in28minutes.junit;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyAssertTest {
	List<String> todos = Arrays.asList("AWS", "Azure", "DevOps");

	@Test
	void test() {
		boolean test = todos.contains("AWS");//Result

		assertEquals(true, test);
		assertTrue("Test Failed", test); // boolean values only checks that test is true
		assertEquals(3, todos.size(), "Size is Wrong");
		// assertFalse("This is not false", test);
		// asertNull, assertNOtNull

		assertArrayEquals(new int[] { 1, 2 }, new int[] { 1, 2 });
		// fail("Not yet implemented");
	}

}