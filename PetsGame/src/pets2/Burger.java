package pets2;

public class Burger implements Food{

	private String name = "Burger";
	private int nutrition = 40;
	private int taste = 75;
	private int price = 50;
	private String className = "Burger";
	
	public Burger(){
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
	public String getName() {
		return name;
	}

	/**
	 * @return the nutrition
	 */
	public int getNutrition() {
		return nutrition;
	}

	/**
	 * @return the taste
	 */
	public int getTaste() {
		return taste;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	
	public void printStats(){
		System.out.println(String.format(" %s. Nutrition: %d/100. Tastiness: %d/100. Price: %d coins.", this.getName(), this.getNutrition(), this.getTaste(), this.getPrice()));
	}
}
