package com.voya.testcases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.voya.training.Calculator;

public class CalculatorTest {
	Calculator calculator = null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("called before all the testcases");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("called after all the testcases");
	}

	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
		System.out.println("called before each testcase");
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator = null; 
		System.out.println("called after each testcase");
	}

	@Test
	@DisplayName("Testing sum method")
	void testSum() {
		int actual = calculator.sum(10,20);
		assertEquals(30, actual,"output should be 30");
	}
	@Test
	@DisplayName("Testing product method")
	void testProduct() {
		int actual = calculator.product(10, 20);
		assertEquals(200, actual,"output should be 200");
	}
	@Test
	@DisplayName("Testing greet method")
	void testGreet() {
		String username = "Priya";
		String actual=calculator.greetMessage(username);
		assertEquals("Welcome PRIYA",actual,"not a match");
	}
	@Test
	@Tag("first")
	@DisplayName("Testing show method")
	void testShowCourses() {
		List<String> expected = Arrays.asList("Angular","Html","Java","Spring");
		
		List<String> coursesInput = Arrays.asList("CSS","Java","Spring","Angular","Html");
		List<String> actual = calculator.showCourses(coursesInput);
		assertEquals(expected,actual);
	}
}
