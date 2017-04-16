package pets;

/**
 * The Store class stores the lists of foods and toys available for use in the store.
 *
 * @author lma188
 */

public class Store {
	
	/**
	 * @param storeFoods The list of foods available for use in the store.
	 * @param storeToys The list of toys available for use in the store.
	 */
	
	public Food[] storeFoods = GameEnvironment.getFoodAvailable();
	public Toy[] storeToys = GameEnvironment.getToysAvailable();
	
	/**
	 * The getter method for the property storeFoods.
	 * @return Returns the list of foods available for use in the store.
	 */
	public Food[] getStoreFoods(){
		return storeFoods;
	}
	
	/**
	 * The getter method for the property storeToys.
	 * @return Returns the list of toys available for use in the store.
	 */
	public Toy[] getStoreToys(){
		return storeToys;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}