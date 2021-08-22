package com.revature.bms.servlet.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.bms.model.Employee;
import com.revature.bms.service.EmployeeService;
import com.revature.bms.service.EmployeeServiceImpl;

/**
 * Servlet implementation class UpdateEmployee
 */
public class UpdateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int empId=(Integer) session.getAttribute("Id");
		
		String employeeName = request.getParameter("username");
		String password = request.getParameter("password");
		String emailId = request.getParameter("emailid");
		String mobileNumber = request.getParameter("mobile");
		String gender = request.getParameter("gender");
		String department = request.getParameter("department");
		String address = request.getParameter("address");
		Employee employee = new Employee(empId, employeeName, password, emailId, mobileNumber, gender, department, address, new Date());
		
		EmployeeService employeeService = new EmployeeServiceImpl();
		employeeService.updateEmployee(employee);
		
		response.setContentType("text/html");
		response.getWriter().println("<h1>updated succesfully </h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
