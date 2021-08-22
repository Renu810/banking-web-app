package com.revature.bms.servlet.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.revature.bms.model.Employee;

import com.revature.bms.service.EmployeeService;
import com.revature.bms.service.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeController
 */
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String employeeName = request.getParameter("username");
		String password = request.getParameter("password");
		String emailId = request.getParameter("emailid");
		String mobileNumber = request.getParameter("mobile");
		String gender = request.getParameter("gender");
		String department = request.getParameter("department");
		String address = request.getParameter("address");
		

		Employee employee = new Employee(0, employeeName, password, emailId, mobileNumber, gender, department, address, new Date());
		HttpSession session = request.getSession();
		EmployeeService employeeService = new EmployeeServiceImpl();
		int employeeId=employeeService.addEmployee(employee);
		session.setAttribute("employeeId", employeeId);
		response.setContentType("text/html");
		RequestDispatcher  dispatcher = request.getRequestDispatcher("WelcomeText1.jsp");
		dispatcher.forward(request, response);
//		response.getWriter().println("<h1> Please note your  customer id for future logins :"+employeeId);
//		response.getWriter().println("<h1>"+employeeName + ", congrats  ");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
