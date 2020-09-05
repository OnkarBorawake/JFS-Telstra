
public class Tax {

	public double calTax(Employee emp)
	{
		double taxAmt=0.12;
		
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
