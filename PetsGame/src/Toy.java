/**
 * The Toy class will be implemented to have 6 instances of toys that the Player can use on a pet
 * 
 * @author ltt19
 * @version 1.0
 *
 */
public class Toy {
	/**
	 * @param toyName The name of the toy. toyName not able to be accessed outside of the class, has a getter method but has no setter method.
	 * @param price The price of the toy that will be used when purchasing a toy. price unable to be accessed outside of the class, so has a getter method but no setter method so price can't be changed.
	 * @param toyQuality The quality of the toy at a particular point in the game as a rating from 0-100, with 0 being a broken toy, and 100 being a new toy
	 * @param broken A boolean representing whether or not a toy is broken. False is the toy is not broken, true means the toy is broken
	 */
	private final String toyName;
	private final int price;
	private int toyQuality;
	private boolean isBroken;

	/**
	 * 
	 * @param name The name specified when setting up the instance of a toy
	 * @param toyPrice The price of the toy, specified when setting up the instance of the toy
	 */
	
	public Toy(String name, int toyPrice){
		toyName = name;
		price = toyPrice;
		toyQuality = 100;
		isBroken = false;
	}
	/**
	 * 
	 * @return Returns the name of the toy.
	 */
	public String getToyName(){
		return toyName;
	}
	
	/**
	 * 
	 * @return Return the price of the toy.
	 */
	public int getPrice(){
		return price;
	}
	
	/**
	 * 
	 * @return Returns the quality of the toy, as a rating of 0-100.
	 */
	public int getToyQuality(){
		return toyQuality;
	}
	
	/**
	 * 
	 * @return Returns whether the toy is broken. true means the toy is broken, false means the toy is not broken.
	 */
	public boolean getIsBroken(){
		return isBroken;
	}
	
	/** 
	 * The setToyQuality method both updates the quality of the toy, as a rating of 0-100, and will set the toy to broken if quality is 0.
	 * @param quality The quality, as a rating of 0-100, that the toy's quality variable will be set to. 
	 */
	public void setToyQuality(int quality){
		toyQuality = quality;
		if(toyQuality == 0){
			isBroken = true;
		}
	}
	
	/**
	 * The setIsBroken method both updates whether a toy is broken or not, and will set quality to 0 if the toy is broken.
	 * @param broken Whether or not the toy is broken, false means not broken, true means broken.
	 */
	public void setIsBroken(boolean broken){
		isBroken = broken;
		if(isBroken == true){
			toyQuality = 0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
