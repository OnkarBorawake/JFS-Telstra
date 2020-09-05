package pack1;

public abstract class Vehicle implements Automobile{

	protected int regNo;
	protected String model;
	protected int currSpeed;
	
	
	public Vehicle(int regNo, String model, int currSpeed) {
		super();
		this.regNo = regNo;
		this.model = model;
		this.currSpeed = currSpeed;
	}
	@Override
	public String start() {
		return ("Vehicle Started");

		
	}
	@Override
	public abstract int incSpeed(int n);
	@Override
	public String stop() {
		return ("Vehicle Stoped");
		
	}
}
