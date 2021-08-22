package com.revature.bms.servlet.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.bms.model.Customer;
import com.revature.bms.service.CustomerService;
import com.revature.bms.service.CustomerServiceImpl;





/**
 * Servlet implementation class UpdateCustomer
 */
public class UpdateCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCustomer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int customerId=(Integer) session.getAttribute("cusId");
//		
		String customerName = request.getParameter("username");
		String password = request.getParameter("password");
		String emailId = request.getParameter("emailid");
		String mobileNumber = request.getParameter("mobile");
		String gender = request.getParameter("gender");
		int balance = Integer.parseInt(request.getParameter("balance"));
         
		
		Customer customer = new  Customer(customerId, password, customerName, balance, mobileNumber, emailId, gender, new Date());
		 CustomerService customerService = new CustomerServiceImpl();
		 customerService.updateCustomer(customer);
		
		response.setContentType("text/html");
		response.getWriter().println("<h1>updated succesfully </h1>");
		
//		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
