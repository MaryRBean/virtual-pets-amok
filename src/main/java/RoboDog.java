//oil
public class RoboDog extends Dogs implements RoboticInterface {

	private int rust;

	public RoboDog(String petName, String petDescription, int rust, int petHealth, int petHappiness) {
		super(petName, petDescription);
		this.rust = rust;
	}

	public void tick() {
		rust += 5;
	}

	public void play() {
		petHappiness += 5;
	}

	@Override
	public void oilRobots() {
		rust = 0;
		petHealth += 10;
		petHappiness += 5;
	}

	public String roboDogStats() {
		return petName + "\t" + petDescription + "\t" + rust + "\t" + petHealth + "\t" + petHappiness;
	}

}
