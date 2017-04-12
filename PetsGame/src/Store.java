
public class Store {
	
	
	private String storeFoods;
	private String storeToy;
	private ArrayList<Food> foods = new ArrayList<>();
	private ArrayList<Toy> toy = new ArrayList<>();
	
	
	
	public Store(String Foods, String Toy){
		storeFoods = Foods;
		storeToy = Toy;
		
	}
	
	
	public ArrayList<Food> myFood(){
		
		ArrayList<Food> food = new ArrayList<Food>();
		food.add();
		return food;
		
	}
	
	
	public ArrayList<Toy> myToy(){
		
		ArrayList<Food> toy = new ArrayList<Food>();
		toy.add();
		return toy;
		
	}
	
    public String buyFoods(){
		
		return storeFoods;
		
	}
	
	public String buyToy(){
		
		return storeToy;
		
	}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
