package com.in28minutes.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyBeforeAfterTest {
	@BeforeAll
	static void beforeAll() {
		System.out.println("BeforeAll");
	}

	@BeforeEach
	void beforeEach() {
		System.out.println("BeforeEach");
	}
	@Test
	void test1() {
		System.out.println("test 1");
	}

	@Test
	void test2() {
		System.out.println("test 2");
	}

	@Test
	void test3() {
		System.out.println("test 3");
	}

	@AfterEach
	void afterEach() {
		System.out.println("AfterEach");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("AfterAll");
	}

}
