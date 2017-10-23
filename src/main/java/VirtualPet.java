//health
//happiness
//name
//description
//stats
//tick()

public abstract class VirtualPet {

	protected String petName;
	protected String petDescription;
	protected int petHealth;
	protected int petHappiness;

	public VirtualPet(String petName, String petDescription) {
		this.petName = petName;
		this.petDescription = petDescription;
		this.petHealth = 40;
		this.petHappiness = 40;

	}

	public int getPetHealth() {
		return petHealth;
	}

	public int getPetHappiness() {
		return petHappiness;
	}

	public String getPetName() {
		return petName;
	}

	public String getPetDescription() {
		return petDescription;
	}

	@Override
	public String toString() {
		return petName + "\t" + petDescription + "\t" + petHealth + "\t" + petHappiness;
	}
	public void tick() {
	}

}
