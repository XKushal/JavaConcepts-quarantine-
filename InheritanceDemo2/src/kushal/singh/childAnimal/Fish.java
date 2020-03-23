package kushal.singh.childAnimal;

import kushal.singh.main.animal.Animals;

public class Fish extends Animals{
	protected boolean liveInWater;
	protected boolean hasGills;
	
	public Fish() {
		height = 12;
		weight = 114;
		aminaltype = "Reptile";
		bloodType = "O";
		this.liveInWater = true;
		this.hasGills = true;
	}

	public Fish(boolean liveInWater, boolean hasGills) {
		super();
		this.liveInWater = liveInWater;
		this.hasGills = hasGills;
	}

	public boolean getLiveInWater() {
		return liveInWater;
	}

	public boolean getHasGills() {
		return hasGills;
	}

	@Override
	public String toString() {
		return "Fish [liveInWater=" + liveInWater + ", hasGills=" + hasGills + ", height=" + height + ", weight="
				+ weight + ", aminaltype=" + aminaltype + ", bloodType=" + bloodType + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
