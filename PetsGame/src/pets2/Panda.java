package pets2;

public class Panda extends Animal{
	
	
	public Panda(String animal_name){
		super(animal_name);
		this.favToy = "Play House";
		this.favFood = "Spaghetti";
		this.damage = 10;
		this.speciesName = "Panda";
		this.hungerCo = 30;
		this.tiredCo = 20;
		this.playCo = 20;
		this.toiletCo = 20;
		this.originalWeight = (float) 70;
		this.className = "Panda";
		this.weight = originalWeight;
	}
}

