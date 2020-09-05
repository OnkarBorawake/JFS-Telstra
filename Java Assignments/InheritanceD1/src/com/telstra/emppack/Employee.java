
package com.telstra.emppack;


public class Employee {

		protected int empId;
		protected String empName;	
		public int bSal;
		double allowences;
		double incomeTax;
		public Employee(int empId, String empName, int bSal) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.bSal = bSal;
		}
		
		public String getDetails()
		{
			return (empId+"  "+empName+"  "+bSal+calTax());
		}
		public double calcNetSal(double allowences, double incomeTax)
		{
			return ((bSal + allowences)- incomeTax);
		}
}

