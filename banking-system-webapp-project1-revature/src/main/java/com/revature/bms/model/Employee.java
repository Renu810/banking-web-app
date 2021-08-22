package com.revature.bms.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;
	
	@Column
	private String employeeName;
	
	@Column
	private String password;
	
	@Column
	private String emailId;
	
	@Column
	private String mobileNumber;
	
	@Column
	private String gender;
	
	@Column
	private String department;
	
	@Column
	private String address;
	
	@Column
	private Date joiningDate;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String employeeName, String password, String emailId, String mobileNumber,
			String gender, String department, String address, Date joiningDate) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.password = password;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
		this.department = department;
		this.address = address;
		this.joiningDate = joiningDate;
	}

	public Employee(int employeeId, String password) {
		super();
		this.employeeId = employeeId;
		this.password = password;
	}

	public Employee(String password, String emailId) {
		super();
		this.password = password;
		this.emailId = emailId;
	}

	
	
	
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", password=" + password
				+ ", emailId=" + emailId + ", mobileNumber=" + mobileNumber + ", gender=" + gender + ", department="
				+ department + ", address=" + address + ", joiningDate=" + joiningDate + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
