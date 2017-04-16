package pets;
/**
 * The Toy class will be implemented to have 6 instances of toys that the Player can use on a pet
 * 
 * @author ltt19
 * @version 1.0
 *
 */
public class Toy {
	/**
	 * @param TOY_NAME The name of the toy.
	 * @param TOY_PRICE The price of the toy that will be used when purchasing a toy.
	 * @param toyQuality The quality of the toy at a particular point in the game as a rating from 0-100, with 0 being a broken toy, and 100 being a new toy.
	 * @param broken A boolean representing whether or not a toy is broken. False is the toy is not broken, true means the toy is broken.
	 * @param EXERCISE_REQUIRED The exercise used by a pet when playing with this toy, how hungry and tired it will make the pet, a rating of 0-100.
	 */
	private final String TOY_NAME;
	private final int TOY_PRICE;
	private int toyQuality;
	private boolean isBroken;
	private final int EXERCISE_REQUIRED;

	/**
	 * 
	 * @param name The name specified when setting up the instance of a toy
	 * @param price The price of the toy, specified when setting up the instance of the toy
	 * @param exercise The exercise the pet will do when using the toy as a rating of 0-100.
	 */
	
	public Toy(String name, int price, int exercise){
		TOY_NAME = name;
		TOY_PRICE = price;
		EXERCISE_REQUIRED = exercise;
		toyQuality = 100;
		isBroken = false;
	}
	/**
	 * The getter method for the property TOY_NAME.
	 * @return Returns the name of the toy.
	 */
	public String getToyName(){
		return TOY_NAME;
	}
	
	/**
	 * The getter method for the property TOY_PRICE.
	 * @return Return the price of the toy.
	 */
	public int getToyPrice(){
		return TOY_PRICE;
	}
	
	/**
	 * The getter method for the property toyQuality.
	 * @return Returns the quality of the toy, as a rating of 0-100.
	 */
	public int getToyQuality(){
		return toyQuality;
	}
	
	/**
	 * The getter method for the property isBroken.
	 * @return Returns whether the toy is broken. true means the toy is broken, false means the toy is not broken.
	 */
	public boolean getIsBroken(){
		return isBroken;
	}
	
	/**
	 * The getter method for the property EXERCISE_REQUIRED.
	 * @return Returns the amount of exercise the pet will do when using the toy, as a rating of 0-100.
	 */
	public int getExerciseRequired(){
		return EXERCISE_REQUIRED;
	}
	
	/** 
	 * The setToyQuality method updates the quality of the toy, as a rating of 0-100.
	 * @param quality The quality, as a rating of 0-100, that the toy's quality variable will be set to. 
	 */
	public void setToyQuality(int quality){
		toyQuality = quality;
	}
	
	/**
	 * The setIsBroken method updates whether a toy is broken or not.
	 * @param broken Whether or not the toy is broken, false means not broken, true means broken.
	 */
	public void setIsBroken(boolean broken){
		isBroken = broken;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
