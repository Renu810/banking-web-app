package com.revature.bms.service;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.bms.dao.CustomerDAO;
import com.revature.bms.model.Customer;

public class CustomerServiceImplTest {

	
	CustomerService customerService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		customerService = new CustomerServiceImpl();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddCustomer() {
//		Customer customer = new Customer(122, "Abc", "abc@123", 5000, "1234567898", "abc@gmail.com", new Date());
//		assertEquals(true, customerService.addCustomer(customer));
	}

	@Test
	public void testDeleteCustomer() {
		int customerId=2;
		assertEquals(true,customerService.deleteCustomer(customerId));
	}

	@Test
	public void testUpdateCustomer() {
//		int customerId=3;
//		Customer customer = new  Customer(customerId, "XYZ", "xyz@123", 5000, "1234567897","xyz@gmail.com", "female", new Date());
//		customer.setCustomerId(customerId);
//		assertEquals(true,customerService.updateCustomer(customer));
	}

	@Test
	public void testGetCustomerById() {
		int customerId=5;
		Customer customer = customerService.getCustomerById(customerId);
		assertNotNull(customer);
	}

	@Test
	public void testGetCustomers() {
		List<Customer> customers=customerService.getCustomers();
		assertEquals(6,customers.size());
	}

	@Test
	public void testIsCustomerExists() {
		int customerId=5;
		assertEquals(true,customerService.isCustomerExists(customerId));
	}

	@Test
	public void testViewBalance() {
		int customerId=4;
		assertEquals(5000,customerService.viewBalance(customerId));
	}

	@Test
	public void testDeposit() {
		assertEquals(24,customerService.deposit(12));
	}

	@Test
	public void testWithdraw() {
		fail("Not yet implemented");
	}

	@Test
	public void testTransferAmount() {
		fail("Not yet implemented");
	}
	@Test
	public void testCheckLogin() {
	
		assertEquals(true,customerService.checkLogin(5, "XYZ"));
		
	}
	
	

	
	
	
	
	
	
	
	
	
}
