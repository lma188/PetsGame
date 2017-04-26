package pets;
/**
 * The Species class gathers all the relevant information for pets of a particular species.
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
	private final float ORIGINAL_WEIGHT;
	
	/**
	 * @param speciesName The name of the species chosen.
	 * @param favToy The species' favourite toy.
	 * @param favFood The species' favourite food.
	 * @param damage The amount of damage this species does to a toy, 0-100.
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
	 * The getter method for the property FAV_TOY.
	 * @return Returns the favourite toy of this species.
	 */
	public Toy getFavToy(){
		return FAV_TOY;
	}
	
	/**
	 * The getter method for the property FAV_FOOD.
	 * @return Returns the favourite food of this species.
	 */
	public Food getFavFood(){
		return FAV_FOOD;
	}
	
	/**
	 * The getter method for the property DAMAGE.
	 * @return Returns the damage done to toys of this species.
	 */
	public int getDamage(){
		return DAMAGE;
	}
	
	/**
	 * The getter method for the property SPECIES_NAME.
	 * @return Returns the name of the species.
	 */
	public String getSpeciesName(){
		return SPECIES_NAME;
	}
	
	/**
	 * The getter method for the property HUNGER_CO.
	 * @return Returns the hunger coefficient of the species.
	 */
	public int getHungerCo(){
		return HUNGER_CO;
	}
	
	/**
	 * The getter method for the property TIRED_CO.
	 * @return Returns the tired coefficient of the species.
	 */
	public int getTiredCo(){
		return TIRED_CO;
	}
	
	/**
	 * The getter method for the property PLAY_CO.
	 * @return Returns the playful coefficient of the species.
	 */
	public int getPlayCo(){
		return PLAY_CO;
	}
	
	/**
	 * The getter method for the property TOILET_CO.
	 * @return Returns the toilet coefficient of the species.
	 */
	public int getToiletCo(){
		return TOILET_CO;
	}
	
	/**
	 * The getter method for the property ORIGINAL_WEIGHT.
	 * @return Returns the original weight of a pet of this species.
	 */
	public float getOriginalWeight(){
		return ORIGINAL_WEIGHT;
	}
	
	public void printSpeciesStats(){
		System.out.println(String.format("Species: %s", this.getSpeciesName()));
		System.out.println(String.format("Favourite Toy: %s", this.getFavToy().getToyName()));
		System.out.println(String.format("Favourite Food: %s", this.getFavFood().getFoodName()));
		System.out.println(String.format("Damage done to toy per use: %d points of toy's quality (starts at 100)", this.getDamage()));
		System.out.println(String.format("Hunger increase per day: %d points of hunger, where hunger is a rating of 0-100", this.getHungerCo()));
		System.out.println(String.format("Tiredness increase per day: %d points of tiredness, where tiredness is a rating of 0-100", this.getTiredCo()));
		System.out.println(String.format("Playfulness increase per day: %d points of playfulness, where playfulness is a rating of 0-100", this.getPlayCo()));
		System.out.println(String.format("Toilet need increase per day: %d points of toilet need, where toilet need is a rating of 0-100", this.getToiletCo()));
		System.out.println(String.format("Starting weight: %.2f kg", this.getOriginalWeight()));
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
