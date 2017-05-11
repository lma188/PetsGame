package pets2;

public abstract class Food {

	protected String name;
	protected int nutrition;
	protected int taste;
	protected int price;
	protected String className;
	

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
