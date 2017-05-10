package pets2;

public class Cat extends Animal{
	
	public Cat(String animal_name){
		super(animal_name);
		this.favToy = "Twine";
		this.favFood = "Pizza";
		this.damage = 15;
		this.speciesName = "Cat";
		this.hungerCo = 15;
		this.tiredCo = 40;
		this.playCo = 30;
		this.toiletCo = 10;
		this.originalWeight = (float) 5;
		this.className = "Cat";
	}
}
