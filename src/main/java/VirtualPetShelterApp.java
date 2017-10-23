
//walk all dogs
//clean all dog cages
//empty/clean litter box
import java.util.Scanner;

public class VirtualPetShelterApp {

	private static VirtualPet addPet;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(
				"Welcome to the Virtual Pet Shelter, please help us keep it together!"
				+ " Thanks for coming to help!\n");

		RoboDog dogBear = new RoboDog("Bear", "Dog", 25, 15, 25);
		RoboCat catKim = new RoboCat("Kim", "Cat", 30, 15, 20);
		OrganicDog dogRihanna = new OrganicDog("Rihanna", "Dog", 20, 25, 30, 25, 30, 40);
		OrganicCat catSparkles = new OrganicCat("Sparkles", "Cat", 30, 30, 30, 20);

		VirtualPetShelter allPets = new VirtualPetShelter();

		allPets.addNewRoboDog(dogBear);
		allPets.addNewRoboCat(catKim);
		allPets.addNewOrganicDog(dogRihanna);
		allPets.addNewOrganicCat(catSparkles);


		System.out.println(allPets.organicCats());
		System.out.println(allPets.organicDogs());
		System.out.println(allPets.roboCats());
		System.out.println(allPets.roboDogs());

		do {
			allPets.allTick();
			System.out.println("\nWhat would you like to do with the pets?");
			System.out.println("Type 'clean cage','clean litter box','walk','feed',"
					+ "'water','oil','play','admit','adopt','quit'.");

			String choice = input.nextLine();

			switch (choice) {
			case "clean cage":
				allPets.cleanCage();
				System.out.println("Cages are cleaned.");

			case "clean litterbox":
				allPets.cleanLitterBox();
				System.out.println("The Litterbox is cleaned.");

			case "walk":
				allPets.walk();
				System.out.println("You took all the dogs for a walk.");

			case "feed":
				allPets.feedPets();
				System.out.println("You fed all the pets.");

			case "water":
				allPets.waterPets();
				System.out.println("You gave water to all the pets.");

			case "oil":
				allPets.oilPets();
				System.out.println("You oiled the robo pets.");
				
			case "play":
				allPets.play();
				System.out.println("You played with a pet.");
				
			case "admit":
				
				System.out.println("What is the name of the pet you would like to admit into the shelter?");
				String newPet = input.next().toLowerCase();{
				System.out.println("What type of animal is it?");
				String newPetDescription = input.next().toLowerCase();
				allPets.addPet(addPet);
				System.out.println("" + newPet + " the "+newPetDescription+" is now admitted into the shelter!");
				}
				
			case "adopt":	{
				System.out.println("Which pet did you want to adopt? Please enter their name.");
				String adoptPet = input.next().toLowerCase();
				VirtualPet removePet = allPets.removePet(adoptPet);
				System.out.println("You have successfully adopted " + adoptPet + "!");
			}

			case "quit":
				System.out.println("You have quit and left the shelter behind.");
				System.exit(0);
				break;

			default:
				System.out.println("Try typing again for a choice.");
				break;
			}

		} while (!allPets.organicDogs.isEmpty());

	}
}
