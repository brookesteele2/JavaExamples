package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MyMathTest {
	private MyMath math = new MyMath();
	@Test
	void calculateSum_ThreeMemberArray() {
		int expectedResult = 6;
		assertEquals(expectedResult, math.calculateSum(new int[] { 1, 2, 3 }));
//Absence of failure is success
//Test Condition or Assert

	}
	@Test
	void calculateSum_ZeroLengthArray() {
		int expectedResult = 0;
		assertEquals(expectedResult, math.calculateSum(new int[] {}));
	}

	@Test
	void calculateSum_TwoMemberArray() {
		int expectedResult = 90;
		assertEquals(expectedResult, math.calculateSum(new int[] { 40, 50 }));
	}

}