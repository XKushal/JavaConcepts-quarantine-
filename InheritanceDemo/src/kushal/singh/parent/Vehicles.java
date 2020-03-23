package kushal.singh.parent;

public class Vehicles {
	private String engine;
	private int wheels;
	private int seats;
	private int fuelTanks;
	private String lights;
	
	//default constructor 
	public Vehicles() {
		this.engine = "petrol";
		this.wheels = 4;
		this.seats = 4;
		this.fuelTanks = 45;
		this.lights = "LED";
	}
	
	//parameterized constructor 
	public Vehicles(String engine, int wheels, int seats, int fuelTanks, String lights) {
		this.engine = engine;
		this.wheels = wheels;
		this.seats = seats;
		this.fuelTanks = fuelTanks;
		this.lights = lights;
	}

	public String getEngine() {
		return engine;
	}

	public int getWheels() {
		return wheels;
	}

	public int getSeats() {
		return seats;
	}

	public int getFuelTanks() {
		return fuelTanks;
	}

	public String getLights() {
		return lights;
	}
	
	public void run() {
		System.out.println("Running the vehicle.");
	}
	
}
