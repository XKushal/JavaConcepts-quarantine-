package kushal.singh.childAnimal;

import kushal.singh.main.animal.Animals;

public class Bird extends Animals{
	protected boolean animalWithFeather;
	protected boolean canfly;

	public Bird() {
		super();
		this.animalWithFeather = true;
		this.canfly = true;
	}

	public Bird(boolean animalWithFeather, boolean canfly) {
		super();
		this.animalWithFeather = animalWithFeather;
		this.canfly = canfly;
	}

	public boolean getAnimalWithFeather() {
		return animalWithFeather;
	}

	public boolean getCanfly() {
		return canfly;
	}

	@Override
	public String toString() {
		return "Bird [animalWithFeather=" + animalWithFeather + ", canfly=" + canfly + ", height=" + height
				+ ", weight=" + weight + ", aminaltype=" + aminaltype + ", bloodType=" + bloodType + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
