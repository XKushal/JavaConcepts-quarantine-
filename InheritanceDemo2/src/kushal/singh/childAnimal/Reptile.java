package kushal.singh.childAnimal;

import kushal.singh.main.animal.Animals;

public class Reptile extends Animals {
	protected String skin;
	protected boolean backBone;
	protected String egg;
	
	public Reptile() {
		height = 12;
		weight = 114;
		aminaltype = "Reptile";
		bloodType = "O";
		this.skin = "dry Skin";
		this.backBone = true;
		this.egg = "Soft Shell";
	}

	public Reptile(String dryskin, boolean backBone, String egg) {
		super();
		this.skin = dryskin;
		this.backBone = backBone;
		this.egg = egg;
	}

	public String getSkin() {
		return skin;
	}

	public boolean isBackBone() {
		return backBone;
	}

	public String getEgg() {
		return egg;
	}

	@Override
	public String toString() {
		return "Reptile [skin=" + skin + ", backBone=" + backBone + ", egg=" + egg + ", height=" + height + ", weight="
				+ weight + ", aminaltype=" + aminaltype + ", bloodType=" + bloodType + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
