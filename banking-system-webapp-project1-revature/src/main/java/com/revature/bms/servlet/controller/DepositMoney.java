package com.revature.bms.servlet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;

import com.revature.bms.model.Customer;
import com.revature.bms.service.CustomerService;
import com.revature.bms.service.CustomerServiceImpl;

/**
 * Servlet implementation class DepositMoney
 */
public class DepositMoney extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepositMoney() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().println("<h1>deposite money success :");
		int balance = Integer.parseInt(request.getParameter("dAmount"));
		
		HttpSession session = request.getSession();
		int cusId = (Integer) session.getAttribute("cusId");
		CustomerService customerService = new CustomerServiceImpl();
		int customer = customerService.deposit(balance, cusId);
		response.getWriter().println("<h1>deposite money success :"+balance);
//		response.getWriter().println("<h1>deposite money success :"+cusId);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("Customer/Deposite.html");
//		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
