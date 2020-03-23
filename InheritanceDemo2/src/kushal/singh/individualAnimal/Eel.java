package kushal.singh.individualAnimal;

import kushal.singh.childAnimal.Fish;

public class Eel extends Fish {
	private String special;
	
	public Eel() {
		super();
		this.special = "releases electric shock";
	}

	@Override
	public String toString() {
		return "Eel [special=" + special + ", liveInWater=" + liveInWater + ", hasGills=" + hasGills + ", height="
				+ height + ", weight=" + weight + ", aminaltype=" + aminaltype + ", bloodType=" + bloodType
				+ ", toString()=" + super.toString() + "]";
	}
	
}
