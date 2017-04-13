package pets;
import java.util.ArrayList;


/**
 * The GameEnvironment class is the main class that runs the game.
 * @author ltt19
 * @version 1.0
 *
 */
public class GameEnvironment {
	
	/**
	 * @param playerList The list of player instances, the size of which is the number of players
	 * @param speciesAvailable The list of species available for the player to choose from
	 * @param numDays The number of "days" the game will run for, as specified by the player(s)
	 * @param numPlayers The number of players in this instance of the game
	 */

	public Player[] playerList;
	public Species[] speciesAvailable;
	public int numDays;
	public int numPlayers;
	public ArrayList<Food> foodAvailable = new ArrayList<Food>();
	public ArrayList<Toy> toysAvailable = new ArrayList<Toy>();
	
	public static Food pizza = new Food("Pizza", 40, 90, 70);
	public static Food chocolate = new Food("Chocolate (Dog Friendly)", 30, 95, 30);
	public static Food burger = new Food("Burger", 40, 75, 50);
	public static Food spaghetti = new Food("Spaghetti", 50, 50, 20);
	public static Food burritos = new Food("Burritos", 70, 70, 70);
	public static Food kale = new Food("Kale", 100, 20, 50);
	
	
	public static Toy ball = new Toy("Ball", 40);
	public static Toy twine = new Toy("Twine", 20);
	public static Toy teddyBear = new Toy("Teddy Bear", 60);
	public static Toy chewToy = new Toy("Chew Toy", 75);
	public static Toy bell = new Toy("Bell", 40);
	public static Toy playHouse = new Toy("Play House", 100);
	
	
	public GameEnvironment(){
		foodAvailable.add(pizza);
		foodAvailable.add(chocolate);
		foodAvailable.add(burger);
		foodAvailable.add(spaghetti);
		foodAvailable.add(burritos);
		foodAvailable.add(kale);
		
		toysAvailable.add(ball);
		toysAvailable.add(twine);
		toysAvailable.add(teddyBear);
		toysAvailable.add(chewToy);
		toysAvailable.add(bell);
		toysAvailable.add(playHouse);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}

