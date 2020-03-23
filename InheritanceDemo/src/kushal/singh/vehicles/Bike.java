package kushal.singh.vehicles;

import kushal.singh.parent.Vehicles;

public class Bike extends Vehicles {
	private String handle;
	
	public Bike() {
		super();//call to a default constructor 
		this.handle = "short";
	}

	public Bike(String handle, String engine, int wheels, int seats, int fuelTanks, String lights) {
		super(engine, wheels, seats, fuelTanks, lights);
		this.handle = handle;
	}
	
	public String getHandle() {
		return handle;
	}

	@Override
	public String toString() {
		return "Bike [getHandle()=" + getHandle() + ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels()
				+ ", getSeats()=" + getSeats() + ", getFuelTanks()=" + getFuelTanks() + ", getLights()=" + getLights()
				+ "]";
	}
	
	public void run() {
		System.out.println("Running the Bicycle.");
		System.out.println(this.toString());
	}
	
}
