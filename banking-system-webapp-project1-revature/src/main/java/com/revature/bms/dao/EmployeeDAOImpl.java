package com.revature.bms.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.revature.bms.model.Employee;

public  class EmployeeDAOImpl implements EmployeeDAO {
	
	private static Logger logger = Logger.getLogger("EmployeeDAOImpl");
	
	SessionFactory sessionFactory = com.revature.bms.util.HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();

	public int addEmployee(Employee employee) {
		Transaction transaction = session.beginTransaction();
		session.save(employee);
		int employeeId=employee.getEmployeeId();
		transaction.commit();
		return employeeId;
	}

	public boolean deleteEmployee(int employeeId) {
		Transaction transaction = session.beginTransaction();
		Employee employee = new Employee();
		employee.setEmployeeId(employeeId);
		session.delete(employee);
		transaction.commit();
		return true;
	}

	public boolean updateEmployee(Employee employee) {
		Transaction transaction = session.beginTransaction();
		session.update(employee);
		transaction.commit();
		return true;
	}

	public Employee getEmployeeById(int employeeId) {
		Employee employee =  (Employee) session.load(Employee.class, employeeId);
		return employee;
	}

	public List<Employee> getEmployee() {
		Query query = session.createQuery("from com.revature.bms.model.Employee");
		List<Employee> employees = query.list();
		System.out.println(employees);
		return employees;
	}

	public boolean isEmployeeExists(int employeeId) {
		Employee employee =  (Employee) session.get(Employee.class, employeeId);
		if(employee ==null)
			return false;
		else
			return true;
	}

	public boolean checkLogin(int employeeId, String password) {
		Query query = session.createQuery("from com.revature.bms.model.Employee where employeeId='"+employeeId+"'and password='"+password+"'");
		if(query.list().size()==0) { 
	           return false;
			}
			else {
				return true;
			
			}
	}

}
