
public class Species {
	
	private final Toy FAV_TOY;
	private final Food FAV_FOOD;
	private final int DAMAGE;
	private final String SPECIES_NAME;
	private final int HUNGER_CO;
	private final int TIRED_CO;
	private final int PLAY_CO;
	private final int TOILET_CO;
	private final int ORIGINAL_WEIGHT;
	
	public Species(String speciesName, Toy favToy, Food favFood, int damage, int hungerCo, int tiredCo, int playCo, int toiletCo, int weight){
		FAV_TOY = favToy;
		FAV_FOOD = favFood;
		DAMAGE = damage;
		SPECIES_NAME = speciesName;
		HUNGER_CO = hungerCo;
		TIRED_CO = tiredCo;
		PLAY_CO = playCo;
		TOILET_CO = tiredCo;
		ORIGINAL_WEIGHT = weight;
	}
	
	public Toy getFavToy(){
		return FAV_TOY;
	}
	
	public Food getFavFood(){
		return FAV_FOOD;
	}
	
	public int getDamage(){
		return DAMAGE;
	}
	
	public String getSpeciesName(){
		return SPECIES_NAME;
	}
	
	public int getHungerCo(){
		return HUNGER_CO;
	}
	
	public int getTiredCo(){
		return TIRED_CO;
	}
	
	public int getPlayCo(){
		return PLAY_CO;
	}
	
	public int getToiletCo(){
		return TOILET_CO;
	}
	
	public int getOriginalWeight(){
		return ORIGINAL_WEIGHT;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
