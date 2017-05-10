package pets2;

public class Food {
	private static String name;
	private static int nutrition;
	private static int taste;
	private static int price;
	private String className;
	
	public Food(String food_name, int nutritional_value, int tastiness, int food_price, String classname){
		name = food_name;
		nutrition = nutritional_value;
		taste = tastiness;
		price = food_price;
		className = classname;
	}

	/**
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * @return the name
	 */
	public static String getName() {
		return name;
	}

	/**
	 * @return the nutrition
	 */
	public static int getNutrition() {
		return nutrition;
	}

	/**
	 * @return the taste
	 */
	public static int getTaste() {
		return taste;
	}

	/**
	 * @return the price
	 */
	public static int getPrice() {
		return price;
	}
	
	public static void printStats(){
		System.out.println(String.format(" %s. Nutrition: %d/100. Tastiness: %d/100. Price: %d coins.", Food.getName(), Food.getNutrition(), Food.getTaste(), Food.getPrice()));
	}
	
}
