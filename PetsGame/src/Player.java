import java.util.ArrayList;
/**
 * This class provides the information of a player in the game.
 * @author ltt19
 * @version 1.0
 */
public class Player {
	
	/**
	 * @param playerName The name of the player. Must be unique.
	 * @param balance The balance of the player available to be spent in the store.
	 * @param numPets The number of pets the player has chosen to have in the game.
	 * @param playersPets A list of the pets the player has in the game.
	 * @param playersToys A list of the toys the player has in their inventory.
	 * @param playersFood A list of the foods the player has in their inventory.
	 */
	private final String playerName;
	private int balance;
	private int numPets;
	public Pet[] playersPets;
	public ArrayList<Toy> playersToys;
	public ArrayList<Food> playersFood;
	
	/**
	 * @param name The name of the player. Must be unique.
	 * @param amountPets The nummber of pets the player has chosen to have in the game.
	 */
	public Player(String name, int amountPets){
		playerName = name;
		balance = 0;
		numPets = amountPets;
		playersPets = new Toy[numPets];
		playersToys = new ArrayList<Toy>();
		playersFood = new ArrayList<Food>();
	}
	
	/**
	 * @return Returns the name of the player.
	 */
	public String getPlayerName(){
		return playerName;
	}
	
	/**
	 * @return Returns the balance the player has available to spend in the store.
	 */
	public int getBalance(){
		return balance;
	}

	/**
	 * @return Returns the number of pets the player has chosen to have in the game.
	 */
	public int getNumPets(){
		return numPets;
	}
	
	/**
	 * @return Returns a list of the pets the player has in the game.
	 */
	public Pet[] getPlayersPets(){
		return playersPets;
	}
	
	/**
	 * This method purchases food from the store by adding the food to their food inventory, and deducting the price of the food from their balance.
	 * @param foodTBPurchased The food that the player is purchasing from the store.
	 */
	public void purchaseFood(Food foodTBPurchased){
		this.playersFood.add(foodTBPurchased);
		this.balance = this.balance - foodTBPurchased.getPrice();
	}
	
	/**
	 * This method purchases a toy from the store by adding the toy to their toy inventory, and deducting the price of the toy from their balance.
	 * @param toyTBPurchased The toy the player is purchasing from the store.
	 */
	public void purchaseToy(Toy toyTBPurchased){
		this.playersToys.add(toyTBPurchased);
		this.balance = this.balance - toyTBPurchased.getToyPrice();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
