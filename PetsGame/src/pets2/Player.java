package pets2;

import java.util.ArrayList;
import java.util.HashMap;

import pets2.Food;
import pets2.Animal;
import pets2.Toy;
import pets2.GameEnvironment;

public class Player {
	private final String NAME;
	private int balance;
	private final int NUM_PETS;
	public final Animal[] PLAYERS_PETS;
	public HashMap<String, ArrayList<Toy>> playersToys;
	public HashMap<String, ArrayList<Food>> playersFood;
	public int score;
	
	public Player(String playerName, int amountPets, GameEnvironment game){
		NAME = playerName;
		NUM_PETS = amountPets;
		balance = 80 * NUM_PETS * game.getNumDays();
		PLAYERS_PETS = new Animal[NUM_PETS];
		playersToys = new HashMap<String, ArrayList<Toy>>();
		playersFood = new HashMap<String, ArrayList<Food>>();
		for(Toy toy : GameEnvironment.toysAvailable){
			String toyName = toy.getName();
			ArrayList<Toy> empty = new ArrayList<Toy>();
			playersToys.put(toyName, empty);
		}
		for(Food food : GameEnvironment.foodAvailable){
			String foodName = food.getName();
			ArrayList<Food> empty = new ArrayList<Food>();
			playersFood.put(foodName, empty);
		}
		score = 0;
	}

	/**
	 * @return the balance
	 */
	public int getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(int balance) {
		this.balance = balance;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}

	/**
	 * @return the PLAYER_NAME
	 */
	public String getName() {
		return NAME;
	}

	/**
	 * @return the NUM_PETS
	 */
	public int getNumPets() {
		return NUM_PETS;
	}

	/**
	 * @return the PLAYERS_PETS
	 */
	public Animal[] getPlayersPets() {
		return PLAYERS_PETS;
	}
	
	public void purchaseFood(Food food, String foodName, int foodPrice){
		ArrayList<Food> foodList = playersFood.get(foodName);
		foodList.add(food);
		this.playersFood.put(foodName, foodList);
		this.setBalance(this.getBalance() - foodPrice);
	}
	
	public void purchaseToy(Toy toy, String toyName, int toyPrice){
		ArrayList<Toy> toyList = playersToys.get(toyName);
		toyList.add(toy);
		this.playersToys.put(toyName, toyList);
		this.setBalance(this.getBalance() - toyPrice);
	}
	
	public void printBalance(){
		System.out.println(String.format("%s, your balance is %d coins", this.getName(), this.getBalance()));
	}
	
	public void printSummaryInventory(){
		System.out.println(String.format("%s, your inventory contains:", this.getName()));
		System.out.println("Foods:");
		int foodCount;
		int toyCount;
		for(Food food : GameEnvironment.foodAvailable){
			String foodName = food.getName();
			foodCount = playersFood.get(foodName).size();
			System.out.println(String.format("%s x%d", foodName, foodCount));
		}
		for(Toy toy : GameEnvironment.toysAvailable){
			String toyName = toy.getName();
			toyCount = playersToys.get(toyName).size();
			System.out.println(String.format("%s x%d", toyName, toyCount));
		}
	}
	
	public void printInventory(){
		System.out.println(String.format("%s, your inventory contains:", this.getName()));
		System.out.println("Foods:");
		int i = 0;
		int foodCount;
		int toyCount;
		String foodName;
		String toyName;
		for(i = 0; i<GameEnvironment.foodAvailable.length; i++){
			foodName = GameEnvironment.foodAvailable[i].getName();
			foodCount = playersFood.get(foodName).size();
			System.out.println(String.format("%d. %s x%d", i+1, foodName, foodCount));
		}
		System.out.println("Toys");
		for(int c = 0; c<GameEnvironment.toysAvailable.length; c++){
			toyName = GameEnvironment.toysAvailable[c].getName();
			toyCount = playersToys.get(toyName).size();
			System.out.println(String.format("%d. %s x%d", (i+c+1), toyName, toyCount));
		}
		System.out.println();;
	}
	
	public boolean inventoryEmpty(){
		boolean empty = true;
		int itemCount = 0;
		String foodName;
		String toyName;
		for(int i=0; i<GameEnvironment.foodAvailable.length; i++){
			foodName = GameEnvironment.foodAvailable[i].getName();
			itemCount = playersFood.get(foodName).size();
			if(itemCount != 0){
				empty = false;
			}
		}
		if(empty == false){
			return empty;
		}
		for(int i=0; i<GameEnvironment.toysAvailable.length; i++){
			toyName = GameEnvironment.toysAvailable[i].getName();
			itemCount = playersToys.get(toyName).size();
			if(itemCount != 0){
				empty = false;
			}
		}
		return empty;
	}
	
	public Food removeFoodFromInventory(String foodName){
		ArrayList<Food> newFoodList = playersFood.get(foodName);
		Food f = newFoodList.remove(0);
		playersFood.put(foodName, newFoodList);
		return f;
	}
	
	public void removeToyFromInventory(String toyName){
		ArrayList<Toy> newToyList = playersToys.get(toyName);
		newToyList.remove(0);
		playersToys.put(toyName, newToyList);
		
	}
	
	public void dailyUpdateScore(){
		int petScore;
		for(Animal pet : PLAYERS_PETS){
			petScore = pet.calculatePetDailyScore();
			this.setScore(this.getScore() + petScore);
		}
	}
}
