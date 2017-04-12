
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
	
	
	private ArrayList<Food> storefood = new ArrayList<>();
	private ArrayList<Toy> storetoy = new ArrayList<>();
	
	
	
	public Store(String Foods, String Toy){
		storeFoods = Foods;
		storeToy = Toy;
		
	}
	
	/**
	 * return to the list of Food 
	 */
	public ArrayList<Food> storeFood(){
		
		ArrayList<Food> food = new ArrayList<Food>();
		food.add();
		return food;
		
	}
	
	/**
	 * return to the list of Toy
	 */
	public ArrayList<Toy> storeToy(){
		
		ArrayList<Food> toy = new ArrayList<Food>();
		toy.add();
		return toy;
		
	}
	
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
