package pets2;

public class Pizza implements Food{

	private String name = "Pizza";
	private int nutrition = 40;
	private int taste = 90;
	private int price = 70;
	private String className = "Pizza";
	
	public Pizza(){
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
