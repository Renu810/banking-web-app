package com.revature.bms.dao;

import java.util.List;

import com.revature.bms.model.Employee;



public interface EmployeeDAO {
	public int addEmployee(Employee employee);
	public boolean deleteEmployee(int employeeId);
	public boolean updateEmployee(Employee employee);
	public Employee getEmployeeById(int employeeId);
	public List<Employee> getEmployee();
	public boolean isEmployeeExists(int employeeId);
	public boolean checkLogin(int employeeId, String password);

}
