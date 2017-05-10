package pets2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import pets2.Food;
import pets2.Toy;
import pets2.Animal;
import pets2.Player;

public class GameEnvironment {
	public final Player[] PLAYER_LIST;
	public final int NUM_DAYS;
	public final int NUM_PLAYERS;
	public final ArrayList<Animal> PETS_LIST; 
	
	public ArrayList<String> namesList;
	public static final Scanner input = new Scanner(System.in);
	public static Random randomObject = new Random();
	
	public static Food pizza = new Pizza();
	public static Food chocolate = new Chocolate();
	public static Food burger = new Burger();
	public static Food spaghetti = new Spaghetti();
	public static Food burritos = new Burritos();
	public static Food kale = new Kale();
	
	public static final Food[] foodAvailable = {pizza, chocolate, burger, spaghetti, burritos, kale};
	
	public static Toy ball = new Ball();
	public static Toy twine = new Twine();
	public static Toy teddyBear = new TeddyBear();
	public static Toy chewToy = new ChewToy();
	public static Toy bell = new Bell();
	public static Toy playHouse = new PlayHouse();

	public static final Toy[] toysAvailable = {ball, twine, teddyBear, chewToy, bell, playHouse};
	public static final String[] animalsAvailable = {"Dog", "Cat", "Bird", "Snake", "Lion", "Panda"};
	
	public GameEnvironment(){
		NUM_PLAYERS = this.askNumPlayers();
		NUM_DAYS = this.askNumDays();
		PETS_LIST = new ArrayList<Animal>();
		namesList = new ArrayList<String>();
		PLAYER_LIST = this.setUpPlayers();
	}
	
	public GameEnvironment(int numPlayers, int numDays){
		NUM_PLAYERS = numPlayers;
		NUM_DAYS = numDays;
		PETS_LIST = new ArrayList<Animal>();
		namesList = new ArrayList<String>();
		PLAYER_LIST = new Player[this.getNumPlayers()];
	}

	/**
	 * @return the namesList
	 */
	public ArrayList<String> getNamesList() {
		return namesList;
	}

	/**
	 * @param namesList the namesList to set
	 */
	public void setNamesList(ArrayList<String> namesList) {
		this.namesList = namesList;
	}

	/**
	 * @return the PLAYER_LIST
	 */
	public Player[] getPlayerList() {
		return PLAYER_LIST;
	}

	/**
	 * @return the NUM_DAYS
	 */
	public int getNumDays() {
		return NUM_DAYS;
	}

	/**
	 * @return the NUM_PLAYERS
	 */
	public int getNumPlayers() {
		return NUM_PLAYERS;
	}

	/**
	 * @return the PETS_LIST
	 */
	public ArrayList<Animal> getPetsList() {
		return PETS_LIST;
	}

	/**
	 * @return the foodAvailable
	 */
	public static Food[] getFoodAvailable() {
		return foodAvailable;
	}

	/**
	 * @return the toysAvailable
	 */
	public static Toy[] getToysAvailable() {
		return toysAvailable;
	}

	/**
	 * @return the animalsAvailable
	 */
	public static String[] getAnimalsAvailable() {
		return animalsAvailable;
	}
	
	public boolean confirmInput(String prompt, String confirmedMessage, String cancelledMessage, String confirmValue){
		System.out.println(prompt);
		String confirmation = input.nextLine();
		confirmation = confirmation.trim();
		if(confirmation.equals(confirmValue)){
			System.out.println(confirmedMessage);
			return true;
		}else{
			System.out.println(cancelledMessage);
			return false;
		}
	}
	
	public int askNumPlayers(){
		int players = 1;
		while(true){
			try{
		    	System.out.println("Please enter the number of players you would like to use in the game (between 1 and 4), or enter 0 to view the rules of the game.");
		    	int numPlayers = input.nextInt();
		    	input.nextLine();
		    	if ( (numPlayers > 4 || numPlayers < 0)) {
			    	System.out.println("Error: please type a vaild number. NB: Maximum players are 4.");
			    }else if(numPlayers == 0){
			    	this.askHelp();
			    }else{
			    	boolean confirmed = confirmInput(String.format("Are you happy to play with %d players in the game? Enter 1 to confirm, anything else to cancel.", numPlayers), 
			    			String.format("You confirmed you would like to play the game with %d players.", numPlayers), 
			    			String.format("You cancelled the game of %d players.", numPlayers), "1");
			        if (confirmed == true) {
			        	players = numPlayers;
			        	return players;  
			        }
			    }
			}catch(InputMismatchException i){
		       	 input.nextLine();
		       	 System.out.println("Please enter a whole number between 1 and 4.");
		       	 continue;
	        }
		}
	}
	
	public int askNumDays(){
		int days = 0;
		while(true){
			try{
				System.out.println("Please enter how many days (rounds) you would like to play the game for (between 1 and 30), or enter 0 to view the rules of the game. Each day, each pet is able to perfrom two 'actions'");
				days = input.nextInt();
				input.nextLine();
				if (days > 30 || days < 0){
					System.out.println("Error: please enter the number of days you would like to play between 1 and 30.");
				}else if(days == 0){
					this.askHelp();
				}else{
			       boolean confirmed = confirmInput(String.format("Are you happy to play %d days in the game? Enter 1 to confirm, anything else to cancel.", days), 
				   String.format("You confirmed you would like to play for %d days.", days), 
				   String.format("You cancelled the game of %d days.", days), "1");
				   if (confirmed == true) {
					   return days;	
				   }
				}		
			}catch(InputMismatchException i){
				input.nextLine();
				  System.out.println("Please enter a whole number between 1 and 30.");
				  continue;
			}
		}
	}
	
	public String chooseSpecies(String prompt, String errorMessage){
		String petSpecies = null;
		boolean again = false;
		do{
			System.out.println("The species available to you are:");
			this.printSpeciesListNum();
			System.out.println(prompt);
			String trySpecies = input.nextLine();
			trySpecies = trySpecies.trim();
			if(trySpecies.equals("0")){
				again = false;
			}else if(trySpecies.equals("1") || trySpecies.equals("2") || trySpecies.equals("3") || trySpecies.equals("4") || trySpecies.equals("5") || trySpecies.equals("6")){
				again = false;
				petSpecies = animalsAvailable[Integer.valueOf(trySpecies) - 1];
			}else{
				again = true;
				System.out.println(errorMessage);
			}
		}while(again);
		return petSpecies;
	}
	
	public void printSpeciesListNum(){
		for(int i = 0; i < animalsAvailable.length; i++){
			String speciesName = animalsAvailable[i];
			System.out.println(String.format("%d. %s", i + 1, speciesName));
		}
	}
	
	public void printSpeciesList(){
		for(int i = 0; i < animalsAvailable.length; i++){
			String speciesName = animalsAvailable[i];
			System.out.println(String.format("%s", speciesName));
		}
	}
	
	public void chooseViewSpeciesStats(){
		boolean again = true;
		int speciesNum;
		do{
			System.out.println("The species available to you are:");
			this.printSpeciesListNum();
			System.out.println("Please enter the number beside the species that you would like to view the stats of, or 0 to go back.");
			String trySpecies = input.nextLine();
			trySpecies = trySpecies.trim();
			if(trySpecies.equals("0")){
				again = false;
			}
			try{
				speciesNum = Integer.valueOf(trySpecies) - 1;
			}catch(NumberFormatException nfe){
				again = true;
				System.out.println("Please enter a valid species number between 1 and 6, or enter 0 to go back.");
				continue;
			}
			switch(speciesNum){
			case 0: again = false;
					Dog.printSpeciesStats();
					break;
			case 1: again = false;
					Cat.printSpeciesStats();
					break;
			case 2: again = false;
					Bird.printSpeciesStats();
					break;
			case 3: again = false;
					Snake.printSpeciesStats();
					break;
			case 4: again = false;
					Lion.printSpeciesStats();
					break;
			case 5: again = false;
					Panda.printSpeciesStats();
					break;
			default: again = true;
					System.out.println("Please enter a valid species number between 1 and 6, or enter 0 to go back.");
			}
		}while(again);
	}
	
	public String speciesStatsOrCon(String pName, int petNum){
		boolean again= true;
		String petSpecies = null;
		do{
			System.out.println("The species available to you are:");
			this.printSpeciesList();
			System.out.println(String.format("%s, you may view the stats of a species by entering 1, or you may confirm a species for pet %d by entering 2.", pName, petNum));
			String tryInt = input.nextLine();
			tryInt = tryInt.trim();
			if(tryInt.equals("1")){
				this.chooseViewSpeciesStats();
				again = true;
			}else if(tryInt.equals("2")){
				petSpecies = this.chooseSpecies(String.format("%s, please choose the species of pet %d. Enter the number beside the species you would like to choose, or 0 to go back.", pName, petNum), String.format("%s, you must choose from 1, 2, 3, 4, 5, or 6.", pName));
				again = false;
				if(petSpecies == null){
					again = true;
				}
			}else{
				System.out.println("Error: please enter 1 or 2.");
				again = true;
			}
		}while(again);
		return petSpecies;
	}
	
	public Player[] setUpPlayers(){
		Animal newPet = null;
		String petSpecies;
		Player[] players = new Player[this.getNumPlayers()];
		for(int pNum = 1; pNum < this.getNumPlayers() + 1; pNum++){
			String pName = this.askName(String.format("Player %d, please choose a name", pNum), String.format("Player %d, the name you entered has already been used, please choose another.", pNum));
			int pNumPets = this.askNumPets(String.format("%s, please enter how many pets you would like to use in the game. Must be 1, 2, or 3.", pName), String.format("%s, your number of pets was not valid, you must choose 1, 2, or 3 pets.", pName));
			players[pNum-1] = new Player(pName, pNumPets, this);
			for(int petNum = 1; petNum < pNumPets + 1; petNum++){
				newPet = null;
				petSpecies = null;
				petSpecies = this.speciesStatsOrCon(pName, petNum);
				String petName = this.askName(String.format("%s, please choose a name for your pet of species %s.", pName, petSpecies), String.format("%s, the name you entered has already been used, please choose another", pName));
				switch(petSpecies){
				case "Dog": newPet = new Dog(petName); break;
				case "Cat": newPet = new Cat(petName); break;
				case "Bird": newPet = new Bird(petName); break;
				case "Snake": newPet = new Snake(petName); break;
				case "Lion": newPet = new Lion(petName); break;
				case "Panda": newPet = new Panda(petName); break;
				}
				players[pNum-1].PLAYERS_PETS[petNum-1] = newPet;
				this.PETS_LIST.add(newPet);
			}
		}
		return players;
	}
	
	public void printStore(){
		System.out.println("The items available for you to purchase in the store are as follows:");
		System.out.println("Foods");
		Food food;
		Toy toy;
		int i = 0;
		for(i = 0; i<foodAvailable.length; i++){
			food = foodAvailable[i];
			System.out.print(String.format("%d.", i + 1));
			food.printStats();
		}
		System.out.println("Toys:");
		for(int n = 0; n<toysAvailable.length; n++){
			System.out.print(String.format("%d.", (i+ n + 1)));
			toy = toysAvailable[n];
			toy.printStats();
		}
	}
	
	public void askForPurchase(Player player){
		boolean again = true;
		int tryInt;
		do{
			System.out.println("Select an item to purchase by entering it's store code (number before the item), or exit the store by entering 0");
			try{
				tryInt = input.nextInt();
				input.nextLine();
			}
			catch(InputMismatchException ime){
				input.nextLine();
				System.out.println("Please either enter the store code of an item, or 0 to exit the store.");
				again = true;
				continue;
			}
			if(tryInt == 0){
				again = false;
				System.out.println("You have left the store");
			}else if(tryInt > (foodAvailable.length + toysAvailable.length) || tryInt < 0){
				System.out.println("Please enter a valid store code");
			}else{
				if(tryInt < foodAvailable.length + 1){
					Food food = foodAvailable[tryInt - 1];
					String foodName = food.getName();
					int foodPrice = food.getPrice();
					Food f = null;
					switch(foodName){
					case "Pizza": f = new Pizza(); break;
					case "Chocolate": f = new Chocolate(); break;
					case "Burger": f = new Burger(); break;
					case "Spaghetti": f = new Spaghetti(); break;
					case "Burritos": f = new Burritos(); break;
					case "Kale": f = new Kale(); break;
					}
					if(player.getBalance() - foodPrice < 0){
						System.out.println("You do not have sufficient funds to make this purchase.");
						player.printSummaryInventory();
						player.printBalance();
						f = null;
					}else{
						System.out.println(String.format("%s, you have purchased %s", player.getName(), foodName));
						player.purchaseFood(f, foodName, foodPrice);
						player.printSummaryInventory();
						player.printBalance();
					}
					this.printStore();
				}else{
					Toy toy = toysAvailable[tryInt - foodAvailable.length - 1];
					int toyPrice = toy.getPrice();
					String toyName = toy.getName();
					Toy t = null;
					switch(toyName){
					case "Ball": t = new Ball(); break;
					case "Twine": t = new Twine(); break;
					case "Teddy Bear": t = new TeddyBear(); break;
					case "Chew Toy": t = new ChewToy(); break;
					case "Bell": t = new Bell(); break;
					case "Play House": t = new PlayHouse(); break;
					}
					if(player.getBalance() - toyPrice < 0){
						System.out.println("You do not have sufficient funds to make this purchase.");
						player.printSummaryInventory();
						player.printBalance();
						t = null;
					}else{
						System.out.println(String.format("%s, you have purchased %s", player.getName(), toyName));
						player.purchaseToy(t, toyName, toyPrice);
						player.printSummaryInventory();
						player.printBalance();
					}
					this.printStore();
				}
			}
		}while(again);
	}
	
	public void goToStore(Player player){
		player.printSummaryInventory();
		player.printBalance();
		this.printStore();
		this.askForPurchase(player);
	}
	
	public void goToInventory(Player player, Animal pet){
		boolean again = true;
		boolean broken = false;
		int tryInt;
		do{
			if(pet.getActions() >= 2){
				again = false;
			}else{
				player.printInventory();
				if(player.inventoryEmpty() == false){
					System.out.println("Select the item in your inventory you would like to use [counts as action] (foods will be eaten, toys will be played with) by entering the number beside the item, or exit inventory by entering 0");
					try{
						tryInt = input.nextInt();
						input.nextLine();
					}catch(InputMismatchException ime){
						input.nextLine();
						System.out.println("Please either enter the number beside the item you would like to use, or 0 to exit the inventory");
						again = true;
						continue;
					}
					if(tryInt == 0){
						again = false;
						System.out.println("You have left your inventory");
					}else if(tryInt > (foodAvailable.length + toysAvailable.length) || tryInt < 0){
						System.out.println("Please enter a valid item code");
					}else{
						if(tryInt < foodAvailable.length + 1){
							Food food = foodAvailable[tryInt - 1];
							String foodName = food.getName();
							if(player.playersFood.get(foodName).size() == 0){
								again = true;
								System.out.println(String.format("There are 0 %s in your inventory, please choose a different food", foodName));
							}else{
								pet.feed(player.removeFoodFromInventory(foodName));
								System.out.println(String.format("%s, your pet %s has been fed %s. Updated stats:", player.getName(), pet.getName(), foodName));
								System.out.println(String.format("Hunger Level: %d", pet.getHungerLevel()));
								System.out.println(String.format("Mood: %d", pet.getMood()));
								System.out.println(String.format("Weight: %.2f", pet.getWeight()));
								System.out.println(String.format("Toilet Need: %d", pet.getToiletLevel()));
								System.out.println(String.format("Actions: %d", pet.getActions()));
							}
						}else{
							Toy toy = toysAvailable[tryInt - foodAvailable.length - 1];
							String toyName = toy.getName();
							if(player.playersToys.get(toyName).size() == 0){
								again = true;
								System.out.println(String.format("There are 0 %s in your inventory, please choose a different toy", toyName));
							}else{
								broken = pet.play(toyName, player);
								if(broken){
									player.removeToyFromInventory(toyName);
									System.out.println(String.format("%s has broken, and has been removed from your inventory", toyName));
								}else{
									System.out.println(String.format("The current quality of %s is %d/100", toyName, player.playersToys.get(toyName).get(0).getQuality()));
								}
								System.out.println(String.format("%s, your pet %s has played with %s. Updated stats:", player.getName(), pet.getName(), toyName));
								System.out.println(String.format("Mood: %d", pet.getMood()));
								System.out.println(String.format("Playfulness: %d", pet.getPlayfulLevel()));
								System.out.println(String.format("Hunger: %d", pet.getHungerLevel()));
								System.out.println(String.format("Tiredness: %d", pet.getTiredLevel()));
								System.out.println(String.format("Actions: %d", pet.getActions()));
								
							}
						}
					}
				}else{
					System.out.println(String.format("%s, you do not have any items in your inventory that you can use, so you are being redirected to the previous menu", player.getName()));
					again = false;
				}
			}
		}while(again);
	}
	
	public void viewPetStats(Animal pet){
		pet.viewPetStats();
		System.out.println("Enter anything to get back to menu");
		input.nextLine();
	}
	
	public int askNumPets(String prompt, String errorMessage){
		int numPets = 0;
		boolean again = false;
		do{
			System.out.println(prompt);
			String tryNumPets = input.nextLine();
			tryNumPets = tryNumPets.trim();
			if(tryNumPets.equals("1")|| tryNumPets.equals("2") || tryNumPets.equals("3")){
				again = false;
				numPets = Integer.valueOf(tryNumPets);
			}else{
				again = true;
				System.out.println(errorMessage);
			}
		}while(again);
		return numPets;
	}
	
	public String askName(String prompt, String errorMessage){
		boolean again = false;
		String name = null;
		do{
			System.out.println(prompt);
			String tryName = input.nextLine();
			tryName = tryName.trim();
			if(namesList.contains(tryName)){
				again = true;
				System.out.println(errorMessage);
			}else{
				again = false;
				name = tryName;
				namesList.add(name);
			}
		}while(again);
		return name;
	}
	
	public boolean payForTreatment(Animal pet, Player player){
		boolean again = true;
		boolean paying = false;
		int treatmentCost = 150;
		do{
			System.out.println(String.format("%s, your pet %s is sick", player.getName(), pet.getName()));
			System.out.println(String.format("You have the option of paying for treatment for %s, which will make %s better, and give them a boost in happiness.", pet.getName(), pet.getName()));
			System.out.println(String.format("Your current balance is %d coins", player.getBalance()));
			System.out.println(String.format("If you do not treat %s, then they will remain sick. Enter 1 to pay for treatment for %s, which costs %d coins, or 2 to skip treatment", pet.getName(), pet.getName(), treatmentCost));
			String tryTreatment = input.nextLine();
			tryTreatment = tryTreatment.trim();
			if(tryTreatment.equals("1")){
				if(player.getBalance() - treatmentCost < 0){
					paying = false;
					again = false;
					System.out.println(String.format("%s, you do not have enough coins to pay for treatment, so %s will remain sick", player.getName(), pet.getName()));
				}else{
					player.setBalance(player.getBalance() - treatmentCost);
					paying = true;
					again = false;
					System.out.println(String.format("%s, you have chosen to treat %s, so they are not longer sick", player.getName(), pet.getName()));
				}
			}else if(tryTreatment.equals("2")){
				paying = false;
				again = false;
				System.out.println(String.format("%s, you have chosen not to treat %s, so they will remain sick", player.getName(), pet.getName()));
			}else{
				again = true;
				System.out.println("Error: your input is invalid. Please enter '1' or '2'.");
			}
		}while(again);
		return paying;
	}
	
	public void makePetSick(Animal pet, Player player){
		int happinessImprovement = 30;
		if(pet.getIsSick() == false){
			if(pet.getIsAlive() == true){
				boolean paying = this.payForTreatment(pet, player);
				if(paying == true){
					if(pet.getMood() + happinessImprovement >= 100){
						pet.setMood(100);
					}else{
						pet.setMood(pet.getMood() + happinessImprovement);
					}
					System.out.println(String.format("%s, your pet %s now has mood: %d", player.getName(), pet.getName(), pet.getMood()));
					pet.setIsSick(false);
				}else{
					pet.setIsSick(true);
				}
			}
		}
	}
	
	public boolean punishPet(Animal pet, Player player){
		boolean again = true;
		boolean punishing = false;
		do{
			System.out.println(String.format("%s, your pet %s is misbehaving", player.getName(), pet.getName()));
			System.out.println(String.format("If you punish %s, they will stop misbehaving and will make them sadder. If you do not punish %s they will continue misbehaving. Enter 1 to punish %s, or 2 to skip punishment", pet.getName(), pet.getName(), pet.getName()));
			String tryPunish = input.nextLine();
			tryPunish = tryPunish.trim();
			if(tryPunish.equals("1")){
				punishing = true;
				again = false;
				System.out.println(String.format("%s, you have chosen to punish %s, so they are no longer misbehaving", player.getName(), pet.getName()));
			}else if(tryPunish.equals("2")){
				punishing = false;
				again = false;
				System.out.println(String.format("%s, you have chosen not to punish %s, so they will continue misbehaving", player.getName(), pet.getName()));
			}else{
				again = true;
				System.out.println("Error: your input is invalid. Please enter '1' or '2'.");
			}
		}while(again);
		return punishing;
	}
	
	public void makePetMisbehave(Animal pet, Player player){
		int happinessDecrease = 30;
		if(pet.getIsMisbehaving() == false){
			if(pet.getIsMisbehaving() == false){
				boolean punishing = this.punishPet(pet, player);
				if(punishing == true){
					if(pet.getMood() - happinessDecrease <= 0){
						pet.setMood(0);
					}else{
						pet.setMood(pet.getMood() - happinessDecrease);
					}
					System.out.println(String.format("%s, your pet %s now has mood: %d", player.getName(), pet.getName(), pet.getMood()));
					pet.setIsMisbehaving(false);
				}else{
					pet.setIsMisbehaving(true);
				}
			}
		}
	}
	
	public void randomEventPicker(Player p, Animal pet){
		int rand = GameEnvironment.randomObject.nextInt(15);
		if(rand == 0){
			this.makePetSick(pet, p);
		}
		rand = GameEnvironment.randomObject.nextInt(15);
		if(rand == 0){
			this.makePetMisbehave(pet, p);
		}
	}
	
	public Animal printListPetChoices(ArrayList<Animal> todayPets, Player p){
		boolean again = true;
		Animal chosenPet = null;
		int tryChoice;
		do{
			System.out.println(String.format("%s, your pet choices available for interaction today:", p.getName()));
			for(int i=0; i<todayPets.size(); i++){
				System.out.println(String.format("%d. %s (%s)", i+1, todayPets.get(i).getName(), todayPets.get(i).getClassName()));
			}
			System.out.println(String.format("%s, please enter the number beside which pet you would like to use today, or enter 0 to finish your day", p.getName()));
			try{
				tryChoice = input.nextInt();
				input.nextLine();
			}catch(InputMismatchException ime){
				input.nextLine();
				System.out.println("Error: please enter either the number beside the pet you would like to use, or 0 to finish your day");
				again = true;
				continue;
			}
			if(tryChoice == 0){
				chosenPet = null;
				again = false;
			}else if(tryChoice > 0 && tryChoice <= p.getNumPets()){
				chosenPet = todayPets.get(tryChoice - 1);
				again = false;
			}else{
				System.out.println("Error: please enter either the number beside the pet you would like to use, or 0 to finish your day");
				again = true;
			}
		}while(again);
		return chosenPet;
	}
	
	public int givePetOptions(Player p, Animal pet){
		boolean again = true;
		int choice = 0;
		int tryChoice;
		do{
			System.out.println(String.format("%s, your current pet is %s. %s has perfromed %d/2 of their actions for the day. Your options for today are:", p.getName(), pet.getName(), pet.getName(), pet.getActions()));
			System.out.println("0. Go back to pet choice");
			System.out.println("1. View Pet Stats");
			System.out.println("2. Go to Store");
			System.out.println("3. Go to your Inventory [actions available]");
			System.out.println("4. Put your pet to sleep [action]");
			System.out.println("5. Let your pet visit the bathroom [action]");
			System.out.println("6. Skip the rest of this pet's actions for the day");
			System.out.println("7. Skip the rest of your day (all pets)");
			try{
				tryChoice = input.nextInt();
				input.nextLine();
			}catch(InputMismatchException ime){
				input.nextLine();
				System.out.println("Error: please enter the number beside the option you would like to choose. Whole number between 0 and 7.");
				again = true;
				continue;
			}
			if(tryChoice < 0 || tryChoice > 7){
				System.out.println("Error: please enter the number beside the option you would like to choose. Whole number between 0 and 7.");
				again = true;
			}else{
				choice = tryChoice;
				again = false;
			}
		}while(again);
		return choice;
	}
	
	public boolean willRevivePet(Animal pet, Player player){
		boolean again = true;
		boolean reviving = false;
		do{
			System.out.println(String.format("%s, your pet %s has died as their stats have fallen too low.", player.getName(), pet.getName()));
			System.out.println(String.format("You have the option to revive your pet from death (this can only be done once in their lifetime). To revive your pet, enter 1, to continue without reviving them, enter 2."));
			String tryRevive = input.nextLine();
			tryRevive = tryRevive.trim();
			if(tryRevive.equals("1")){
				reviving = true;
				again = false;
				System.out.println(String.format("%s, your pet %s has been revived from death.", player.getName(), pet.getName()));
			}else if(tryRevive.equals("2")){
				reviving = false;
				again = false;
				System.out.println(String.format("%s, you have chosen not to revive %s, so they are dead, and will remain dead for the rest of the game.", player.getName(), pet.getName()));
			}else{
				again = true;
				System.out.println("Error: your input is invalid. Please enter '1' or '2'");
			}
		}while(again);
		return reviving;
	}
	
	public void updatePetAliveStats(Player player){
		boolean shouldBeDead = false;
		for(Animal pet : player.PLAYERS_PETS){
			shouldBeDead = false;
			shouldBeDead = pet.shouldPetBeDead();
			if(shouldBeDead && pet.getIsAlive()){
				pet.setIsAlive(false);
				if(pet.getBeenRevived() == true){
					System.out.println(String.format("%s, your pet %s has died. %s has been revived once before, and cannot be revived again, so will remain dead for the rest of the game.", player.getName(), pet.getName(), pet.getName()));
				}else{
					boolean reviving = this.willRevivePet(pet, player);
					if(reviving == true){
						pet.setIsAlive(true);
						pet.setBeenRevived(true);
					}
				}
			}
		}
	}
	
	public void playGame(){
		boolean playerDayGoing = true;
		boolean petDayGoing = true;
		for(int day = 1; day < NUM_DAYS+1; day++){
			System.out.println("===================================");
			System.out.println(String.format("         DAY %d", day));
			System.out.println("===================================");
			for(Player p : PLAYER_LIST){
				playerDayGoing = true;
				ArrayList<Animal> todayPets = new ArrayList<Animal>();
				for(Animal pet : p.PLAYERS_PETS){
					if(pet.getIsAlive() == true){
						pet.dailyUpdateStats();
						todayPets.add(pet);
						this.randomEventPicker(p, pet);
					}
				}
				do{
					for(Iterator<Animal> it = todayPets.iterator(); it.hasNext();){
						if(it.next().getActions() >= 2){
							it.remove();
						}
					}
					if(todayPets.size() == 0){
						System.out.println(String.format("%s, you do not have any remaining actions to perform on any pets today, so it is the end of day %d for you.", p.getName(), day));
						playerDayGoing = false;
					}else{
						Animal chosen = this.printListPetChoices(todayPets, p);
						if(chosen == null){
							playerDayGoing = false;
						}else{
							petDayGoing = true;
							do{
								if(chosen.getActions() >= 2){
									System.out.println(String.format("Sorry %s, your pet %s has run out of actions for the day.", p.getName(), chosen.getName()));
									petDayGoing = false;
								}else{
									int choice = this.givePetOptions(p, chosen);
									if(choice == 0){
										break;
									}else if(choice == 1){
										this.viewPetStats(chosen);
									}else if(choice == 2){
										this.goToStore(p);
									}else if(choice == 3){
										this.goToInventory(p, chosen);
									}else if(choice == 4){
										chosen.sleep();
										System.out.println(String.format("%s, %s went to sleep. Their updated stats are:", p.getName(), chosen.getName()));
										System.out.println(String.format("Tiredness: %d", chosen.getTiredLevel()));
										System.out.println(String.format("Actions: %d", chosen.getActions()));
									}else if(choice == 5){
										chosen.toilet();
										System.out.println(String.format("%s, %s went to the bathroom. Their updated stats are:", p.getName(), chosen.getName()));
										System.out.println(String.format("Toilet Need: %d", chosen.getToiletLevel()));
										System.out.println(String.format("Weight: %.2f", chosen.getWeight()));
										System.out.println(String.format("Actions: %d", chosen.getActions()));
									}else if(choice == 6){
										System.out.println(String.format("%s has no remaining actions for the day.", chosen.getName()));
										chosen.setActions(2);
										petDayGoing = false;
									}else if(choice == 7){
										System.out.println(String.format("%s, you have finished day %d", p.getName(), day));
										petDayGoing = false;
										playerDayGoing = false;
									}
								}
							}while(petDayGoing);
						}
					}
				}while(playerDayGoing);
				/* figure out if any of the pets should die */
				this.updatePetAliveStats(p);
				p.dailyUpdateScore();
			}
		}
		this.finishGame();
	}
	
	public void finishGame(){
		System.out.println("Thank you for playing!");
		System.out.println("Final Scores:");
		int[] endScores = new int[NUM_PLAYERS];
		for(int i = 0; i < PLAYER_LIST.length; i++){
			Player player = PLAYER_LIST[i];
			endScores[i] = player.getScore();
			System.out.println(String.format("%s, your final score is: %d", player.getName(), player.getScore()));
		}
	}
	
	public void askHelp(){
		System.out.println("hi");
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		GameEnvironment game = new GameEnvironment();
		game.playGame();
	}
}
