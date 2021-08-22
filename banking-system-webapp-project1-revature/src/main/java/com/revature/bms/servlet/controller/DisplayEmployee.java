package com.revature.bms.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.bms.dao.CustomerDAOImpl;
import com.revature.bms.dao.EmployeeDAOImpl;
import com.revature.bms.model.Customer;
import com.revature.bms.model.Employee;
import com.revature.bms.service.EmployeeService;
import com.revature.bms.service.EmployeeServiceImpl;

/**
 * Servlet implementation class DisplayEmployee
 */
public class DisplayEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeService employeeService = new EmployeeServiceImpl();
		HttpSession session = request.getSession();
		int empId=(Integer) session.getAttribute("Id");
		Employee employees = employeeService.getEmployeeById(empId);
		
		session.setAttribute("employees", employees);
//		PrintWriter out = response.getWriter();
//		out.println("<h1>hello</h1>"+empId);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Employee/EmployeeDetails.jsp");
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
