package kushal.singh.individualAnimal;

import kushal.singh.childAnimal.Reptile;

public class Crocodile extends Reptile{

	public Crocodile() {
		super();
		egg = "hard shell";
	}

	public Crocodile(String dryskin, boolean backBone, String egg) {
		super(dryskin, backBone, egg);
		skin = dryskin;
		backBone = backBone;
		egg = egg;
	}

	@Override
	public String toString() {
		return "Crocodile [skin=" + skin + ", backBone=" + backBone + ", egg=" + egg + ", height=" + height
				+ ", weight=" + weight + ", aminaltype=" + aminaltype + ", bloodType=" + bloodType + "]";
	}
	
	
	
}
