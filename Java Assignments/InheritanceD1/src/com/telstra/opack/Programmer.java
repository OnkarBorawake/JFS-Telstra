package com.telstra.opack;

import com.telstra.emppack.Employee;

public class Programmer extends Employee {

	private int noOfProjects;
	private String skills;
	public Programmer(int empId, String empName, int bSal, int noOfProjects, String skills) {
		super(empId, empName, bSal);
		this.noOfProjects = noOfProjects;
		this.skills = skills;
	}
public String getDetails()
{
	return (super.getDetails()+"  "+noOfProjects+"  "+skills);
}

public double calcNetSal(double allowences, double incomeTax)
{
	return ((bSal + allowences)- incomeTax);
}
}

