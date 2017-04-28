package pets;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.String;
import java.util.Random;
import java.util.Iterator;

/**
 * The GameEnvironment class is the main class that runs the game.
 * @author ltt19
 *
 */
public class GameEnvironment {
	
	/**
	 * @param PLAYER_LIST The list of player instances, the size of which is the number of players.
	 * @param NUM_DAYS The number of "days" the game will run for, as specified by the player(s)
	 * @param NUM_PLAYERS The number of players in this instance of the game
	
	 * @param PIZZA The Food object PIZZA, with nutritional value of 40, tastiness of 90, and price of 70.
	 * @param CHOCOLATE The Food object CHOCOLATE, with nutritional value of 30, tastiness of 95, and price of 30.
	 * @param BURGER The Food object BURGER, with nutritional value of 40, tastiness of 75, and price of 50.
	 * @param SPAGHETTI The Food object SPAHGETTI, with nutritional value of 50, tastiness of 50, and price of 20.
	 * @param BURRITOS The Food object BURRITOS, with nutritional value of 70, tastiness of 70, and price of 70.
	 * @param KALE The Food object KALE, with nutritional value of 100, tastiness of 20, and price of 50.
	 * @param BALL The Toy object BALL, with price 40, and exercise required of 35.
	 * @param TWINE The Toy object TWINE, with price 20, and exercise required of 20.
	 * @param TEDDY_BEAR The Toy object TEDDY_BEAR, with price 60, and exercise required of 10.
	 * @param CHEW_TOY The Toy object CHEW_TOY, with price 75, and exercise required of 40.
	 * @param BELL The Toy object BELL, with price 40, and exercise required of 15.
	 * @param PLAYHOUSE The Toy object PLAYHOUSE, with price 100, and exercise required of 50.
	 * @param DOG The Species object DOG.
	 * @param CAT The Species object CAT.
	 * @param BIRD The Species object BIRD.
	 * @param SNAKE The Species object SNAKE.
	 * @param LION The Species object LION.
	 * @param PANDA The Species object PANDA.
	 * @param foodAvailable The list of foods available for use in the game.
	 * @param toysAvailable The list of toys available for use in the game.
	 * @param speciesAvailable The list of species available for the player to choose from
	 * @param namesList The list of names that have been used within the game, as player or pet names.
	 * @param input The scanner that will handle the keyboard input for the commandline.
	 */

	public final Player[] PLAYER_LIST;
	public final int NUM_DAYS;
	public final int NUM_PLAYERS;
	public final ArrayList<Pet> PETS_LIST; 
	
	public ArrayList<String> namesList;
	public static final Scanner input = new Scanner(System.in);
	public static Random randomObject = new Random();
	
	
	public static final Food PIZZA = new Food("Pizza", 40, 90, 70);
	public static final Food CHOCOLATE = new Food("Chocolate (Dog Friendly)", 30, 95, 30);
	public static final Food BURGER = new Food("Burger", 40, 75, 50);
	public static final Food SPAGHETTI = new Food("Spaghetti", 50, 50, 20);
	public static final Food BURRITOS = new Food("Burritos", 70, 70, 70);
	public static final Food KALE = new Food("Kale", 100, 20, 50);
	
	
	public static final Toy BALL = new Toy("Ball", 40, 35);
	public static final Toy TWINE = new Toy("Twine", 20, 20);
	public static final Toy TEDDY_BEAR = new Toy("Teddy Bear", 60, 10);
	public static final Toy CHEW_TOY = new Toy("Chew Toy", 75, 40);
	public static final Toy BELL = new Toy("Bell", 40, 15);
	public static final Toy PLAYHOUSE = new Toy("Play House", 100, 50);
	
	public static final Species DOG = new Species("Dog", BALL, CHOCOLATE, 20, 30, 10, 40, 30, 22);
	public static final Species CAT = new Species("Cat", TWINE, PIZZA, 15, 15, 40, 30, 10, 5);
	public static final Species BIRD = new Species("Bird", BELL, KALE, 10, 20, 10, 10, 50, 1);
	public static final Species SNAKE = new Species("Snake", TEDDY_BEAR, BURGER, 20, 30, 20, 20, 5, 2);
	public static final Species LION = new Species("Lion", CHEW_TOY, BURRITOS, 30, 40, 30, 20, 10, 175);
	public static final Species PANDA = new Species("Panda", PLAYHOUSE, SPAGHETTI, 10, 30, 20, 20, 20, 70);
	
	public static final Food[] foodAvailable = {PIZZA, CHOCOLATE, BURGER, SPAGHETTI, BURRITOS, KALE};
	public static final Toy[] toysAvailable = {BALL, TWINE, TEDDY_BEAR, CHEW_TOY, BELL, PLAYHOUSE};
	public static final Species[] speciesAvailable = {DOG, CAT, BIRD, SNAKE, LION, PANDA};
	

	public GameEnvironment() throws IOException{
		NUM_PLAYERS = this.askNumPlayers();
		NUM_DAYS = this.askNumDays();
		PETS_LIST = new ArrayList<Pet>();
		namesList = new ArrayList<String>();
		PLAYER_LIST = this.setUpPlayers();
	}
	
	/**
	 * The getter method for the property PLAYER_LIST.
	 * @return Returns the list of players in the game.
	 */
	public Player[] getPlayerList(){
		return PLAYER_LIST;
	}
	
	/**
	 * The getter method for the property speciesAvailable.
	 * @return Returns the list of species available for the player to choose from.
	 */
	public Species[] getSpeciesAvailable(){
		return speciesAvailable;
	}
	
	/**
	 * The getter method for the property NUM_DAYS.
	 * @return Returns the number of days the game will be played for.
	 */
	public int getNumDays(){
		return NUM_DAYS;
	}
	
	/**
	 * The getter method for the property NUM_PLAYERS.
	 * @return Returns the number of players in the game.
	 */
	public int getNumPlayers(){
		return NUM_PLAYERS;
	}
	
	
	/**
	 * The getter method for the property foodAvailable.
	 * @return Returns the foods available within the game.
	 */
	public static Food[] getFoodAvailable(){
		return foodAvailable;
	}
	
	/**
	 * The getter method for the property toysAvailable.
	 * @return Returns the toys available within the game.
	 */
	public static Toy[] getToysAvailable(){
		return toysAvailable;
	}
	
	
	/**
	 * The getter method for the property namesList.
	 * @return Returns the list of names that have been used within the game, as player or pet names.
	 */
	public ArrayList<String> getNamesList(){
		return namesList;
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
	
	/**
	 * The method for the property number of players.
	 * Maximum players is 4 and minimum require is 1.
	 * Screen will display error message if the input out of range or type in other things.
	 * @return Return how many players will play the game together. 
	 * @throws IOException 
	 */
	public int askNumPlayers() throws IOException{
		int players = 1;
		while (true){
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
	
	
	/**
	 * The method for the property number of playing days.
	 * The range of days from 1-30.
	 * It will display error message if player types number out of the range or anything else.
	 * @return Return the number of days which players want to play in the game.
	 * @throws IOException 
	 */
	public int askNumDays() throws IOException{
		int days = 0;	
		while (true){
			try{
		    	System.out.println("Please enter how many days you would like to play the game for (between 1 and 30), or enter 0 to view the rules of the game.");
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
	
	
	public Species chooseSpecies(String prompt, String errorMessage){
		Species pSpecies = null;
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
				pSpecies = speciesAvailable[Integer.valueOf(trySpecies) - 1];
			}else{
				again = true;
				System.out.println(errorMessage);
			}
		}while(again);
		return pSpecies;
	}
	
	public void printSpeciesListNum(){
		for(int i = 0; i < speciesAvailable.length; i++){
			Species s = speciesAvailable[i];
			System.out.println(String.format("%d. %s", i + 1, s.getSpeciesName()));
		}
	}
	
	public void printSpeciesList(){
		for(int i = 0; i < speciesAvailable.length; i++){
			Species s = speciesAvailable[i];
			System.out.println(String.format("%s", s.getSpeciesName()));
		}
	}
	
	public void chooseViewSpeciesStats(){
		boolean again = true;
		do{
			System.out.println("The species available to you are:");
			this.printSpeciesListNum();
			System.out.println("Please enter the number beside the species that you would like to view the stats of, or 0 to go back.");
			String trySpecies = input.nextLine();
			trySpecies = trySpecies.trim();
			if(trySpecies.equals("0")){
				again = false;
			}else if(trySpecies.equals("1") || trySpecies.equals("2") || trySpecies.equals("3") || trySpecies.equals("4") || trySpecies.equals("5") || trySpecies.equals("6")){
				again = false;
				Species pSpecies = speciesAvailable[Integer.valueOf(trySpecies) - 1];
				pSpecies.printSpeciesStats();
			}else{
				again = true;
				System.out.println("Please enter a valid species number between 1 and 6, or enter 0 to go back.");
			}
		}while(again);
	}
	
	public Species speciesStatsOrCon(String pName, int petNum){
		boolean again = true;
		Species pSpecies = null;
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
				pSpecies = this.chooseSpecies(String.format("%s, please choose the species of pet %d. Enter the number beside the species you would like to choose, or 0 to go back.", pName, petNum), String.format("%s, you must choose from 1, 2, 3, 4, 5, or 6.", pName));
				again = false;
				if(pSpecies == null){
					again = true;
				}
			}
		}while(again);
		return pSpecies;
	}
	
	public Player[] setUpPlayers(){
		Player[] players = new Player[this.getNumPlayers()];
		for(int pNum = 1; pNum < this.getNumPlayers() + 1; pNum++){
			String pName = this.askName(String.format("Player %d, please choose a name", pNum), String.format("Player %d, the name you entered has already been used, please choose another.", pNum));
			int pNumPets = this.askNumPets(String.format("%s, please enter how many pets you would like to use in the game. Must be 1, 2, or 3.", pName), String.format("%s, your number of pets was not valid, you must choose 1, 2, or 3 pets.", pName));
			players[pNum-1] = new Player(pName, pNumPets, this);
			for(int petNum = 1; petNum < pNumPets + 1; petNum++){
				Species pSpecies = this.speciesStatsOrCon(pName, petNum);
				String petName = this.askName(String.format("%s, please choose a name for your pet of species %s.", pName, pSpecies.getSpeciesName()), String.format("%s, the name you entered has already been used, please choose another", pName));
				Pet newPet = new Pet(petName, pSpecies);
				players[pNum-1].PLAYERS_PETS[petNum-1] = newPet;
				this.PETS_LIST.add(newPet);
			}
		}
		return players;
	}
	
	public void printStore(){
		System.out.println("The items available for you to purchase in the store are as follows:");
		System.out.println("Foods");
		int i = 0;
		for(i = 0; i<foodAvailable.length; i++){
			Food f = foodAvailable[i];
			System.out.println(String.format("%d. %s. Nutrition: %d/100. Tastiness: %d/100. Price: %d coins.", i + 1, f.getFoodName(), f.getNutritionalValue(), f.getTastiness(), f.getFoodPrice()));
		}
		System.out.println("Toys:");
		for(int n = 0; n<toysAvailable.length; n++){
			Toy t = toysAvailable[n];
			System.out.println(String.format("%d. %s. Exercise done by pet when used: %d/100. Price: %d coins.", (i + n + 1), t.getToyName(), t.getExerciseRequired(), t.getToyPrice()));
		}
	}
	
	public void askForPurchase(Player p){
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
				break;
			}
			if(tryInt == 0){
				again = false;
				System.out.println("You have left the store");
			}else if(tryInt > (foodAvailable.length + toysAvailable.length) || tryInt < 0){
				System.out.println("Please enter a valid store code");
			}else{
				if(tryInt < foodAvailable.length + 1){
					Food f = foodAvailable[tryInt - 1];
					if(p.getBalance() - f.getFoodPrice() < 0){
						System.out.println("You do not have sufficient funds to make this purchase.");
					}else{
						System.out.println(String.format("%s, you have purchased %s", p.getPlayerName(), f.getFoodName()));
						p.purchaseFood(f);
						p.printSummaryInventory();
						p.printBalance();
					}
					this.printStore();
				}else{
					Toy t = toysAvailable[tryInt - foodAvailable.length - 1];
					if(p.getBalance() - t.getToyPrice() < 0){
						System.out.println("You do not have sufficient funds to make this purchase.");
					}else{
						System.out.println(String.format("%s, you have purchased %s", p.getPlayerName(), t.getToyName()));
						p.purchaseToy(t);
						p.printSummaryInventory();
						p.printBalance();
					}
					this.printStore();
				}
			}
		}while(again);
	}
	
	public void goToStore(Player p){
		p.printSummaryInventory();
		p.printBalance();
		this.printStore();
		this.askForPurchase(p);
	}
	
	public void goToInventory(Player p, Pet pet){
		boolean again = true;
		boolean broken = false;
		int tryInt;
		do{
			p.printInventory();
			if(p.inventoryEmpty() == false){
				System.out.println("Select the item in your inventory you would like to use [counts as action] (foods will be eaten, toys will be played with) by entering the number beside the item, or exit inventory by entering 0");
				try{
					tryInt = input.nextInt();
					input.nextLine();
				}catch(InputMismatchException ime){
					input.nextLine();
					System.out.println("Please either enter the number beside the item you would like to use, or 0 to exit the inventory");
					again = true;
					break;
				}
				if(tryInt == 0){
					again = false;
					System.out.println("You have left your inventory");
				}else if(tryInt > (foodAvailable.length + toysAvailable.length) || tryInt < 0){
					System.out.println("Please enter a valid item code");
				}else{
					if(tryInt < foodAvailable.length + 1){
						Food f = foodAvailable[tryInt - 1];
						if(p.playersFood.get(f) == 0){
							again = true;
							System.out.println(String.format("There are 0 %s in your inventory, please choose a different food", f.getFoodName()));
						}else{
							p.removeFromInventory(f);
							pet.feed(f);
							System.out.println(String.format("%s, your pet %s has been fed %s. Updated stats:", p.getPlayerName(), pet.getPetName(), f.getFoodName()));
							System.out.println(String.format("Hunger Level: %d", pet.getHungerLevel()));
							System.out.println(String.format("Mood: %d", pet.getMood()));
							System.out.println(String.format("Weight: %.2f", pet.getWeight()));
							System.out.println(String.format("Toilet Need: %d", pet.getToiletLevel()));
							System.out.println(String.format("Actions: %d", pet.getActions()));
						}
					}else{
						Toy t = toysAvailable[tryInt - foodAvailable.length - 1];
						if(p.playersToys.get(t) == 0){
							again = true;
							System.out.println(String.format("There are 0 %s in your inventory, please choose a different toy", t.getToyName()));
						}else{
							broken = pet.play(t);
							if(broken){
								p.removeFromInventory(t);
								System.out.println(String.format("%s has broken, and has been removed from your inventory", t.getToyName()));
							}else{
								System.out.println(String.format("The current quality of %s is %d/100", t.getToyName(), t.getToyQuality()));
							}
							System.out.println(String.format("%s, your pet %s has played with %s. Updated stats:", p.getPlayerName(), pet.getPetName(), t.getToyName()));
							System.out.println(String.format("Mood: %d", pet.getMood()));
							System.out.println(String.format("Playfulness: %d", pet.getPlayfulLevel()));
							System.out.println(String.format("Hunger: %d", pet.getHungerLevel()));
							System.out.println(String.format("Tiredness: %d", pet.getTiredLevel()));
							
						}
					}
				}
			}else{
				System.out.println(String.format("%s, you do not have any items in your inventory that you can use, so you are being redirected to the previous menu", p.getPlayerName()));
				again = false;
			}
		}while(again);
	}

	
	public void viewPetStats(Pet pet){
		pet.viewPetStats();
		System.out.println("Enter anything to get back to menu");
		input.nextLine();
	}
	/**
	 * 
	 */
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
	
	/**
	 * 
	 */
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
	
	public boolean payForTreatment(Pet pet, Player player){
		boolean again = true;
		boolean paying = false;
		int treatmentCost = 150;
		do{
			System.out.println(String.format("%s, your pet %s is sick", player.getPlayerName(), pet.getPetName()));
			System.out.println(String.format("You have the option of paying for treatment for %s, which will make %s better, and give them a boost in happiness.", pet.getPetName(), pet.getPetName()));
			System.out.println(String.format("Your current balance is %d coins", player.getBalance()));
			System.out.println(String.format("If you do not treat %s, then they will remain sick. Enter 1 to pay for treatment for %s, which costs %d coins, or 2 to skip treatment", pet.getPetName(), pet.getPetName(), treatmentCost));
			String tryTreatment = input.nextLine();
			tryTreatment = tryTreatment.trim();
			if(tryTreatment.equals("1")){
				if(player.getBalance() - treatmentCost < 0){
					paying = false;
					again = false;
					System.out.println(String.format("%s, you do not have enough coins to pay for treatment, so %s will remain sick", player.getPlayerName(), pet.getPetName()));
				}else{
					player.setBalance(player.getBalance() - treatmentCost);
					paying = true;
					again = false;
					System.out.println(String.format("%s, you have chosen to treat %s, so they are not longer sick", player.getPlayerName(), pet.getPetName()));
				}
			}else if(tryTreatment.equals("2")){
				paying = false;
				again = false;
				System.out.println(String.format("%s, you have chosen not to treat %s, so they will remain sick", player.getPlayerName(), pet.getPetName()));
			}else{
				again = true;
				System.out.println("Error: your input is invalid. Please enter '1' or '2'.");
			}
		}while(again);
		return paying;
	}
	
	public void makePetSick(Pet pet, Player player){
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
					System.out.println(String.format("%s, your pet %s now has mood: %d", player.getPlayerName(), pet.getPetName(), pet.getMood()));
					pet.setIsSick(false);
				}else{
					pet.setIsSick(true);
				}
			}
		}
	}
	
	public boolean punishPet(Pet pet, Player player){
		boolean again = true;
		boolean punishing = false;
		do{
			System.out.println(String.format("%s, your pet %s is misbehaving", player.getPlayerName(), pet.getPetName()));
			System.out.println(String.format("If you punish %s, they will stop misbehaving and will make them sadder. If you do not punish %s they will continue misbehaving. Enter 1 to punish %s, or 2 to skip punishment", pet.getPetName(), pet.getPetName(), pet.getPetName()));
			String tryPunish = input.nextLine();
			tryPunish = tryPunish.trim();
			if(tryPunish.equals("1")){
				punishing = true;
				again = false;
				System.out.println(String.format("%s, you have chosen to punish %s, so they are no longer misbehaving", player.getPlayerName(), pet.getPetName()));
			}else if(tryPunish.equals("2")){
				punishing = false;
				again = false;
				System.out.println(String.format("%s, you have chosen not to punish %s, so they will continue misbehaving", player.getPlayerName(), pet.getPetName()));
			}else{
				again = true;
				System.out.println("Error: your input is invalid. Please enter '1' or '2'.");
			}
		}while(again);
		return punishing;
	}
	
	public void makePetMisbehave(Pet pet, Player player){
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
					System.out.println(String.format("%s, your pet %s now has mood: %d", player.getPlayerName(), pet.getPetName(), pet.getMood()));
					pet.setIsMisbehaving(false);
				}else{
					pet.setIsMisbehaving(true);
				}
			}
		}
	}
	
	public void randomEventPicker(Player p, Pet pet){
		int rand = GameEnvironment.randomObject.nextInt(15);
		if(rand == 0){
			this.makePetSick(pet, p);
		}
		rand = GameEnvironment.randomObject.nextInt(15);
		if(rand == 0){
			this.makePetMisbehave(pet, p);
		}
	}
	
	public Pet printListPetChoices(ArrayList<Pet> todayPets, Player p){
		boolean again = true;
		Pet chosenPet = null;
		int tryChoice;
		do{
			System.out.println(String.format("%s, your pet choices available for interaction today:", p.getPlayerName()));
			for(int i=0; i<todayPets.size(); i++){
				System.out.println(String.format("%d. %s", i+1, todayPets.get(i).getPetName()));
			}
			System.out.println(String.format("%s, please enter the number beside which pet you would like to use today, or enter 0 to finish your day", p.getPlayerName()));
			try{
				tryChoice = input.nextInt();
				input.nextLine();
			}catch(InputMismatchException ime){
				input.nextLine();
				System.out.println("Error: please enter either the number beside the pet you would like to use, or 0 to finish your day");
				again = true;
				break;
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
	
	public int givePetOptions(Player p, Pet pet){
		boolean again = true;
		int choice = 0;
		int tryChoice;
		do{
			System.out.println(String.format("%s, your current pet is %s. %s has perfromed %d/2 of their actions for the day. Your options for today are:", p.getPlayerName(), pet.getPetName(), pet.getPetName(), pet.getActions()));
			System.out.println("0. Go back to pet choice");
			System.out.println("1. View Pet Stats");
			System.out.println("2. Go to Store");
			System.out.println("3. Go to your Inventory");
			System.out.println("4. Put your pet to sleep [action]");
			System.out.println("5. Let your pet visit the bathroom [action]");
			System.out.println("6. Skip the rest of this pet's actions for the day");
			System.out.println("7. Skip the rest of your day (all pets)");
			try{
				tryChoice = input.nextInt();
				input.nextLine();
			}catch(InputMismatchException ime){
				input.nextLine();
				System.out.println("Error: please enter the number beside the option you would like to choose. Whole number between 0 and 6.");
				again = true;
				break;
			}
			if(tryChoice < 0 || tryChoice > 7){
				System.out.println("Error: please enter the number beside the option you would like to choose. Whole number between 0 and 6.");
				again = true;
			}else{
				choice = tryChoice;
				again = false;
			}
		}while(again);
		return choice;
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
				ArrayList<Pet> todayPets = new ArrayList<Pet>();
				for(Pet pet : p.PLAYERS_PETS){
					pet.dailyUpdateStats();
					this.randomEventPicker(p, pet);
					if(pet.getIsAlive() == true){
						todayPets.add(pet);
					}
				}
				do{
					for(Iterator<Pet> it = todayPets.iterator(); it.hasNext();){
						if(it.next().getActions() >= 2){
							it.remove();
						}
					}
					if(todayPets.size() == 0){
						System.out.println(String.format("%s, you do not have any remaining actions to perform on any pets today, so it is the end of day %d for you.", p.getPlayerName(), day));
						playerDayGoing = false;
					}else{
						Pet chosen = this.printListPetChoices(todayPets, p);
						if(chosen == null){
							playerDayGoing = false;
						}else{
							petDayGoing = true;
							do{
								if(chosen.getActions() >= 2){
									System.out.println(String.format("Sorry %s, your pet %s has run out of actions for the day.", p.getPlayerName(), chosen.getPetName()));
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
										System.out.println(String.format("%s, %s went to sleep. Their updated stats are:", p.getPlayerName(), chosen.getPetName()));
										System.out.println(String.format("Tiredness: %d", chosen.getTiredLevel()));
										System.out.println(String.format("Actions: %d", chosen.getActions()));
									}else if(choice == 5){
										chosen.toilet();
										System.out.println(String.format("%s, %s went to the bathroom. Their updated stats are:", p.getPlayerName(), chosen.getPetName()));
										System.out.println(String.format("Toilet Need: %d", chosen.getToiletLevel()));
										System.out.println(String.format("Weight: %.2f", chosen.getWeight()));
										System.out.println(String.format("Actions: %d", chosen.getActions()));
									}else if(choice == 6){
										System.out.println(String.format("%s has no remaining actions for the day.", chosen.getPetName()));
										chosen.setActions(2);
										petDayGoing = false;
									}else if(choice == 7){
										System.out.println(String.format("%s, you have finished day %d", p.getPlayerName(), day));
										petDayGoing = false;
										playerDayGoing = false;
									}
								}
							}while(petDayGoing);
						}
					}
				}while(playerDayGoing);
			}
		}
		System.out.println("Thank you for playing!");
		this.finishGame();
	}
	
	public void finishGame(){
		
		// add for loop to sum the score
				
		
	}
	
	/**
	 * The method for the help section.
	 * @param tryNum The number of help section. 1 = Game Instruction; 2 = Tips for having a pet; 3 = Tips for buying stuff for pet; anything else = leave.
	 * @param tryAny The option of whether stay in help section or not. 1 = go back to help section; anything else = leave.
	 * @param errorMessage The content of error message when player type anything wrong.
	 */
	
	public void askHelp() throws IOException{
		
		while (true) {
			int tryNum = 0;
			String tryAny;
			try{
				System.out.println("HelpSection");
				System.out.println("1.Game Instruction");
				System.out.println("2.Tips for taking care of your pets");
				System.out.println("3.Tips for food and toy");
				System.out.println("Please type the number of section you would like to know or anything else to leave.");
				tryNum = input.nextInt();
				input.nextLine();
				if(tryNum == 1) {
					BufferedReader r = new BufferedReader(new FileReader("Game Instruction.txt"));
					String line = null;
					while ((line = r.readLine()) != null) {
						System.out.println(line);
					}
					r.close();
					System.out.println("");
					System.out.println("Type 'b' to back help menue or anything else to quit.");
					tryAny = input.next();
					input.nextLine();
					if(tryAny.equals("b")){
					}else{
						System.out.println("Good Luck!");
						break;
					}
			    }else if(tryNum == 2){
			    	BufferedReader r = new BufferedReader(new FileReader("Tips for taking care of your pets.txt"));
					String line = null;
					while ((line = r.readLine()) != null) {
						System.out.println(line);
					}
					r.close();
					System.out.println("");
					System.out.println("Type 'b' to back help menue or anything else to quit.");
					tryAny = input.next();
					input.nextLine();
					if(tryAny.equals("b")){
					}else{
						System.out.println("Good Luck!");
						break;
					}
				}else if(tryNum == 3) {
					BufferedReader r = new BufferedReader(new FileReader("Tips for food and toy.txt"));
					String line = null;
					while ((line = r.readLine()) != null) {
						System.out.println(line);
					}
					r.close();
					System.out.println("");
					System.out.println("Type 'b' to back help menue or anything else to quit.");
					tryAny = input.next();
					input.nextLine();
					if(tryAny.equals("b")){
					}else{
						System.out.println("Good Luck!");
						break;
					}
				}else{
					System.out.println("Good Luck!");
					break;	
				}
		}
		catch(InputMismatchException i)
	         {
				 input.nextLine();
	        	 System.out.println("Good Luck");
	        	 break;
	         }		
		}	
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		GameEnvironment game = new GameEnvironment();
		game.playGame();
	}

}

