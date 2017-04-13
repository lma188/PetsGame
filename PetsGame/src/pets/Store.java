package pets;
import java.util.ArrayList;

/**
 * The Store class stored the two lists, Food and Toy.
 * The Store is only showed the lists of Food and Toy there is no other action.
 *
 * @author lma188
 */

public class Store {
	
	/**
	 * @param arrayList<Food> storeFoods is the list of food class.
	 * @param arrayList<Toy> storeToys is the list of toy class.
	 */
	
	
	public ArrayList<Food> storeFoods;
	public ArrayList<Toy> storeToys;
	
	public Store(GameEnvironment gameInstance){
		storeFoods = gameInstance.foodAvailable;
		storeToys = gameInstance.toysAvailable;
	}
	
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