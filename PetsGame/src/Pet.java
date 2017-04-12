package pets;
/**
 * The Pet class contains all the properties of a particular pet, and each pet has properties of a particular species
 * @author ltt19
 * @version 1.0
 */
public class Pet extends Species{
	
	/**
	 * @param petName The name of the pet. Must be unique to the pet.
	 * @param hungerLevel The hunger level of the pet as a rating of 0-100, 0 being not hungry, 100 the most hungry.
	 * @param tiredLevel The tiredness of the pet as a rating of 0-100, 0 being not tired, and 100 being the most tired.
	 * @param playfulLevel The playfullness of the pet as a rating of 0-100, 0 being not playful, 100 being the most playful.
	 * @param toiletLevel The need for the toilet of the pet as a rating of 0-100, 0 being not needing the toilet, and 100 needing the toilet the most.
	 * @param mood The mood of the pet as a rating of 0-100, 0 being a bad mood, 100 being a good mood.
	 * @param isAlive Whether or not the pet is alive. true means the pet is alive, false means the pet is dead.
	 * @param weight The weight of the pet in kg.
	 * @param isMisbehaving Whether or not the pet is misbehaving. true means the pet is misbehaving, false means the pet is not misbehaving.
	 * @param petSpecies The Species of the pet.
	 * @param isSick Whether or not the pet is sick. true means the pet is sick, false means the pet is healthy.
	 */

	private final String petName;
	private int hungerLevel;
	private int tiredLevel;
	private int playfulLevel;
	private int toiletLevel;
	private int mood;
	private boolean isAlive;
	private int weight;
	private boolean isMisbehaving;
	private final Species petSpecies;
	private boolean isSick;
	
	/**
	 * @param name The name specified when creating an instance of a pet.
	 * @param pet_species The species of the pet as specified when creating an instance of a pet.
	 */
	public Pet(String name, Species pet_species){
		petName = name;
		petSpecies = pet_species;
		hungerLevel = 1 * petSpecies.getHungerCo();
		tiredLevel = 1 * petSpecies.getTiredCo();
		playfulLevel = 1 * petSpecies.getPlayCo();
		toiletLevel = 1 * petSpecies.getToiletCo();
		mood = 50;
		isAlive = true;
		weight = petSpecies.getOriginalWeight();
		isMisbehaving = false;
		isSick = false;
	}
	
	/**
	 * @return Returns the name of the pet.
	 */
	public String getPetName(){
		return petName;
	}
	
	/**
	 * @return Returns the species of the pet.
	 */
	public Species getPetSpecies(){
		return petSpecies;
	}
	
	/**
	 * @return Returns the hunger level of the pet.
	 */
	public int getHungerLevel(){
		return hungerLevel;
	}
	
	/**
	 * @return Returns the tiredness of the pet.
	 */
	public int getTiredLevel(){
		return tiredLevel;
	}
	
	/**
	 * @return Returns the playfullness of the pet.
	 */
	public int getPlayfulLevel(){
		return playfulLevel;
	}
	
	/**
	 * @return Returns the need for the toilet of the pet.
	 */
	public int getToiletLevel(){
		return toiletLevel;
	}
	
	/**
	 * @return Returns the mood of the pet.
	 */
	public int getMood(){
		return mood;
	}
	
	/**
	 * @return Returns whether or not the pet is alive.
	 */
	public boolean getIsAlive(){
		return isAlive;
	}
	
	/**
	 * @return Returns the weight of the pet.
	 */
	public int getWeight(){
		return weight;
	}
	
	/**
	 * @return Returns whether or not the pet is misbehaving.
	 */
	public boolean getIsMisbehaving(){
		return isMisbehaving;
	}
	
	/**
	 * @return Returns whether or not the pet is sick.
	 */
	public boolean getIsSick(){
		return isSick;
	}
	
	/**
	 * @param hunger The hunger level that the pet will be set to have.
	 */
	public void setHungerLevel(int hunger){
		hungerLevel = hunger;
	}
	
	/**
	 * @param tired The tiredness that the pet will be set to have.
	 */
	public void setTiredLevel(int tired){
		tiredLevel = tired;
	}
	
	/**
	 * @param playful The playfullness that the pet will be set to have.
	 */
	public void setPlayfulLevel(int playful){
		playfulLevel = playful;
	}
	
	/**
	 * @param toilet The need for the toilet that the pet will be set to have.
	 */
	public void setToiletLevel(int toilet){
		toiletLevel = toilet;
	}
	
	/**
	 * @param petMood The mood that the pet will be set to have. 
	 */
	public void setMood(int petMood){
		mood = petMood;
	}
	
	/**
	 * @param alive Whether or not the pet is alive will be updated to this.
	 */
	public void setIsAlive(boolean alive){
		isAlive = alive;
	}
	
	/**
	 * @param petWeight The weight that the pet will be set to have.
	 */
	public void setWeight(int petWeight){
		weight = petWeight;
	}
	
	/**
	 * @param mis Whether or not the pet is misbehaving will be updated to this.
	 */
	public void setIsMisbehaving(boolean mis){
		isMisbehaving = mis;
	}
	
	/**
	 * @param Whether or not the pet is sick will be updated to this.
	 */
	public void setIsSick(boolean sick){
		isSick = sick;
	}
	
	/**
	 * The feed() method will feed the specified food the pet.
	 * The hunger of the pet is effected by the nutritional value of the food. Good food will completley fill the pet up.
	 * A pet will need to visit the toilet more after a big (high nutrition) meal than after a small meal.
	 * Tastier food will make the pet happier, even more so if it is the pet's favourite food.
	 * The pet should get heavier when it eats.
	 * @param foodToBeEaten The food that the pet will eat.
	 */
	public void feed(Food foodToBeEaten){
		/**
		 * 
		 * 
		 * please fill in
		 * 
		 */
	}
	
	/**
	 * The play() method will make the pet play with the specified toy.
	 * Playing with the toy will make the pets happier, even more so if it is their favourite toy.
	 * The pet will feel less playful after playing. If they like playing then their level of playfullness will not decrease as much as if they don't like playing.
	 * Playing with the toy will damage it, and the toy may break.
	 * Rigourous exercise will make the pet tired and hungry depending on the toy.
	 * @param toyToBePlayed The toy that will be played with.
	 */
	public void play(Toy toyToBePlayed){
		private int playImprovement;
		private int currentMood = this.getMood();
		private int currentPlayLevel = this.getPlayfulLevel();
		private int currentToyQuality = toyToBePlayed.getToyQuality();
		private int damageByPet = this.getPetSpecies().getDamage();
		playImprovement = (this.getPlayfulLevel() * this.getPetSpecies().getPlayCo())/100;
		if(this.getPetSpecies().getFavToy() == toyToBePlayed){
			playImprovement = playImprovement * 1.5;
		}
		if(currentMood + playImprovement >= 100){
			this.setMood(100);
		}else{
			this.setMood(currentMood + playImprovement);
		}
		if(currentPlayLevel - playImprovement <= 0){
			this.setPlayfulLevel(0);
		}else{
			this.setPlayfulLevel(currentPlayLevel - playImprovement);
		}
		toyToBePlayed.setToyQuality(currentToyQuality - damageByPet);
		if(toyToBePlayed.getIsBroken() == true){
			/**
			 * alert the player if the toy is broken
			 */
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
