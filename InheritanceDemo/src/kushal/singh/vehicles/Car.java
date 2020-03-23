package kushal.singh.vehicles;

import kushal.singh.parent.Vehicles;

public class Car extends Vehicles{
	private String steering;
	private String musicSystem;
	
	public Car() {
		super();
		this.steering = steering;
		this.musicSystem = musicSystem;
	}
	
	public Car(String steering, String musicSystem) {
		super();
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
