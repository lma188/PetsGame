package pets2;

public class Dog extends Animal{
	
	public Dog(String animal_name){
		super(animal_name);
		this.favToy = "Ball";
		this.favFood = "Chocolate";
		this.damage = 20;
		this.speciesName = "Dog";
		this.hungerCo = 30;
		this.tiredCo = 10;
		this.playCo = 40;
		this.toiletCo = 30;
		this.originalWeight = (float) 22;
		this.className = "Dog";
	}
}
