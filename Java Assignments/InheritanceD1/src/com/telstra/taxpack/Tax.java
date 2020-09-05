package com.telstra.taxpack;

import com.telstra.emppack.Employee;
import com.telstra.emppack.Manager;
import com.telstra.opack.Programmer;


public class Tax {

	public double calTax(Employee emp)
	{
	
		double taxAmt=0.0;
		
		if(emp.bSal <= 300000)
		{
			taxAmt = 0.0;
		}
		else
		{
			taxAmt = emp.bSal * (10/100);
		}
		if(emp instanceof Manager)
		{
			Manager m = (Manager) emp;
			m.calcNetSal(10000,taxAmt);
		}
		else if(emp instanceof Programmer)
		{
			Programmer p1 = (Programmer) emp;
			p1.calcNetSal(10000,taxAmt);
		}
		else
		{
			return 0;
		}
		
		return taxAmt;
	}
}

