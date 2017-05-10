package pets2;

public interface Food {

	/**
	 * @return the className
	 */
	public String getClassName();

	/**
	 * @return the name
	 */
	public String getName();

	/**
	 * @return the nutrition
	 */
	public int getNutrition();

	/**
	 * @return the taste
	 */
	public int getTaste();

	/**
	 * @return the price
	 */
	public int getPrice();
	
	public void printStats();
	
}
