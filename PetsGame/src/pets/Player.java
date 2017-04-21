package pets;
import java.util.HashMap;
/**
 * This class provides the information of a player in the game, this includes the player's name, balance, their pets and their inventory of food and toys.
 * @author ltt19
 */
public class Player {
	
	/**
	 * @param PLAYER_NAME The name of the player. Must be unique.
	 * @param balance The balance of the player available to be spent in the store.
	 * @param NUM_PETS The number of pets the player has chosen to have in the game.
	 * @param PLAYERS_PETS A list of the pets the player has in the game.
	 * @param playersToys A hashmap of the toys the player has in their inventory.
	 * @param playersFood A hashmap of the foods the player has in their inventory.
	 */
	private final String PLAYER_NAME;
	private int balance;
	private final int NUM_PETS;
	public final Pet[] PLAYERS_PETS;
	public HashMap<Toy, Integer> playersToys;
	public HashMap<Food, Integer> playersFood;
	
	/**
	 * The constructor method initialises the name, balance worked out for the number of pets and the number of days in the game, creates the empty inventory, and an empty list for the player's pets to be stored in.
	 * @param name The name of the player. Must be unique.
	 * @param amountPets The number of pets the player has chosen to have in the game.
	 * @param game The instance/object of the GameEnvironment that is being used.
	 */
	public Player(String name, int amountPets, GameEnvironment game){
		PLAYER_NAME = name;
		NUM_PETS = amountPets;
		balance = 70 * this.getNumPets() * game.getNumDays();
		PLAYERS_PETS = new Pet[this.getNumPets()];
		playersToys = new HashMap<Toy, Integer>();
		playersFood = new HashMap<Food, Integer>();
	}
	
	/**
	 * The getter method for the property PLAYER_NAME.
	 * @return Returns the name of the player.
	 */
	public String getPlayerName(){
		return PLAYER_NAME;
	}
	
	/**
	 * The getter method for the property balance.
	 * @return Returns the balance the player has available to spend in the store.
	 */
	public int getBalance(){
		return balance;
	}

	/**
	 * The getter method for the property NUM_PETS.
	 * @return Returns the number of pets the player has chosen to have in the game.
	 */
	public int getNumPets(){
		return NUM_PETS;
	}
	
	/**
	 * The getter method for the property PLAYERS_PETS.
	 * @return Returns a list of the pets the player has in the game.
	 */
	public Pet[] getPlayersPets(){
		return PLAYERS_PETS;
	}
	
	/**
	 * The setter method for the property balance.
	 * @param bal The value that the player's balance will be set to.
	 */
	public void setBalance(int bal){
		balance = bal;
	}
	
	/**
	 * This method purchases food from the store by adding the food to their food inventory, and deducting the price of the food from their balance.
	 * @param foodTBPurchased The food that the player is purchasing from the store.
	 */
	public void purchaseFood(Food foodTBPurchased){
		Integer i = playersFood.get(foodTBPurchased);
		if(i == null){
			playersFood.put(foodTBPurchased, 1);
		}else{
			playersFood.put(foodTBPurchased, i + 1);
		}
		this.setBalance(this.getBalance() - foodTBPurchased.getFoodPrice());
	}
	
	/**
	 * This method purchases a toy from the store by adding the toy to their toy inventory, and deducting the price of the toy from their balance.
	 * @param toyTBPurchased The toy the player is purchasing from the store.
	 */
	public void purchaseToy(Toy toyTBPurchased){
		Integer i = playersToys.get(toyTBPurchased);
		if(i == null){
			playersToys.put(toyTBPurchased, 1);
		}else{
			playersToys.put(toyTBPurchased, i + 1);
		}
		this.balance = this.balance - toyTBPurchased.getToyPrice();
	}
	
	public void printInventory(){
		System.out.println(String.format("%s, your inventory contains:", this.getPlayerName()));
		System.out.println("Foods:");
		for(Food f : GameEnvironment.foodAvailable){
			Integer n = playersToys.get(f);
			if(n == null){
				n = 0;
			}
			System.out.println(String.format("%s x%d", f.getFoodName(), n));
		}
		System.out.println("Toys:");
		for(Toy t : GameEnvironment.toysAvailable){
			Integer n = playersFood.get(t);
			if(n == null){
				n = 0;
			}
			System.out.println(String.format("%s x%d", t.getToyName(), n));
		}
	}
	
	public void printBalance(){
		System.out.println(String.format("%s, your balance is %d coins", this.getPlayerName(), this.getBalance()));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
