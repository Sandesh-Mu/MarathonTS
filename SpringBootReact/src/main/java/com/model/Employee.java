package com.model;


import java.util.Date;

public class Employee {
	int id;
	String name;
	Date dateHired;
	boolean managerFlag;
	String employeeType;

	public Employee(int id, String name, Date dateHired, boolean managerFlag, String employeeType) {
		super();
		this.id = id;
		this.name = name;
		this.dateHired = dateHired;
		this.managerFlag = managerFlag;
		this.employeeType = employeeType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateHired() {
		return dateHired;
	}

	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
	}

	public boolean isManagerFlag() {
		return managerFlag;
	}

	public void setManagerFlag(boolean managerFlag) {
		this.managerFlag = managerFlag;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

}
