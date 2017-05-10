package pets2;


public interface Animal {


	/**
	 * @return the className
	 */
	public String getClassName();


	/**
	 * @return the hungerLevel
	 */
	public int getHungerLevel();

	/**
	 * @param hungerLevel the hungerLevel to set
	 */
	public void setHungerLevel(int hungerLevel);

	/**
	 * @return the tiredLevel
	 */
	public int getTiredLevel();

	/**
	 * @param tiredLevel the tiredLevel to set
	 */
	public void setTiredLevel(int tiredLevel);

	/**
	 * @return the playfulLevel
	 */
	public int getPlayfulLevel();

	/**
	 * @param playfulLevel the playfulLevel to set
	 */
	public void setPlayfulLevel(int playfulLevel);

	/**
	 * @return the toiletLevel
	 */
	public int getToiletLevel();

	/**
	 * @param toiletLevel the toiletLevel to set
	 */
	public void setToiletLevel(int toiletLevel);

	/**
	 * @return the mood
	 */
	public int getMood();

	/**
	 * @param mood the mood to set
	 */
	public void setMood(int mood);

	/**
	 * @return the isAlive
	 */
	public boolean getIsAlive();

	/**
	 * @param isAlive the isAlive to set
	 */
	public void setIsAlive(boolean isAlive);

	/**
	 * @return the weight
	 */
	public float getWeight();

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(float weight);

	/**
	 * @return the isMisbehaving
	 */
	public boolean getIsMisbehaving();

	/**
	 * @param isMisbehaving the isMisbehaving to set
	 */
	public void setIsMisbehaving(boolean isMisbehaving);

	/**
	 * @return the isSick
	 */
	public boolean getIsSick();

	/**
	 * @param isSick the isSick to set
	 */
	public void setIsSick(boolean isSick);

	/**
	 * @return the actions
	 */
	public int getActions();

	/**
	 * @param actions the actions to set
	 */
	public void setActions(int actions);

	/**
	 * @return the beenRevived
	 */
	public boolean getBeenRevived();

	/**
	 * @param beenRevived the beenRevived to set
	 */
	public void setBeenRevived(boolean beenRevived);

	/**
	 * @return the dailyScore
	 */
	public int getDailyScore();

	/**
	 * @param dailyScore the dailyScore to set
	 */
	public void setDailyScore(int dailyScore);

//	/**
//	 * @return the favToy
//	 */
//	public String getFavToy();

//	/**
//	 * @return the favFood
//	 */
//	public String getFavFood();
//
//	/**
//	 * @return the damage
//	 */
//	public int getDamage();
//
//	/**
//	 * @return the speciesName
//	 */
//	public String getSpeciesName();
//
//	/**
//	 * @return the hungerCo
//	 */
//	public int getHungerCo();
//
//	/**
//	 * @return the tiredCo
//	 */
//	public int getTiredCo();
//
//	/**
//	 * @return the playCo
//	 */
//	public int getPlayCo();
//
//	/**
//	 * @return the toiletCo
//	 */
//	public int getToiletCo();
//
//	/**
//	 * @return the originalWeight
//	 */
//	public float getOriginalWeight();

	/**
	 * @return the name
	 */
	public String getName();
	
//	public void printSpeciesStats();
	
	public void viewPetStats();
	
	public void feed(pets2.Food food);
	
	public boolean play(String toyName, Player player);
	
	public void sleep();
	
	public void toilet();
	
	public void dailyUpdateStats();
	
	public int calculatePetDailyScore();
	
	public boolean shouldPetBeDead();
}
