package pack1;


public class LongDrive {

	public static void main(String[] args) {

		Car car = new Car(123, "Q3", 40, 160, "SUV");
		System.out.println(car.start());
		if(car.incSpeed(160)==-1)
			System.out.println("Stop the Car...");
		System.out.println(car.incSpeed(160));
		System.out.println(car.stop());
		
	}

}
