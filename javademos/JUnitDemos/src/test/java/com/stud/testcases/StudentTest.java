package com.stud.testcases;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.voya.exception.InvalidNumException;
import com.voya.testcases.trail.ArrayList;
import com.voya.testcases.trail.List;
import com.voya.training.StudentDetails;

class StudentTest {
	StudentDetails studentdetails = null;
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		studentdetails = new StudentDetails();
		
	}

	@AfterEach
	void tearDown() throws Exception {
		studentdetails = null;
	}
	
	void testNull() {
		List<String> mylist = null;
		assertNull(mylist);
	}

	void testNotNull() {
		List<String> mylist = new ArrayList<>();
		assertNull(mylist);
	}
	@Tag("simple")
	void testSame() {
		String username = "Farhan";
		String nusername = "Farhan";
	}
}
