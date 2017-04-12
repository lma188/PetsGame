
/**
 * The Store class stored the two lists, Food and Toy.
 * The Store is only showed the lists of Food and Toy there is no other action.
 *
 * @author lma188
 */

public class Store {
	
	/**
	 * @param arrayList<Food> storefood is the list of food class.
	 * @param arrayList<Toy> storetoy is the list of toy class.
	 */
	
	
	private ArrayList<Food> storeFoods = new ArrayList<Food>();
	private ArrayList<Toy> storeToys = new ArrayList<Toy>();
	storeFoods.add(new Food("Pizza", 40, 90, 70));
	storeFoods.add(new Food("Chocolate (Dog Friendly)", 30, 95, 30));
	storeFoods.add(new Food("Burger", 40, 75, 50));
	storeFoods.add(new Food("Spaghetti", 50, 50, 20));
	storeFoods.add(new Food("Burritos", 70, 70, 70));
	storeFoods.add(new Food("Kale", 100, 20, 50));
	
	storeToys.add(new Toy("Ball", 40));
	storeToys.add(new Toy("Twine", 20));
	storeToys.add(new Toy("Teddy Bear", 60));
	storeToys.add(new Toy("Chew Toy", 75));
	storeToys.add(new Toy("Bell", 40));
	storeToys.add(new Toy("Play House", 100));
	
	/**
	 * return to the list of Food 
	 */
	public ArrayList<Food> getStoreFoods(){
		return storeFoods;
	}
	
	/**
	 * return to the list of Toy
	 */
	public ArrayList<Toy> getStoreToys(){
		return storeToys;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
