
public class Character {
	private String name;
	private int energy;
	private int alignment;
	private String type;
	
	// custom constructor 1
	public Character (String n, int h, int a, String t) {
		this.name = n;
		this.energy = h;
		this.alignment = a;
		this.type = t;
	}
	
	public void printDetails() {
		System.out.println("You have chosen " + this.name + " the " + this.type + "!!");
		System.out.println("Your energy is " + this.energy);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public int getAlignment() {
		return alignment;
	}

	public void setAlignment(int alignment) {
		this.alignment = alignment;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
	
	
	
} // end of class
