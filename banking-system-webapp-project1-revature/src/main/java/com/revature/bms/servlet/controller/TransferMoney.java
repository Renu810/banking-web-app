package com.revature.bms.servlet.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.bms.service.CustomerService;
import com.revature.bms.service.CustomerServiceImpl;

/**
 * Servlet implementation class TransferMoney
 */
public class TransferMoney extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TransferMoney() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int cusId = (Integer) session.getAttribute("cusId");
		
		int rId = Integer.parseInt(request.getParameter("rId"));
		int balance = Integer.parseInt(request.getParameter("tAmount"));
		CustomerService customerService = new CustomerServiceImpl();
		boolean customer = customerService.transferAmount(cusId, rId, balance);
		response.getWriter().println("<h1> Money transfered Successfully");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
