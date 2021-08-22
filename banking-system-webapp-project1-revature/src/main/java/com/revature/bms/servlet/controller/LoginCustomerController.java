package com.revature.bms.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.bms.service.CustomerService;
import com.revature.bms.service.CustomerServiceImpl;


/**
 * Servlet implementation class LoginCustomerController
 */
public class LoginCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int customerId =  Integer.parseInt(request.getParameter("customerId"));
		String password = request.getParameter("password");
		
		
		HttpSession session = request.getSession();
		session.setAttribute("cusId",customerId);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
       CustomerService customerService =  new CustomerServiceImpl();
        if (customerService.checkLogin(customerId, password)) {

			out.println("Welcome" + customerId);
			RequestDispatcher dispatcher = request.getRequestDispatcher("AfterLoginCustomer.html");

			dispatcher.forward(request, response);
    	} else {
			
    		RequestDispatcher dispatcher = request.getRequestDispatcher("CustomerError.jsp");

			dispatcher.forward(request, response);
			

		}
	

    	out.println("</body></html>");
		
		
	}

}
