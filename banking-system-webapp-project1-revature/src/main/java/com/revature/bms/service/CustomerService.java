package com.revature.bms.service;

import java.util.List;

import com.revature.bms.model.Customer;



public interface CustomerService {
	
	public int addCustomer(Customer customer);
	public boolean deleteCustomer(int customerId);
	public boolean updateCustomer(Customer customer);
	public Customer getCustomerById(int customerId);
	public List<Customer> getCustomers();
	public boolean isCustomerExists(int customerId);
	public int viewBalance(int customerId);
	public int deposit(int amount,int customerId);
	public int withdraw(int amount,int customerId);
	public boolean transferAmount(int senderId,int receiverId,int amount);
	public boolean checkLogin(int customerId, String password);

}
