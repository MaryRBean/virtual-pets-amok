public class OrganicCat extends VirtualPet implements OrganicInterface {
	private int clean;
	private int litterBox;
	private int thirstLevel;
	private int hungerLevel;

	public OrganicCat(String petName, String petDescription, int litterBox, int thirstLevel, int hungerLevel,
			int clean) {
		super(petName, petDescription);
		this.litterBox = litterBox;
		this.thirstLevel = thirstLevel;
		this.hungerLevel = hungerLevel;
		this.clean = 0;
	}

	public int getclean() {
		return clean;
	}

	public int getlitterBox() {
		return litterBox;
	}

	public int getthirstLevel() {
		return thirstLevel;
	}

	public int gethungerLevel() {
		return hungerLevel;
	}

	@Override
	public void food() {
		petHealth += 15;
		hungerLevel -= 30;
	}

	@Override
	public void water() {
		petHealth += 15;
		thirstLevel -= 30;
	}

	public void clean() {
		clean = 0;
	}

	boolean isDirty() {
		return clean > 60;
	}

	public void tick() {
		hungerLevel += 5;
		thirstLevel += 5;
		clean += 10;
	}

	public void play() {
		petHappiness += 5;
	}

	public String organicCatStats() {
		return petName + "\t" + petDescription + "\t" + litterBox + "\t" + thirstLevel + "\t" + hungerLevel + "\t"
				+ petHealth + "\t" + clean + "\t" + petHappiness;
	}

}