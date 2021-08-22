package com.revature.bms.dao;

import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.revature.bms.model.Customer;


public class CustomerDAOImpl  implements CustomerDAO{
	
	private static Logger logger = Logger.getLogger("CustomerDAOImpl");
	
	SessionFactory sessionFactory = com.revature.bms.util.HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();

	public int addCustomer(Customer customer) {
		Transaction transaction = session.beginTransaction();
		session.save(customer);
		int customerId=customer.getCustomerId();
		transaction.commit();
		return customerId;
	}

	public boolean deleteCustomer(int customerId) {
		Transaction transaction = session.beginTransaction();
		Customer customer = new Customer();
		customer.setCustomerId(customerId);
		session.delete(customer);
		transaction.commit();
		return true;
	}

	public boolean updateCustomer(Customer customer) {
		Transaction transaction = session.beginTransaction();
		session.update(customer);
		transaction.commit();
		return true;
	}

	public Customer getCustomerById(int customerId) {
		Customer customer =  (Customer) session.load(Customer.class, customerId);
		return customer;
	}

	public List<Customer> getCustomers() {
		Query query = session.createQuery("from com.revature.bms.model.Customer");
		List<Customer> customers = query.list();
		System.out.println(customers);
		return customers;
//		return query.list();
	}

	public boolean isCustomerExists(int customerId) {
		Customer customer =  (Customer) session.get(Customer.class, customerId);
		if(customer ==null)
			return false;
		else
			return true;
	}

	public int viewBalance(int customerId) {
		Query query = session.createQuery("select balance from com.revature.bms.model.Customer where customerId = "+customerId);
		int balance =  (Integer) query.list().get(0);
		logger.info("The balance for :"+customerId + " is "+balance);
		return balance;
	}

	public int deposit(int amount,int customerId) {

		
//		HttpSession session = request.getSession(true);
//		int customerId=(Integer) session.getAttribute("cusId");
				
				
//		customerId=Request.
		int balance;
		Transaction transaction = session.beginTransaction();
		Customer customer = (Customer) session.get(Customer.class, customerId);
		 balance=customer.getBalance();
//		 logger.info("The balance for :"+balance);
//		 logger.info("The balance for :"+amount);
	    balance=balance+amount;
	   
		customer.setBalance(balance);
		session.update(customer);
	
		transaction.commit();
		return balance;
		
		
	}

	public int withdraw(int amount,int customerId) {
		int balance;
		Transaction transaction = session.beginTransaction();
		Customer customer = (Customer) session.get(Customer.class, customerId);
		 balance=customer.getBalance();
	    balance=balance-amount;
	   
		customer.setBalance(balance);
		session.update(customer);
	
		
		transaction.commit();
		return balance;
		
	}

	public boolean transferAmount(int senderId, int receiverId, int amount) {
		int balance;
		Transaction transaction = session.beginTransaction();
		Customer customer1 = (Customer) session.get(Customer.class, receiverId);
		balance=customer1.getBalance();
		balance=balance+amount;
		customer1.setBalance(balance);
		session.update(customer1);
		
		
		
		Customer customer2 = (Customer) session.get(Customer.class, senderId);
		balance=customer2.getBalance();
		balance=balance-amount;
		customer2.setBalance(balance);
		session.update(customer2);
		transaction.commit();
		
		
		
		return true;
		
	}

	public boolean checkLogin(int customerId, String password) {
		Query query = session.createQuery("from com.revature.bms.model.Customer where customerId='"+customerId+"'and password='"+password+"'");

		if(query.list().size()==0) { 
           return false;
		}
		else {
			return true;
		
		}
}}
