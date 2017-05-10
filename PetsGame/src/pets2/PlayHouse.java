package pets2;

public class PlayHouse implements Toy{
	
	private String name = "Play House";
	private int price = 100;
	private int quality;
	private boolean isBroken;
	private int exercise = 50;
	private String className = "PlayHouse";
	
	public PlayHouse(){
		quality = 100;
		isBroken = false;
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
	public String getName() {
		return name;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @return the exercise
	 */
	public int getExercise() {
		return exercise;
	}
	
	public void printStats(){
		System.out.println(String.format(" %s. Exercise done by pet when used: %d/100. Price: %d coins.", this.getName(), this.getExercise(), this.getPrice()));
	}
	
}
