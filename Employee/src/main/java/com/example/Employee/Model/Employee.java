package com.example.Employee.Model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("Employee")
public class Employee {
	private String EmployeeName;
	private String Employeesalary;
	private String Employeedob;
	private String Employeedescription;
	private String Employeestatus;
	private String Employeeid;
	private String id;
	
	
	private String EmployeeName2;
	private String Employeesalary2;
	private String Employeedob2;
	private String Employeedescription2;
	private String Employeestatus2;
	private String Employeeid2;
	private String id2;
	
	

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String EmployeeName) {
		this.EmployeeName = EmployeeName;
	}

	
	public String getEmployeesalary() {
		return Employeesalary;
	}

	public void setEmployeesalary(String Employeesalary) {
		this.Employeesalary = Employeesalary;
	}

	public String getEmployeedob() {
		return Employeedob;
	}

	public void setEmployeedob(String Employeedob) {
		this.Employeedob = Employeedob;
	}

	public String getEmployeedescription() {
		return Employeedescription;
	}

	public void setEmployeedescription(String Employeedescription) {
		this.Employeedescription= Employeedescription;
	}

	public String getEmployeestatus() {
		return Employeestatus;
	}

	public void setEmployeestatus(String Employeestatus) {
		this.Employeestatus = Employeestatus;
	}
	
	public String getEmployeeid() {
		return Employeeid;
	}

	public void setEmployeeid(String Employeeid) {
		this.Employeeid = Employeeid;
	}

	public String getEmployeeName2() {
		return EmployeeName2;
	}

	public void setEmployeeName2(String EmployeeName2) {
		this.EmployeeName2 = EmployeeName2;
	}

	
	public String getEmployeesalary2() {
		return Employeesalary2;
	}

	public void setEmployeesalary2(String Employeesalary2) {
		this.Employeesalary2 = Employeesalary2;
	}

	public String getEmployeedob2() {
		return Employeedob2;
	}

	public void setEmployeedob2(String Employeedob2) {
		this.Employeedob2= Employeedob2;
	}

	public String getEmployeedescription2() {
		return Employeedescription2;
	}

	public void setEmployeedescription2(String Employeedescription2) {
		this.Employeedescription2 = Employeedescription2;
	}

	public String getEmployeestatus2() {
		return Employeestatus2;
	}

	public void setEmployeestatus2(String Employeestatus2) {
		this.Employeestatus2 = Employeestatus2;
	}

	public String getEmployeeid2() {
		return Employeeid2;
	}

	public void setEmployeeid2(String Employeeid2) {
		this.Employeeid2 = Employeeid2;
	}
	
	public String getId() {
		return id;
	}
	
	public String getId2() {
		return id2;
	}
	
}
