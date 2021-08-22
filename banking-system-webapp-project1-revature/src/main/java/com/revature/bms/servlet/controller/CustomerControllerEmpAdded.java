package com.revature.bms.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.bms.model.Customer;
import com.revature.bms.service.CustomerService;
import com.revature.bms.service.CustomerServiceImpl;

/**
 * Servlet implementation class CustomerControllerEmpAdded
 */
public class CustomerControllerEmpAdded extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerControllerEmpAdded() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String customerName = request.getParameter("username");
		String password = request.getParameter("password");
		int balance = Integer.parseInt(request.getParameter("balance"));
		String mobileNumber = request.getParameter("mobile");
		String emailId = request.getParameter("emailid");
		String gender = request.getParameter("gender");
		

		Customer customer = new Customer(0, password, customerName, balance, mobileNumber, emailId, gender, new Date());
		HttpSession session = request.getSession();
		CustomerService customerService = new CustomerServiceImpl();
		int customerId=customerService.addCustomer(customer);
		session.setAttribute("customerId", customerId);
		response.setContentType("text/html");
		RequestDispatcher  dispatcher = request.getRequestDispatcher("WelcomeCustomerText.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
