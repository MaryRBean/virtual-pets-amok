public class OrganicDog extends Dogs implements OrganicInterface {
	private int cageDirt;
	private int bathroom;
	private int thirstLevel;
	private int hungerLevel;

	public OrganicDog(String petName, String petDescription, int bathroom, int thirstLevel, int hungerLevel, int petHealth, int cageDirt, int petHappiness) {
		super(petName, petDescription);
		this.cageDirt = 0;
		this.bathroom = bathroom;
		this.thirstLevel = thirstLevel;
		this.hungerLevel = hungerLevel;
	}

	public int getCageDirt() {
		return cageDirt;
	}

	public int getBathroom() {
		return bathroom;
	}

	public int getThirstLevel() {
		return thirstLevel;
	}

	public int getHungerLevel() {
		return hungerLevel;
	}

	@Override
	public void food() {
		petHealth += 10;
		hungerLevel -= 10;
	}

	@Override
	public void clean() {
		cageDirt = 0;
	}

	@Override
	public void water() {
		petHealth += 10;
		thirstLevel -= 15;
	}

	@Override
	public void walk() {
		petHealth += 10;
		petHappiness += 10;
		thirstLevel -= 10;
		hungerLevel -= 5;
		cageDirt -= 5;
	}

	boolean cageDirtClean() {
		return cageDirt > 60;
	}

	public void tick() {
		thirstLevel += 5;
		hungerLevel += 5;
		bathroom += 5;
		cageDirt += 5;
	}

	public void play() {
		petHappiness +=5;
	}
	
	public String dogStats() {
		return petName + "\t" + petDescription + "\t" + bathroom + "\t" + thirstLevel + "\t" + hungerLevel + "\t"
				+ petHealth + "\t" + cageDirt + "\t" + petHappiness;
	}
}
