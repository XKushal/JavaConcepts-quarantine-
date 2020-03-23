package kushal.singh.vehicles;

import kushal.singh.parent.Vehicles;

public class Truck extends Vehicles {
	private String steering;
	private String musicSystem;
	
	public Truck() {
		super();
		this.steering = steering;
		this.musicSystem = musicSystem;
	}
	
	public Truck(String steering, String musicSystem) {
		this.steering = steering;
		this.musicSystem = musicSystem;
	}

	public String getSteering() {
		return steering;
	}

	public String getMusicSystem() {
		return musicSystem;
	}
	
	
}
