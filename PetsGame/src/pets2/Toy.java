package pets2;

public interface Toy {

	/**
	 * @return the className
	 */
	public String getClassName();

	/**
	 * @return the quality
	 */
	public int getQuality();

	/**
	 * @param quality the quality to set
	 */
	public void setQuality(int quality);

	/**
	 * @return the isBroken
	 */
	public boolean getIsBroken();

	/**
	 * @param isBroken the isBroken to set
	 */
	public void setIsBroken(boolean isBroken);
	
	/**
	 * @return the name
	 */
	public String getName();

	/**
	 * @return the price
	 */
	public int getPrice();

	/**
	 * @return the exercise
	 */
	public int getExercise();
	
	public void printStats();
	
}
