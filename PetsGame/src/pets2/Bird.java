package pets2;

public class Bird extends Animal{
	
	public Bird(String animal_name){
		super(animal_name);
		this.favToy = "Bell";
		this.favFood = "Kale";
		this.damage = 10;
		this.speciesName = "Bird";
		this.hungerCo = 20;
		this.tiredCo = 10;
		this.playCo = 10;
		this.toiletCo = 50;
		this.originalWeight = (float) 1;
		this.className = "Bird";
		this.weight = originalWeight;
	}
}
