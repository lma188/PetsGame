/**
 * The Species class is the superclass of Pets. It gathers all the relevant information for pets of a particular species.
 * @author ltt19
 * @version 1.1
 */
public class Species {
	
	/**
	 * @param FAV_TOY The species' favourite toy.
	 * @param FAV_FOOD The species' favourite food.
	 * @param DAMAGE The amount of damage, from 0-100 that a pet of that species does on a toy.
	 * @param SPECIES_NAME The name of the species.
	 * @param HUNGER_CO A coefficient to scale how hungry a pet of that species gets during a day, from 0-100.
	 * @param TIRED_CO A coefficient to scale how tired a pet of that species gets during a day, from 0-100.
	 * @param PLAY_CO A coefficient to scale how playful a pet of that species gets during a day, from 0-100.
	 * @param TOILET_CO A coefficient to scale how much a pet of that species needs to use the toilet during a day, from 0-100.
	 * @param ORIGINAL_WEIGHT The starting weight of a pet of this species.
	 */
	private final Toy FAV_TOY;
	private final Food FAV_FOOD;
	private final int DAMAGE;
	private final String SPECIES_NAME;
	private final int HUNGER_CO;
	private final int TIRED_CO;
	private final int PLAY_CO;
	private final int TOILET_CO;
	private final int ORIGINAL_WEIGHT;
	
	/**
	 * @param speciesName The name of the species chosen.
	 * @param favToy The species' favourite toy.
	 * @param favFood The species' favourite food.
	 * @param damage The amount of damage this species does to a toy.
	 * @param hungerCo How hungry a pet of this species gets during a day, 0-100.
	 * @param tiredCo How tired a pet of this species gets during a day, 0-100.
	 * @param playCo How playful a pet of this species gets during a day, 0-100.
	 * @param toiletCo How much a pet of this species needs to use the toilet during a day, 0-100.
	 * @param weight The starting weight of a pet of this species.
	 */
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
	
	/**
	 * @return Returns the favourite toy of this species.
	 */
	public Toy getFavToy(){
		return FAV_TOY;
	}
	
	/**
	 * @return Returns the favourite food of this species.
	 */
	public Food getFavFood(){
		return FAV_FOOD;
	}
	
	/**
	 * @return Returns the damage done to toys of this species.
	 */
	public int getDamage(){
		return DAMAGE;
	}
	
	/**
	 * @return Returns the name of the species.
	 */
	public String getSpeciesName(){
		return SPECIES_NAME;
	}
	
	/**
	 * @return Returns the hunger coefficient of the species.
	 */
	public int getHungerCo(){
		return HUNGER_CO;
	}
	
	/**
	 * @return Returns the tired coefficient of the species.
	 */
	public int getTiredCo(){
		return TIRED_CO;
	}
	
	/**
	 * @return Returns the playful coefficient of the species.
	 */
	public int getPlayCo(){
		return PLAY_CO;
	}
	
	/**
	 * @return Returns the toilet coefficient of the species.
	 */
	public int getToiletCo(){
		return TOILET_CO;
	}
	
	/**
	 * @return Returns the original weight of a pet of this species.
	 */
	public int getOriginalWeight(){
		return ORIGINAL_WEIGHT;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
