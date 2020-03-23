package kushal.singh.main.animal;

public class Animals {
	protected int height;
	protected int weight;
	protected String aminaltype;
	protected String bloodType;
	
	public Animals() {
		this.height = 12;
		this.weight = 114;
		this.aminaltype = "Reptile";
		this.bloodType = "Cold";
	}

	public Animals(int height, int weight, String aminaltype, String bloodType) {
		this.height = height;
		this.weight = weight;
		this.aminaltype = aminaltype;
		this.bloodType = bloodType;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public String getAminaltype() {
		return aminaltype;
	}

	public String getBloodType() {
		return bloodType;
	}
	
	
	@Override
	public String toString() {
		return "Animals [getHeight()=" + getHeight() + ", getWeight()=" + getWeight() + ", getAminaltype()="
				+ getAminaltype() + ", getBloodType()=" + getBloodType() + "]";
	}

	public void run() {
		System.out.println("The animal type is "+ aminaltype + ".");
	}
	
}
