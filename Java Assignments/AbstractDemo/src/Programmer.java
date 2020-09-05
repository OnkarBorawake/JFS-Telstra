



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
@Override
protected double calcNetSal(double allowences, double incomeTax)
{
	return ((bSal + allowences)- incomeTax);
}
}
