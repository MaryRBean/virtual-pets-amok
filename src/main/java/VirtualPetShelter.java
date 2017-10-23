
//oil all robots
//clean all dog cages
//clean litter-box
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	Map<String, RoboDog> roboDogs = new HashMap<String, RoboDog>();

	public void addNewRoboDog(RoboDog dog) {
		roboDogs.put(dog.getPetName().toLowerCase(), dog);
	}

	Map<String, OrganicDog> organicDogs = new HashMap<String, OrganicDog>();

	public void addNewOrganicDog(OrganicDog dog) {
		organicDogs.put(dog.getPetName().toLowerCase(), dog);
	}

	Map<String, RoboCat> roboCats = new HashMap<String, RoboCat>();

	public void addNewRoboCat(RoboCat cat) {
		roboCats.put(cat.getPetName().toLowerCase(), cat);
	}

	Map<String, OrganicCat> organicCats = new HashMap<String, OrganicCat>();

	public void addNewOrganicCat(OrganicCat cat) {
		organicCats.put(cat.getPetName().toLowerCase(), cat);
	}

	public String roboDogs() {
		System.out.println("\nHere are the stats of the robodogs:");
		String values = "Name \t Type \t Oil Need \t Health \t Happiness";
		System.out.println("Name \t Type \t Oil Need \t Health \t Happiness");
		for (RoboDog add : roboDogs.values()) {
			values = add.roboDogStats();
		}
		return values;

	}

	public String roboCats() {
		System.out.println("\nHere are the stats of the robocats:");
		String values = "Name \t Type\t Oil Need \t Health \t Happiness";
		System.out.println("Name \t Type \t Oil Need \t Health \t Happiness");
		for (RoboCat add : roboCats.values()) {
			values = add.roboCatStats();
		}
		return values;

	}

	public String organicDogs() {
		System.out.println("\nHere are the stats of the organic dogs:");
		String values = "Name \t\t Type \t Bathroom \t Thirsty \t Hunger \t Health \t Cage Dirty" + " \t Happiness";
		System.out.println("Name \t\t Type \t Bathroom \t Thirsty \t Hunger \t Health \t Cage Dirty " + "\t Happiness");

		for (OrganicDog add : organicDogs.values()) {
			values = add.dogStats();
		}
		return values;

	}

	public String organicCats() {
		System.out.println("\nHere are the stats of the organic cats:");
		String values = "Name Type \t NeedBathroom \t Thirsty \t Hunger \t Health \t " + "Box Dirty \t Happiness";
		System.out.println("Name \t Type \t NeedBathroom Thirsty \t Hunger \t Health \t " + "Box Dirty \t Happiness");
		for (OrganicCat add : organicCats.values()) {
			values = add.organicCatStats();
		}

		return values;

	}

	public void waterPets() {
		for (OrganicCat currentPet : organicCats.values()) {
			currentPet.water();
		}
		for (OrganicDog currentPet : organicDogs.values()) {
			currentPet.water();
		}

	}

	public void feedPets() {
		for (OrganicCat currentPet : organicCats.values()) {
			currentPet.food();
		}
		for (OrganicDog currentPet : organicDogs.values()) {
			currentPet.food();
		}

	}

	public void oilPets() {
		for (RoboCat currentPet : roboCats.values()) {
			currentPet.oilRobots();
		}
		for (RoboDog currentPet : roboDogs.values()) {
			currentPet.oilRobots();
		}

	}

	public void play() {
		for (RoboCat currentPet : roboCats.values()) {
			currentPet.play();
		}
		for (RoboDog currentPet : roboDogs.values()) {
			currentPet.play();
		}
		for (OrganicCat currentPet : organicCats.values()) {
			currentPet.play();
		}
		for (OrganicDog currentPet : organicDogs.values()) {
			currentPet.play();
		}
	}

	public void walk() {
		for (OrganicDog currentPet : organicDogs.values()) {
			currentPet.walk();
		}
	}

	public void cleanCage() {
		for (OrganicDog currentPet : organicDogs.values()) {
			currentPet.clean();
		}
	}

	public void cleanLitterBox() {
		for (OrganicCat currentPet : organicCats.values()) {
			currentPet.clean();
		}
	}

	public void allTick() {
		for (RoboCat currentPet : roboCats.values()) {
			currentPet.tick();
		}
		for (RoboDog currentPet : roboDogs.values()) {
			currentPet.tick();
		}
		for (OrganicCat currentPet : organicCats.values()) {
			currentPet.tick();
		}
		for (OrganicDog currentPet : organicDogs.values()) {
			currentPet.tick();
		}

	}

	public VirtualPet removePet(String adoptPet) {
		return null;
	}

	public void addPet(VirtualPet addPet) {
	}

}
