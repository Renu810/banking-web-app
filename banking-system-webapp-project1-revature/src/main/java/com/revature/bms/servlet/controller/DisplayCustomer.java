package com.revature.bms.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

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
 * Servlet implementation class DisplayCustomer
 */
public class DisplayCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayCustomer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		int cusId = (Integer) session.getAttribute("cusId");
		CustomerService customerService = new CustomerServiceImpl();
		Customer customer = customerService.getCustomerById(cusId);
		session.setAttribute("customers", customer);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("Customer/CustomerDetails.jsp");
		dispatcher.forward(request, response);

//		PrintWriter out = response.getWriter();
//		out.println("<h1>hello</h1>"+cusId);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
