package pets2;

public class Lion extends Animal{

	public Lion(String animal_name){
		super(animal_name);
		this.favToy = "Chew Toy";
		this.favFood = "Burritos";
		this.damage = 30;
		this.speciesName = "Lion";
		this.hungerCo = 40;
		this.tiredCo = 30;
		this.playCo = 20;
		this.toiletCo = 10;
		this.originalWeight = (float) 175;
		this.className = "Lion";
		this.weight = originalWeight;
	}
}
