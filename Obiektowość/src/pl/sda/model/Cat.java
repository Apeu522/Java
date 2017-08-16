package pl.sda.model;

public class Cat extends Animal implements Carnivore {

	
	public Cat(int age) {
		super(age);
	}

	@Override
	public void voice (String s)	{
		System.out.println("Miau Miau " + s);
	}
	
	
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", weight=" + weight + ", sex=" + sex + ", color=" + color + "]";
	}

	@Override
	public void eatMeat() {
		System.out.println("Jem Miêso");
	}
	
	

}
