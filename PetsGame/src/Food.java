
package pets;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * The Food class stored the variables of six types food.
 * And it also show the details of food as nutrition value, food price and tastiness.
 * 
 * 
 * @author lma188
 *
 */

public class food {
	
	/** 
	 * @param foodName is the name of each food. 
	 *        It cannot be assessed outside class.
	 *        It has getter method but no setter method so the name can't be changed.  
	 * 
	 * @param nutritionValue is referred to nutritional level of each food with range [0:100]
	 *        It can reduce the hungry level of pets after ate food. 
	 *        The reduce portion is refer to the value of nutrition(we will talk these details in Species class).  
	 *        nutritionValue cannot be assessed outside class.
	 *        It has getter method but no setter method and the value cannot be changed.
	 *        
	 * @param tastiness is referred to how tasty of each food.   
	 *        The range is [0:100].
	 *        Note: Each food has its based_tastiness which is fixed. 
	 *        
	 * @param foodPrice is the price for player to buy food and is fixed. 
	 *        The range is [0:100].
	 *        Note: larger number means more expansive.   
	 *
	 */
	
	
	private String foodName;
	private int nutritionValue;
	private int tastiness;
	private int foodPrice;
	private ArrayList<Food> foodlist = new ArrayList<Food>();
	

	public food(String name, int nutritionalValue, int taste, int price){
		foodName = name;
		nutritionValue = nutritionalValue;
		tastiness = taste;
		foodPrice = price;
	}
	
	
	public String getname(){
		
		return foodName;
	}	
	
	public int getnutritionalValue(){
		
		return nutritionValue;
		
	}
	public int gettastfulLevel(){
		
		return tastiness;
				
	}
	public int getprice(){
		
		return foodPrice;
		
	}
	
	
	public static ArrayList<food> getArrayList(){
		 
		ArrayList<food> foods = new ArrayList<>();
		
		return foods;
		 
	}

	
	public static void main(String[] args) {
		
		
		
		ArrayList<food> foods = new ArrayList<>();
		foodname foods1;
		
		foods1 = new food("name1", 15 , 50, 10);
		foods.add(foods1);
		foods1 = new food("name2", 20 , 55, 25);
		foods.add(foods1);
		foods1 = new food("name3", 15 , 50, 10);
		foods.add(foods1);
		foods1 = new food("name4", 15 , 50, 10);
		foods.add(foods1);
		foods1 = new food("name5", 15 , 50, 10);
		foods.add(foods1);
		foods1 = new food("name6", 15 , 50, 10);
		foods.add(foods1);
		
		System.out.println("FoodName\t NutritionValue\t Tastiness\t FoodPrice\t");
		for (foodname printfoodname : foods){
			
			System.out.println(
					printfoodname.getname() + "\t" + printfoodname.getnutritionalValue() + "\t" +
					printfoodname.gettastfulLevel() + "\t" + printfoodname.getprice());
		}
		
		
		
	}
	
	
}
