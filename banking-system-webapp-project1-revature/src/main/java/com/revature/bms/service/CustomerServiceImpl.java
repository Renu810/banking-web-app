package com.revature.bms.service;

import java.util.List;

import com.revature.bms.dao.CustomerDAO;
import com.revature.bms.dao.CustomerDAOImpl;
import com.revature.bms.model.Customer;

public class CustomerServiceImpl implements CustomerService {
    
	CustomerDAO customerDAO = new CustomerDAOImpl();
	
	public int addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDAO.addCustomer(customer);
	}

	public boolean deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		return customerDAO.deleteCustomer(customerId);
	}

	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDAO.updateCustomer(customer);
	}

	public Customer getCustomerById(int customerId) {
		// TODO Auto-generated method stub
		return customerDAO.getCustomerById(customerId);
	}

	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return customerDAO.getCustomers();
	}

	public boolean isCustomerExists(int customerId) {
		// TODO Auto-generated method stub
		return customerDAO.isCustomerExists(customerId);
	}

	public int viewBalance(int customerId) {
		// TODO Auto-generated method stub
		return customerDAO.viewBalance(customerId);
	}

	public int deposit(int amount,int customerId) {
		// TODO Auto-generated method stub
		return customerDAO.deposit(amount, customerId);
	}

	public int withdraw(int amount,int customerId) {
		// TODO Auto-generated method stub
		return customerDAO.withdraw(amount, customerId);
	}

	public boolean transferAmount(int senderId, int receiverId, int amount) {
		// TODO Auto-generated method stub
		return customerDAO.transferAmount(senderId, receiverId, amount);
	}

	public boolean checkLogin(int customerId, String password) {
		// TODO Auto-generated method stub
		return customerDAO.checkLogin(customerId, password);
	}


}
