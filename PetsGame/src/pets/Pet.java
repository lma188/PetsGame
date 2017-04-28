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
	private float weight;
	private boolean isMisbehaving;
	private final Species PET_SPECIES;
	private boolean isSick;
	public int actions;
	private boolean beenRevived;
	public int dailyScore;
	
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
		hungerLevel = 0;
		tiredLevel = 0;;
		playfulLevel = 0;
		toiletLevel = 0;
		mood = 50;
		isAlive = true;
		weight = this.getPetSpecies().getOriginalWeight();
		isMisbehaving = false;
		isSick = false;
		actions = 0;
		beenRevived = false;
		dailyScore = 0;
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
	public float getWeight(){
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
	
	public int getDailyScore(){
		return dailyScore;
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
	public void setWeight(float petWeight){
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
	
	public void setDailyScore(int score){
		dailyScore = score;
	}
	
	public void viewPetStats(){
		System.out.println(String.format("Pet: %s", this.getPetName()));
		System.out.println(String.format("Hunger: %d%%", this.getHungerLevel()));
		System.out.println(String.format("Tiredness: %d%%", this.getTiredLevel()));
		System.out.println(String.format("Playfulness: %d%%", this.getPlayfulLevel()));
		System.out.println(String.format("Toilet Need: %d%%", this.getToiletLevel()));
		System.out.println(String.format("Mood: %d%%", this.getMood()));
		System.out.println(String.format("Weight: %.2fkg", this.getWeight()));
		System.out.println(String.format("Species: %s", this.getPetSpecies().getSpeciesName()));
		System.out.println(String.format("Is Alive? %b", this.getIsAlive()));
		System.out.println(String.format("Is Misbehaving? %b", this.getIsMisbehaving()));
		System.out.println(String.format("Is Sick? %b", this.getIsSick()));
		System.out.println(String.format("Actions used today: %d", this.getActions()));
		System.out.println(String.format("Favourite Toy: %s", this.getPetSpecies().getFavToy().getToyName()));
		System.out.println(String.format("Favourite Food: %s", this.getPetSpecies().getFavFood().getFoodName()));
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
		this.actions = this.actions + 1;
		int feedImprovement; 
		int moodImprovement;
		int currentHungerLevel = this.getHungerLevel();
		int currentMood = this.getMood();
		float currentWeight = this.getWeight();
		float changingWeight;
		int currentToiletLevel = this.getToiletLevel();
		
		feedImprovement = (int) (foodToBeEaten.getNutritionalValue() * 0.7);
		if(currentHungerLevel - feedImprovement <= 0){
			this.setHungerLevel(0);
		}else{
			this.setHungerLevel(currentHungerLevel - feedImprovement);
		}
		
		moodImprovement = (int) (foodToBeEaten.getTastiness() * 0.3);
		if(this.getPetSpecies().getFavFood() == foodToBeEaten){
			moodImprovement = (int) (moodImprovement * 1.5);
			this.setDailyScore(this.getDailyScore() + 50);
		}
		if(currentMood + moodImprovement >= 100){
			this.setMood(100);
		}else{
			this.setMood(currentMood + moodImprovement);
		}
		
		changingWeight = (float) (this.getWeight() * 0.2);
		this.setWeight(currentWeight + changingWeight);
		
		
		
		if (feedImprovement > 50 ){
			this.setToiletLevel((int) (currentToiletLevel + 1.5 * feedImprovement));
		}else{
			this.setToiletLevel((int) (currentToiletLevel + 0.7 * feedImprovement));
		}
	}
		

	
	/**
	 * The play() method will make the pet play with the specified toy.
	 * Playing with the toy will make the pets happier, even more so if it is their favourite toy.
	 * The pet will feel less playful after playing. Playfulness will decrease by the amount their happiness increases.
	 * Playing with the toy will damage it, and the toy may break.
	 * Rigorous exercise will make the pet tired and hungry depending on the toy.
	 * @param toyToBePlayed The toy that will be played with.
	 */
	public boolean play(Toy toyToBePlayed){
		boolean broken = toyToBePlayed.getIsBroken();
		this.actions = this.actions + 1;
		int playImprovement = 30;
		int currentMood = this.getMood();
		int currentPlayLevel = this.getPlayfulLevel();
		int currentToyQuality = toyToBePlayed.getToyQuality();
		int damageByPet = this.getPetSpecies().getDamage();
		if(this.getPetSpecies().getFavToy() == toyToBePlayed){
			playImprovement = (int) (playImprovement * 1.5);
			this.setDailyScore(this.getDailyScore() + 50);
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
		if(toyToBePlayed.getToyQuality() == 0){
			toyToBePlayed.setIsBroken(true);
		}
		if(toyToBePlayed.getIsBroken() == true){
			broken = true;
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
		return broken;
	}
	
	public void sleep(){
		this.actions = this.actions + 1;
		int tiredImprovement = (int) (this.getTiredLevel() * 0.75);
		if(this.getTiredLevel() - tiredImprovement <= 0){
			this.setTiredLevel(0);
		}else{
			this.setTiredLevel(this.getTiredLevel() - tiredImprovement);
		}
	}
	
	public void toilet(){
		this.actions = this.actions + 1;
		float weightImprovement = (float) (this.getWeight() * 0.15);
		int toiletImprovement = (int) (this.getToiletLevel() * 0.75);
		if(this.getToiletLevel() - toiletImprovement <= 0){
			this.setToiletLevel(0);
		}else{
			this.setToiletLevel(this.getToiletLevel()- toiletImprovement);
		}
		if(this.getWeight() - weightImprovement <= 0){
			this.setWeight(0);
		}else{
			this.setWeight(this.getWeight() - weightImprovement);
		}
	}
	
	public void dailyUpdateStats(){
		if(this.getIsAlive() == true){
			Species s = this.getPetSpecies();
			if(this.getHungerLevel() + s.getHungerCo() >= 100){
				this.setHungerLevel(100);
			}else{
				this.setHungerLevel(this.getHungerLevel() + s.getHungerCo());
			}
			if(this.getTiredLevel() + s.getTiredCo() >= 100){
				this.setTiredLevel(100);
			}else{
				this.setTiredLevel(this.getTiredLevel() + s.getTiredCo());
			}
			if(this.getPlayfulLevel() + s.getPlayCo() >= 100){
				this.setPlayfulLevel(100);
			}else{
				this.setPlayfulLevel(this.getPlayfulLevel() + s.getPlayCo());
			}
			if(this.getToiletLevel() + s.getToiletCo() >= 100){
				this.setToiletLevel(100);
			}else{
				this.setToiletLevel(this.getToiletLevel() + s.getToiletCo());
			}
			this.setActions(0);
			this.setDailyScore(0);
		}
	}
	
	public int calculatePetDailyScore(){
		if(this.getIsAlive() == false){
			this.setDailyScore(this.getDailyScore() -100);
		}else{
			if(this.getIsMisbehaving() == true){
				this.setDailyScore(this.getDailyScore() - 100);
			}
			if(this.getIsSick() == true){
				this.setDailyScore(this.getDailyScore() - 100);
			}
			this.setDailyScore(this.getDailyScore() + (100 - this.getHungerLevel()));
			this.setDailyScore(this.getDailyScore() + (100 - this.getTiredLevel()));
			this.setDailyScore((int) (this.getDailyScore() + ((100 - this.getPlayfulLevel() * 0.5))));
			this.setDailyScore(this.getDailyScore() + (100 - this.getToiletLevel()));
			this.setDailyScore(this.getDailyScore() + this.getMood());
		}
		return this.getDailyScore();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
