package pets;
import java.util.ArrayList;

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
	 */

	public final Player[] PLAYER_LIST;
	public final int NUM_DAYS;
	public final int NUM_PLAYERS;
	public ArrayList<String> namesList;
	
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
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}

