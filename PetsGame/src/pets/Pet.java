	public void feed(Food foodToBeEaten){
		int feedImprovement; // For hungerLevel
		int moodImprovement; // I think we should set a variable for moodCo in Species, so we can calculate the value of improvement in mood.
		int currentHungerLevel = this.getHungerLevel();
		int currentMood = this.getMood();
		int currentWeight = this.getWeight();
		int changingWeight; // are we going to have different rate of changingweight for different species or same? my code is for same rate.
		int currentToiletLevel = this.getToiletLevel();
		boolean currentSick = this.getIsSick();
		
		
		
		feedImprovement = this.getFood().getNutritionalValue() *(1 - this.getPetSpecies().getHungerCo()); // Nutritional_Value * HungerCo
		foodToBeEaten.setHungerLevel(currentHungerLevel - feedImprovement);
		
		
		if(currentMood == 100){
			moodImprovement = 0
		}else{
			moodImprovement = (this.getFood().getTastiness() * this.getPetSecies().getMoodCo())/100;
		}
		if(this.getPetSpecies().getFavFood() == foodToBeEaten){
			moodImprovement = (int) (moodImprovement * 1.5)	
		}else{
			moodImprovement = moodImprovement;
		}
		if(currentMood + moodImprovement >= 100){
			this.setMood(100);
		}else{
			this.setMood(currentMood + moodImprovement);
		}
		
		changingWeight = (this.getHungerLevel - feedImprovement + toyToBePlayed.getExerciseRequired())  ;// (hungerLevel + ExerciseRequired) * 0.05 
		foodToBeEaten.setWeight(currentWeight + changingWeight);// currentWeight = current_weight + changingWeight 
		ratio_weight = this.getWeight() / this.getPetSpecies().getOriginalWeight();
		if (ratio_weight > 2 || ratio_weight < 0.5 ){
			this.getIsSick() == True;
		}else{
			this.getIsSick() == False
		}
		
		if (foodImprovement > 70 ){
			this.setToiletLevel(currentToiletLevel * (1.5 + this.getPetSpecies().getTolietCo())) 
		}else{
			this.getToiletLevel(currentToiletLevel * (1 + this.getPetSpecies().getTolietCo())) 
		}
		
