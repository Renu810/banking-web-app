package com.revature.bms.service;

import java.util.List;

import com.revature.bms.dao.EmployeeDAO;
import com.revature.bms.dao.EmployeeDAOImpl;
import com.revature.bms.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDAO employeeDAO = new  EmployeeDAOImpl();

	public int addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDAO.addEmployee(employee);
	}

	public boolean deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDAO.deleteEmployee(employeeId);
	}

	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDAO.updateEmployee(employee);
	}

	public Employee getEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployeeById(employeeId);
	}

	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployee();
	}

	public boolean isEmployeeExists(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDAO.isEmployeeExists(employeeId);
	}

	public boolean checkLogin(int employeeId, String password) {
		// TODO Auto-generated method stub
		return employeeDAO.checkLogin(employeeId, password);
	}



}
