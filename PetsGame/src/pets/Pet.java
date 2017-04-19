package pets;
/**
 * The Pet class contains all the properties of a particular pet, and each pet has properties of a particular species.
 * @author ltt19
 */
public class Pet{
	
	/**
	 * @param PET_NAME The name of the pet. Must be unique to the pet.
	 * @param hungerLevel The hunger level of the pet as a rating of 0-100, 0 being not hungry, 100 the most hungry. 
	 * @param tiredLevel The tiredness of the pet as a rating of 0-100, 0 being not tired, and 100 being the most tired.
	 * @param playfulLevel The playfulness of the pet as a rating of 0-100, 0 being not playful, 100 being the most playful.
	 * @param toiletLevel The need for the toilet of the pet as a rating of 0-100, 0 being not needing the toilet, and 100 needing the toilet the most.
	 * @param mood The mood of the pet as a rating of 0-100, 0 being a bad mood, 100 being a good mood.
	 * @param isAlive Whether or not the pet is alive. true means the pet is alive, false means the pet is dead.
	 * @param weight The weight of the pet in kg. 
	 * @param isMisbehaving Whether or not the pet is misbehaving. true means the pet is misbehaving, false means the pet is not misbehaving.
	 * @param PET_SPECIES The Species of the pet.
	 * @param isSick Whether or not the pet is sick. true means the pet is sick, false means the pet is healthy.
	 * @param actions How many actions this pet has performed during a day.
	 * @param beenRevived Whether or not the pet has been revived from death before.
	 */

	private final String PET_NAME;
	private int hungerLevel;
	private int tiredLevel;
	private int playfulLevel;
	private int toiletLevel; 
	private int mood;
	private boolean isAlive;
	private int weight;
	private boolean isMisbehaving;
	private final Species PET_SPECIES;
	private boolean isSick;
	public int actions;
	private boolean beenRevived;
	
	/**
	 * The constructor method of Pet.
	 * Sets initial levels of hunger, tiredness, playfulness, and need for toilet to their respective coefficients specified for the Species of that pet.
	 * Mood is set to 50, weight is set to the baseline weight of the Species of the pet.
	 * @param name The name specified when creating an instance of a pet. Must be unique to the pet.
	 * @param pet_species The species of the pet as specified when creating an instance of a pet.
	 */
	public Pet(String name, Species pet_species){
		PET_NAME = name;
		PET_SPECIES = pet_species;
		hungerLevel = this.getPetSpecies().getHungerCo();
		tiredLevel = this.getPetSpecies().getTiredCo();
		playfulLevel = this.getPetSpecies().getPlayCo();
		toiletLevel = this.getPetSpecies().getToiletCo();
		mood = 50;
		isAlive = true;
		weight = this.getPetSpecies().getOriginalWeight();
		isMisbehaving = false;
		isSick = false;
		actions = 0;
		beenRevived = false;
	}
	
	/**
	 * The getter method for the property PET_NAME.
	 * @return Returns the name of the pet.
	 */
	public String getPetName(){
		return PET_NAME;
	}
	
	/**
	 * The getter method for the property PET_SPECIES.
	 * @return Returns the species of the pet.
	 */
	public Species getPetSpecies(){
		return PET_SPECIES;
	}
	
	/**
	 * The getter method for the property hungerLevel.
	 * @return Returns the hunger level of the pet, a rating from 0-100.
	 */
	public int getHungerLevel(){
		return hungerLevel;
	}
	
	/**
	 * The getter method for the property tiredLevel.
	 * @return Returns the tiredness of the pet, a rating from 0-100.
	 */
	public int getTiredLevel(){
		return tiredLevel;
	}
	
	/**
	 * The getter method for the property playfulLevel.
	 * @return Returns the playfulness of the pet, a rating from 0-100.
	 */
	public int getPlayfulLevel(){
		return playfulLevel;
	}
	
	/**
	 * The getter method for the property toiletLevel.
	 * @return Returns the need for the toilet of the pet, a rating from 0-100.
	 */
	public int getToiletLevel(){
		return toiletLevel;
	}
	
	/**
	 * The getter method for the property mood.
	 * @return Returns the mood of the pet, a rating from 0-100.
	 */
	public int getMood(){
		return mood;
	}
	

	/**
	 * The getter method for the property isAlive.
	 * @return Returns whether or not the pet is alive, true means pet is alive, false means pet is dead.
	 */
	
	
	public boolean getIsAlive(){
		return isAlive;
	}
	
	/**
	 * The getter method for the property weight.
	 * @return Returns the weight of the pet in kg.
	 */
	public int getWeight(){
		return weight;
	}
	
	/**
	 * The getter method for the property isMisbehaving.
	 * @return Returns whether or not the pet is misbehaving, true means they are misbehaving, false means they are not misbehaving.
	 */
	public boolean getIsMisbehaving(){
		return isMisbehaving;
	}
	
	/**
	 * The getter method for the property isSick.
	 * @return Returns whether or not the pet is sick, true means the pet is sick, false means the pet is not sick.
	 */
	public boolean getIsSick(){
		return isSick;
	}
	
	/**
	 * The getter method for the property actions.
	 * @return Returns how many actions the pet has performed today.
	 */
	public int getActions(){
		return actions;
	}
	
	/**
	 * The getter method for the property beenRevived.
	 * @return Returns whether or not the pet has been revived from death before or not.
	 */
	public boolean getBeenRevived(){
		return beenRevived;
	}
	
	/**
	 * The setter method for the property hungerLevel.
	 * @param hunger The hunger level that the pet will be set to have, a rating from 0-100.
	 */
	public void setHungerLevel(int hunger){
		hungerLevel = hunger;
	}
	
	/**
	 * The setter method for the property tiredLevel.
	 * @param tired The tiredness that the pet will be set to have, a rating from 0-100.
	 */
	public void setTiredLevel(int tired){
		tiredLevel = tired;
	}
	
	/**
	 * The setter method for the property playfulLevel.
	 * @param playful The playfulness that the pet will be set to have, a rating from 0-100.
	 */
	public void setPlayfulLevel(int playful){
		playfulLevel = playful;
	}
	
	/**
	 * The setter method for the property toiletLevel.
	 * @param toilet The need for the toilet that the pet will be set to have, a rating from 0-100.
	 */
	public void setToiletLevel(int toilet){
		toiletLevel = toilet;
	}
	
	/**
	 * The setter method for the property mood.
	 * @param petMood The mood that the pet will be set to have, a rating from 0-100. 
	 */
	public void setMood(int petMood){
		mood = petMood;
	}
	
	
	/**
	 * The setter method for the property isAlive.
	 * @param alive Whether or not the pet is alive will be updated to this, true means pet is alive, false means pet is dead.
	 */
	
	public void setIsAlive(boolean alive){
		isAlive = alive;
	}
	
	/**
	 * The setter method for the property weight.
	 * @param petWeight The weight that the pet will be set to have in kg.
	 */
	public void setWeight(int petWeight){
		weight = petWeight;
	}
	
	/**
	 * The setter method for the property isMisbehaving.
	 * @param mis Whether or not the pet is misbehaving will be updated to this, true means they are misbehaving, false means they are not misbehaving.
	 */
	public void setIsMisbehaving(boolean mis){
		isMisbehaving = mis;
	}
	
	/**
	 * The setter method for the property isSick.
	 * @param Whether or not the pet is sick will be updated to this, true means the pet is sick, false means the pet is not sick.
	 */
	public void setIsSick(boolean sick){
		isSick = sick;
	}
	
	
	/**
	 * The setter method for the property actions.
	 * @param numActions The number of actions the pet will be set to have done today.
	 */
	public void setActions(int numActions){
		actions = numActions;
	}
	
	/**
	 * The setter method for the property beenRevived. Will only accept being changed to true.
	 * @param revived Whether or not the pet has been revived from death or not.
	 */
	public void setBeenRevived(boolean revived){
		if(revived == true){
			beenRevived = revived;
		}
	}
	
	
	/**
	 * The feed() method will feed the specified food the pet.
	 * The hunger of the pet is effected by the nutritional value of the food. Good food will completley fill the pet up.
	 * A pet will need to visit the toilet more after a big (high nutrition) meal than after a small meal.
	 * Tastier food will make the pet happier, even more so if it is the pet's favourite food.
	 * Weight of pets can be changed by feeding action. Pets gain 20% weight by had one meal and lose 20% weight by went to toliet.
	 * 
	 * @param foodToBeEaten The food that the pet will eat.
	 */
	public void feed(Food foodToBeEaten){
		int feedImprovement; 
		int moodImprovement;
		int currentHungerLevel = this.getHungerLevel();
		int currentMood = this.getMood();
		int currentWeight = this.getWeight();
		int changingWeight; for same rate.
		int currentToiletLevel = this.getToiletLevel();
		
		
		
		feedImprovement = this.getFood().getNutritionalValue() * 0.7; 
		foodToBeEaten.setHungerLevel(currentHungerLevel - feedImprovement);
		
		
		if(currentMood == 100){
			moodImprovement = 0;
		}else{
			moodImprovement = (this.getFood().getTastiness() * 0.3)/100;
		}
		if(this.getPetSpecies().getFavFood() == foodToBeEaten){
			moodImprovement = (int) (moodImprovement * 1.5);	
		}else{
			moodImprovement = moodImprovement;
		}
		if(currentMood + moodImprovement >= 100){
			this.setMood(100);
		}else{
			this.setMood(currentMood + moodImprovement);
		}
		
		changingWeight = this.getPetSecies.getWeight() * 0.2;
		foodToBeEathen.setWeight(currentWeight + changingWeight);
		
		
		
		if (feedImprovement > 50 ){
			this.setToiletLevel(currentToiletLevel + 1.5 * feedImprovement);
		}else{
			this.getToiletLevel(currentToiletLevel + 0.7 * feedImprovement);
		}
		
		

	
	/**
	 * The play() method will make the pet play with the specified toy.
	 * Playing with the toy will make the pets happier, even more so if it is their favourite toy.
	 * The pet will feel less playful after playing. Playfulness will decrease by the amount their happiness increases.
	 * Playing with the toy will damage it, and the toy may break.
	 * Rigorous exercise will make the pet tired and hungry depending on the toy.
	 * @param toyToBePlayed The toy that will be played with.
	 */
	public void play(Toy toyToBePlayed){
		int playImprovement = 30;
		int currentMood = this.getMood();
		int currentPlayLevel = this.getPlayfulLevel();
		int currentToyQuality = toyToBePlayed.getToyQuality();
		int damageByPet = this.getPetSpecies().getDamage();
		if(this.getPetSpecies().getFavToy() == toyToBePlayed){
			playImprovement = (int) (playImprovement * 1.5);
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
		if(this.getHungerLevel() + toyToBePlayed.getExerciseRequired() >= 100){
			this.setHungerLevel(100);
		}else{
			this.setHungerLevel(this.getHungerLevel() + toyToBePlayed.getExerciseRequired());
		}
		if(this.getTiredLevel() + toyToBePlayed.getExerciseRequired() >= 100){
			this.setTiredLevel(100);
		}else{
			this.setTiredLevel(this.getTiredLevel() + toyToBePlayed.getExerciseRequired());
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
