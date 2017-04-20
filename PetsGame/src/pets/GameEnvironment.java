package pets;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;

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
	 * @param DifficultyToPlay The difficulty of game for player to play.
	 * 
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
	public final int DifficultyToPlay;
	public int Score;//???
	
	
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
	 * Constructor method of GameEnironment.
	 * Set number of player, playing days and difficulty of game.
	 * 
	 * 
	 * @param p_list The list of player.
	 * @param days The playing day of game for players, 1-30.
	 * @param players The number of players to play the game together, 1-4.
	 * @param level The module of difficulty to play, Heaven = easy, ordinary = normal, Hell = hard. 
	 */
	
	
	
	
	public GameEnvironment(int score_days){
		PLAYER_LIST = this.getPlayerList();
		NUM_DAYS = this.getNumDays();
		NUM_PLAYERS = this.getNumPlayers();
		DifficultyToPlay = this.getDifficultyToPlay();
		Score = score_days;
		
		
		
		
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
		Scanner input = new Scanner(System.in);
		input.close();
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
	 * The getter method for the property module to play.
	 * @return Returns the module for players to play.
	 */
	public int getDifficultyToPlay(){
		return DifficultyToPlay;
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
	
	
	/**
	 * The method for the property number of players.
	 * @return Return how many players will play the game together. 
	 */
	public int askNumPlayers(){
		int players;
		
		Scanner input = new Scanner(System.in);
		
		while (true){
			System.out.println("How many players would you like to play with? Maximum players are 4.");
			System.out.println("NB: Maximum players are 4.");
			players = input.nextInt();
			if ( (players > 4 || players < 1)){
				System.out.println("Error: please type a vaild number. NB: Maximum players are 4.");
			}else{
				input.close();
				return players;
			}
		}
		
	}
	
	/**
	 * The method for the property number of days.
	 * @return Return the number of days which players want to play in the game.
	 */
	public int askNumDays(){
		int days;
		
		Scanner input = new Scanner(System.in);
		while (true){
			System.out.println("How many days would you like to play in the game?");
			System.out.println("NB: Please choose a number between 1 to 30.");
			days = input.nextInt();
			if (days > 30 || days < 1){
				System.out.println("Error: please type a vaild number. NB: Please choose a number between 1 to 30." );
			}else{
				input.close();
				return days;
		    }
		}
	}
	/**
	 * The module of difficulty to play, Heaven = easy, ordinary = normal, Hell = hard. 
	 * 
	 * @return Return (level) the difficulty of the game to play.
	 */
	public int askDifficultyToPlay(){
		int level;
		
		Scanner input = new Scanner(System.in);
		
		while (true){
			System.out.println("Which module would you like to play with?");
			System.out.println("1.HEAVEN 2.ORDINARY 3.HELL");
			System.out.println("Plese type the number of module which you are happy to play.");
			level = input.nextInt();
			if ((level > 3 || level < 1)){
				System.out.println("Error: please type a vaild number.");
			}else{
				input.close();
				return level;
			}
		}
		
	}
	
	/**
	 * Setup the specific gameEnrionment for players.
	 * @param answer The answer of whether start the game or not. 
	 * @param answer1 The asking player to reset or quit the game.
	 */
	public void seUpGame(){
		String answer;
		String answer1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Players' number" + this.getNumPlayers()); 
		System.out.println("Playing days" + this.getNumDays());
		System.out.println("Playing module" + this.getDifficultyToPlay());
		
		while (true){
			System.out.println("Shall we start the game? Please type 'Yes'/'No'");
			answer = input.next();
			if (!answer.equals("Yes") || !answer.equals("No")){
				System.out.println("Error: Please type Yes/No"); 		
			}else if (answer.equals("No")){
				System.out.println("Would you like to reset or quit the game?");
				while(true) {
					System.out.println("Please type 'Y' if you would like to reset.");
					System.out.println("Please type 'Q' if you prefer to leave.");
					answer1 = input.next();
					if (!answer1.equals("Y") || !answer1.equals("Q")){
						System.out.println("Error: Please type Y/Q ");
					}else if (answer1.equals("Y")){
						this.getNumPlayers();
						this.getNumDays();
						this.getDifficultyToPlay();
					}else{
						break;
					}
				}
			}else{
				break;
			}
				
		}	
				
		input.close();
	}

	
	public int main(int days){
		return Score;
		
	}
	
	
	public void choosePets(Species petToBechoosen){
		petToBechoosen.getSpeciesName();
		
		
	}
	
	
	
	public void finishGame(int score){
		
		// add for loop to sum the score
				
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}

