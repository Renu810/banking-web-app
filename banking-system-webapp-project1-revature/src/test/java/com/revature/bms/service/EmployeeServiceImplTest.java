package com.revature.bms.service;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.bms.model.Employee;

public class EmployeeServiceImplTest {
	
	EmployeeService employeeService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		employeeService =new EmployeeServiceImpl();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddEmployee() {
		Employee employee = new Employee(8, "renu", "renu810", "renu@810", "7894561235", "female", "loan", "beed",new Date());
		assertEquals(true, employeeService.addEmployee(employee));
	}

	@Test
	public void testDeleteEmployee() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateEmployee() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetEmployeeById() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetEmployee() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsEmployeeExists() {
		fail("Not yet implemented");
	}

}
