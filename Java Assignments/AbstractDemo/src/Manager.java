

public class Manager extends Employee{

	private String deptName;
	private int empCount;

	public Manager(int empId, String empName, int bSal, String deptName, int empCount) {
		super(empId, empName, bSal);
		this.deptName = deptName;
		this.empCount = empCount;
	}
	public String getDetails()
	{
		return (super.getDetails()+"  "+deptName+"  "+empCount);
	}
	public String getDeptName() {
		return deptName;
	}
	public int getEmpCount() {
		return empCount;
	}
	@Override
	protected double calcNetSal(double allowences, double incomeTax)
	{
		return ((bSal + allowences)- incomeTax);
	}
}
