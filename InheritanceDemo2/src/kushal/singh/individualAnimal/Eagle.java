package kushal.singh.individualAnimal;

import kushal.singh.childAnimal.Bird;

public class Eagle extends Bird{

	@Override
	public String toString() {
		return "Eagle [animalWithFeather=" + animalWithFeather + ", canfly=" + canfly + ", height=" + height
				+ ", weight=" + weight + ", aminaltype=" + aminaltype + ", bloodType=" + bloodType + ", toString()="
				+ super.toString() + "]";
	}
	
}
