package pack1;

public class Car extends Vehicle{

	private int maxSpeed;
	private String type;
	public Car(int regNo, String model, int currSpeed, int maxSpeed, String type) {
		super(regNo, model, currSpeed);
		this.maxSpeed = maxSpeed;
		this.type = type;
	}

		
	@Override
	public int incSpeed(int n) {
		if(currSpeed < maxSpeed)
			return currSpeed;
		else
			return 0;
	}


	public int getMaxSpeed() {
		return maxSpeed;
	}

	
	
}
