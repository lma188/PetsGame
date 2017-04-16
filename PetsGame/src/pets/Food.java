
package pets;
/**
 * The Food class will be implemented to have 6 instances of toys that the Player can feed to a pet.
 * The Food class stores the properties of the food, such as nutritional value, tastiness, and price.
 * 
 * 
 * @author lma188
 *
 */

public class Food {
	
	/** 
	 * @param FOOD_NAME The name of each food.  
	 * 
	 * @param NUTRITIONAL_VALUE The nutritional value of each food as a rating of 0-100.
	 *        
	 * @param TASTINESS The tastiness of the food as a rating from 0-100.
	 *        
	 * @param FOOD_PRICE The price for player to buy this food from the store. Price is between 1-100.   
	 *
	 */
	private final String FOOD_NAME;
	private final int NUTRITIONAL_VALUE;
	private final int TASTINESS;
	private final int FOOD_PRICE;
	
	/**
	 * The constructor method to initialise the values of the food's properties.
	 * @param name The name of the food.
	 * @param nutritionValue The nutritional value of the food from 0-100.
	 * @param taste The tastiness of the food as a rating of 0-100
	 * @param price The price of the food in the store, between 1-100.
	 */
	public Food(String name, int nutritionValue, int taste, int price){
		FOOD_NAME = name;
		NUTRITIONAL_VALUE = nutritionValue;
		TASTINESS = taste;
		FOOD_PRICE = price;
	}
	
	/**
	 * The getter method for the property FOOD_NAME.
	 * @return Returns the name of the food.
	 */
	public String getFoodName(){
		
		return FOOD_NAME;
	}	
	
	/**
	 * The getter method for the property NUTRITIONAL_VALUE.
	 * @return Returns the nutritional value of the food as a rating of 0-100.
	 */
	public int getNutritionalValue(){
		
		return NUTRITIONAL_VALUE;
		
	}
	
	/**
	 * The getter method for the property TASTINESS.
	 * @return Returns the tastiness of the food as a rating of 0-100.
	 */
	public int getTastiness(){
		
		return TASTINESS;
				
	}
	
	/**
	 * The getter method for the property FOOD_PRICE.
	 * @return Returns the price of the food. The price is between 1-100.
	 */
	public int getFoodPrice(){
		
		return FOOD_PRICE;
		
	}
	
	
	public static void main(String[] args) {
		
	}
	
	
}
