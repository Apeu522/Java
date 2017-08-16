package pl.sda.model;

public class Dog extends Animal implements Omnivore {			//extends dziedziczenie atrybutów z clasy Animal.


	public Dog(String string) {
		
		super(string);			//super - Kontruktorze 'Dog' wywo³aj mi konstruktor z nadklasy('Animal').
		System.out.println("constructor dog class");
	}
	
	
	public Dog(String name, int age, double weight, char sex, String color) {
		super(name, age, weight, sex, color);
	}

	
	@Override
	public void voice (String s)	{ //<=== nadpisywanie/przeci¹¿anie metody.
		System.out.println("WoW WoW " + s);
	}
	
	
	@Override //<=== nadpisanie metody.
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", weight=" + weight + ", sex=" + sex + ", color=" + color + "]";
	}




	@Override
	public void eatMeat() {
		
		
		
	}




	@Override
	public void eatPlant() {
			
	}		
	
}
