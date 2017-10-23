public class RoboCat extends VirtualPet implements RoboticInterface {

	private int rust;

	public RoboCat(String petName, String petDescription, int rust, int petHealth, int petHappiness) {
		super(petName, petDescription);
		this.rust = 0;
	}

	@Override
	public void oilRobots() {
		rust -= 5;
		petHealth += 10;
		petHappiness += 5;
	}

	public void tick() {
		rust += 5;
	}

	public void play() {
		petHappiness += 5;
	}
	
	public String roboCatStats() {
		return petName + "\t" + petDescription + "\t" + rust + "\t" + petHealth + "\t" + petHappiness;
	}

}
