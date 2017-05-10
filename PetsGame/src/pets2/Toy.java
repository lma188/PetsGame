package pets2;

public class Toy {
	
	private static String name;
	private static int price;
	private int quality;
	private boolean isBroken;
	private static int exercise;
	private String className;
	
	public Toy(String toy_name, int toy_price, int exercise_required, String classname){
		name = toy_name;
		price = toy_price;
		quality = 100;
		isBroken = false;
		exercise = exercise_required;
		className = classname;
	}

	/**
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * @return the quality
	 */
	public int getQuality() {
		return quality;
	}

	/**
	 * @param quality the quality to set
	 */
	public void setQuality(int quality) {
		this.quality = quality;
	}

	/**
	 * @return the isBroken
	 */
	public boolean getIsBroken() {
		return isBroken;
	}

	/**
	 * @param isBroken the isBroken to set
	 */
	public void setIsBroken(boolean isBroken) {
		this.isBroken = isBroken;
	}

	/**
	 * @return the name
	 */
	public static String getName() {
		return name;
	}

	/**
	 * @return the price
	 */
	public static int getPrice() {
		return price;
	}

	/**
	 * @return the exercise
	 */
	public static int getExercise() {
		return exercise;
	}
	
	public static void printStats(){
		System.out.println(String.format(" %s. Exercise done by pet when used: %d/100. Price: %d coins.", Toy.getName(), Toy.getExercise(), Toy.getPrice()));
	}
	
}
