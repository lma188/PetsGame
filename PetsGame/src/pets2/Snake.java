package pets2;

public class Snake implements Animal{

	
	private static String favToy = "Teddy Bear";
	private static String favFood = "Burger";
	private static int damage = 20;
	private static String speciesName = "Snake";
	private static int hungerCo = 30;
	private static int tiredCo = 20;
	private static int playCo = 20;
	private static int toiletCo = 5;
	private static float originalWeight = (float) 2;
	private String name;
	private int hungerLevel;
	private int tiredLevel;
	private int playfulLevel;
	private int toiletLevel;
	private int mood;
	private boolean isAlive;
	private float weight;
	private boolean isMisbehaving;
	private boolean isSick;
	public int actions;
	private boolean beenRevived;
	public int dailyScore;
	private String className = "Snake";
	
//	
//	public Snake(String snakeName){
//		super("TeddyBear", "Burger", 20, "Snake", 30, 20, 20, 5, (float) 2, snakeName, "Snake");
//	}
	
	public Snake(String animal_name){
		name = animal_name;
		hungerLevel = 0;
		tiredLevel = 0;
		playfulLevel = 0;
		toiletLevel = 0;
		mood = 50;
		isAlive = true;
		weight = originalWeight;;
		isMisbehaving = false;
		isSick = false;
		actions = 0;
		beenRevived = false;
		dailyScore = 0;
	}


	/**
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}


	/**
	 * @return the hungerLevel
	 */
	public int getHungerLevel() {
		return hungerLevel;
	}

	/**
	 * @param hungerLevel the hungerLevel to set
	 */
	public void setHungerLevel(int hungerLevel) {
		this.hungerLevel = hungerLevel;
	}

	/**
	 * @return the tiredLevel
	 */
	public int getTiredLevel() {
		return tiredLevel;
	}

	/**
	 * @param tiredLevel the tiredLevel to set
	 */
	public void setTiredLevel(int tiredLevel) {
		this.tiredLevel = tiredLevel;
	}

	/**
	 * @return the playfulLevel
	 */
	public int getPlayfulLevel() {
		return playfulLevel;
	}

	/**
	 * @param playfulLevel the playfulLevel to set
	 */
	public void setPlayfulLevel(int playfulLevel) {
		this.playfulLevel = playfulLevel;
	}

	/**
	 * @return the toiletLevel
	 */
	public int getToiletLevel() {
		return toiletLevel;
	}

	/**
	 * @param toiletLevel the toiletLevel to set
	 */
	public void setToiletLevel(int toiletLevel) {
		this.toiletLevel = toiletLevel;
	}

	/**
	 * @return the mood
	 */
	public int getMood() {
		return mood;
	}

	/**
	 * @param mood the mood to set
	 */
	public void setMood(int mood) {
		this.mood = mood;
	}

	/**
	 * @return the isAlive
	 */
	public boolean getIsAlive() {
		return isAlive;
	}

	/**
	 * @param isAlive the isAlive to set
	 */
	public void setIsAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	/**
	 * @return the weight
	 */
	public float getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(float weight) {
		this.weight = weight;
	}

	/**
	 * @return the isMisbehaving
	 */
	public boolean getIsMisbehaving() {
		return isMisbehaving;
	}

	/**
	 * @param isMisbehaving the isMisbehaving to set
	 */
	public void setIsMisbehaving(boolean isMisbehaving) {
		this.isMisbehaving = isMisbehaving;
	}

	/**
	 * @return the isSick
	 */
	public boolean getIsSick() {
		return isSick;
	}

	/**
	 * @param isSick the isSick to set
	 */
	public void setIsSick(boolean isSick) {
		this.isSick = isSick;
	}

	/**
	 * @return the actions
	 */
	public int getActions() {
		return actions;
	}

	/**
	 * @param actions the actions to set
	 */
	public void setActions(int actions) {
		this.actions = actions;
	}

	/**
	 * @return the beenRevived
	 */
	public boolean getBeenRevived() {
		return beenRevived;
	}

	/**
	 * @param beenRevived the beenRevived to set
	 */
	public void setBeenRevived(boolean beenRevived) {
		this.beenRevived = beenRevived;
	}

	/**
	 * @return the dailyScore
	 */
	public int getDailyScore() {
		return dailyScore;
	}

	/**
	 * @param dailyScore the dailyScore to set
	 */
	public void setDailyScore(int dailyScore) {
		this.dailyScore = dailyScore;
	}

	/**
	 * @return the favToy
	 */
	public static String getFavToy() {
		return favToy;
	}

	/**
	 * @return the favFood
	 */
	public static String getFavFood() {
		return favFood;
	}

	/**
	 * @return the damage
	 */
	public static int getDamage() {
		return damage;
	}

	/**
	 * @return the speciesName
	 */
	public static String getSpeciesName() {
		return speciesName;
	}

	/**
	 * @return the hungerCo
	 */
	public static int getHungerCo() {
		return hungerCo;
	}

	/**
	 * @return the tiredCo
	 */
	public static int getTiredCo() {
		return tiredCo;
	}

	/**
	 * @return the playCo
	 */
	public static int getPlayCo() {
		return playCo;
	}

	/**
	 * @return the toiletCo
	 */
	public static int getToiletCo() {
		return toiletCo;
	}

	/**
	 * @return the originalWeight
	 */
	public static float getOriginalWeight() {
		return originalWeight;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	public static void printSpeciesStats(){
		System.out.println(String.format("Species: %s", Snake.getSpeciesName()));
		System.out.println(String.format("Favourite Toy: %s", Snake.getFavToy()));
		System.out.println(String.format("Favourite Food: %s", Snake.getFavFood()));
		System.out.println(String.format("Damage done to toy per use: %d points of toy's quality (starts at 100)", Snake.getDamage()));
		System.out.println(String.format("Hunger increase per day: %d points of hunger, where hunger is a rating of 0-100", Snake.getHungerCo()));
		System.out.println(String.format("Tiredness increase per day: %d points of tiredness, where tiredness is a rating of 0-100", Snake.getTiredCo()));
		System.out.println(String.format("Playfulness increase per day: %d points of playfulness, where playfulness is a rating of 0-100", Snake.getPlayCo()));
		System.out.println(String.format("Toilet need increase per day: %d points of toilet need, where toilet need is a rating of 0-100", Snake.getToiletCo()));
		System.out.println(String.format("Starting weight: %.2f kg", Snake.getOriginalWeight()));
		System.out.println();
	}
	
	public void viewPetStats(){
		System.out.println(String.format("Pet: %s", this.getName()));
		System.out.println(String.format("Hunger: %d%%", this.getHungerLevel()));
		System.out.println(String.format("Tiredness: %d%%", this.getTiredLevel()));
		System.out.println(String.format("Playfulness: %d%%", this.getPlayfulLevel()));
		System.out.println(String.format("Toilet Need: %d%%", this.getToiletLevel()));
		System.out.println(String.format("Mood: %d%%", this.getMood()));
		System.out.println(String.format("Weight: %.2fkg", this.getWeight()));
		System.out.println(String.format("Species: %s", Snake.getSpeciesName()));
		System.out.println(String.format("Is Alive? %b", this.getIsAlive()));
		System.out.println(String.format("Is Misbehaving? %b", this.getIsMisbehaving()));
		System.out.println(String.format("Is Sick? %b", this.getIsSick()));
		System.out.println(String.format("Actions used today: %d", this.getActions()));
		System.out.println(String.format("Favourite Toy: %s", Snake.getFavToy()));
		System.out.println(String.format("Favourite Food: %s", Snake.getFavFood()));
	}
	
	public void feed(pets2.Food food){
		this.setActions(this.getActions() + 1);
		int feedImprovement;
		int moodImprovement;
		int toiletIncrease;
		float changeInWeight;
		
		feedImprovement = (int) (Food.getNutrition() * 0.7);
		if(this.getHungerLevel() - feedImprovement <= 0){
			this.setHungerLevel(0);
		}else{
			this.setHungerLevel(this.getHungerLevel() - feedImprovement);
		}
		if (feedImprovement > 50 ){
			toiletIncrease = (int) (0.6 * feedImprovement);
		}else{
			toiletIncrease = (int) (0.3 * feedImprovement);
		}
		if(this.getToiletLevel() + toiletIncrease > 100){
			this.setToiletLevel(100);
		}else{
			this.setToiletLevel(this.getToiletLevel() + toiletIncrease);
		}
		moodImprovement = (int) (Food.getTaste() * 0.3);
		if(Snake.getFavFood() == Food.getName()){
			moodImprovement = (int) (moodImprovement * 0.5);
			this.setDailyScore(this.getDailyScore() + 50);
		}
		if(this.getMood() + moodImprovement >= 100){
			this.setMood(100);
		}else{
			this.setMood(this.getMood() + moodImprovement);
		}
		changeInWeight = (float) (this.getWeight() * 0.2);
		if(this.getWeight() <= 0){
			this.setWeight((float) 0.1);
		}else{
			this.setWeight(this.getWeight() + changeInWeight);
		}
		
	}
	
	public boolean play(String toyName, Player player){
		this.setActions(this.getActions() + 1);
		int playImprovement = 30;
		Toy toy = null;
		switch(toyName){
		case "Ball": toy = player.playersToys.get("Ball").get(0); break;
		case "Twine": toy = player.playersToys.get("Twine").get(0); break;
		case "Teddy Bear": toy = player.playersToys.get("Teddy Bear").get(0); break;
		case "Chew Toy": toy = player.playersToys.get("Chew Toy").get(0); break;
		case "Bell": toy = player.playersToys.get("Bell").get(0); break;
		case "Play House": toy = player.playersToys.get("Play House").get(0); break;
		}
		if(Snake.getFavToy() == toyName){
			playImprovement = (int) (playImprovement * 1.5);
			this.setDailyScore(this.getDailyScore() + 50);
		}
		if(this.getMood() + playImprovement >= 100){
			this.setMood(100);
		}else{
			this.setMood(this.getMood() + playImprovement);
		}
		if(this.getPlayfulLevel() - playImprovement <= 0){
			this.setPlayfulLevel(0);
		}else{
			this.setPlayfulLevel(this.getPlayfulLevel() - playImprovement);
		}
		if(toy.getQuality() - Snake.getDamage() < 0 || this.getIsMisbehaving()){
			toy.setQuality(0);
		}else{
			toy.setQuality(toy.getQuality() - Snake.getDamage());
		}
		if(toy.getQuality() <= 0){
			toy.setIsBroken(true);
		}
		if(this.getHungerLevel() + Toy.getExercise() >= 100){
			this.setHungerLevel(100);
		}else{
			this.setHungerLevel(this.getHungerLevel() + Toy.getExercise());
		}
		return toy.getIsBroken();
	}
	
	public void sleep(){
		this.setActions(this.getActions() + 1);
		int tiredImprovement = (int) (this.getTiredLevel() * 0.75);
		if(this.getTiredLevel() - tiredImprovement <= 0){
			this.setTiredLevel(0);
		}else{
			this.setTiredLevel(this.getTiredLevel() - tiredImprovement);
		}
	}
	
	public void toilet(){
		this.setActions(this.getActions() + 1);
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
			if(this.getHungerLevel() + Snake.getHungerCo() >= 100){
				this.setHungerLevel(100);
			}else{
				this.setHungerLevel(this.getHungerLevel() + Snake.getHungerCo());
			}
			if(this.getTiredLevel() + Snake.getTiredCo() >= 100){
				this.setTiredLevel(100);
			}else{
				this.setTiredLevel(this.getTiredLevel() + Snake.getTiredCo());
			}
			if(this.getPlayfulLevel() + Snake.getPlayCo() >= 100){
				this.setPlayfulLevel(100);
			}else{
				this.setPlayfulLevel(this.getPlayfulLevel() + Snake.getPlayCo());
			}
			if(this.getToiletLevel() + Snake.getToiletCo() >= 100){
				this.setToiletLevel(100);
			}else{
				this.setToiletLevel(this.getToiletLevel() + Snake.getToiletCo());
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
			this.setDailyScore((int) (this.getDailyScore() + ((100 - this.getPlayfulLevel()) * 0.5)));
			this.setDailyScore(this.getDailyScore() + (100 - this.getToiletLevel()));
			this.setDailyScore(this.getDailyScore() + this.getMood());
		}
		return this.getDailyScore();
	}
	
	public boolean shouldPetBeDead(){
		if(this.getHungerLevel() == 100 || this.getTiredLevel() == 100 || this.getToiletLevel() == 100 || this.getMood() == 0){
			return true;
		}else{
			int count = 0;
			if(this.getHungerLevel() > 90){
				count += 1;
			}
			if(this.getTiredLevel() > 90){
				count += 1;
			}
			if(this.getToiletLevel() > 90){
				count += 1;
			}
			if(this.getMood() < 10){
				count += 1;
			}
			if(count >= 2){
				return true;
			}
		}
		return false;
	}

}
