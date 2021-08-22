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
import com.revature.bms.model.Employee;
import com.revature.bms.service.CustomerService;
import com.revature.bms.service.CustomerServiceImpl;
import com.revature.bms.service.EmployeeService;
import com.revature.bms.service.EmployeeServiceImpl;

/**
 * Servlet implementation class LoginEmpController
 */
public class LoginEmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginEmpController() {
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
		int employeeId =  Integer.parseInt(request.getParameter("employeeId"));
		String password = request.getParameter("password");
		
		HttpSession session = request.getSession();
		session.setAttribute("Id",employeeId);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
        EmployeeService employeeService =  new EmployeeServiceImpl();
        if (employeeService.checkLogin(employeeId, password)) {

//			out.println("Welcome" + employeeId);
			RequestDispatcher dispatcher = request.getRequestDispatcher("AfterLoginEmp.html");

			dispatcher.forward(request, response);
    	} else {

    		RequestDispatcher dispatcher = request.getRequestDispatcher("EmployeeError.jsp");

			dispatcher.forward(request, response);
			

		}
	

    	out.println("</body></html>");
		
		
	}

}
