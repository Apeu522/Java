package pl.sda.obiektowoœæ;

import pl.sda.model.Animal;
import pl.sda.model.Dog;

public class Main {

	public static void main(String[] args) {

		Animal dog = new Dog(" "); // TypObiektu NazwaZmiennej = Nowy ObiektTypuDog
		
			dog.setAge(10);
			dog.setWeight(14);
			dog.setName("Warczyslaw");
			dog.setColor("biszkoptowy");
		
		Animal dog2 = new Dog(" "); // TypObiektu NazwaZmiennej = Nowy ObiektTypuDog
		
			dog2.setAge(5);
			dog2.setWeight(40);
			dog2.setName("Anon");
		
			dog.voice("hauhau");				//pobieranie metody voice
			System.out.println(dog.getColor()); //pobieranie koloru z metody getColor
			
			dog2.voice("tttttt");
			
			int length = dog.nameLength();
			int length2 = dog2.nameLength();
			
			System.out.println(length);
			
		
		System.out.println(dog.getAge() + " " + dog.getWeight() + " " + dog.getName()); // mo¿na te¿ w taki sposob zeby nie pisac
		System.out.println(dog.getAge());									// w kazdej linijce
		System.out.println(dog.getWeight());
		System.out.println(dog.getName() + " liczba liter w imieniu: " + length);
		
		System.out.println();
		
		System.out.println(dog2.getAge() + " " + dog2.getWeight() + " " + dog2.getName());
		System.out.println(dog2.getAge());
		System.out.println(dog2.getWeight());
		System.out.println(dog2.getName() + " liczba liter w imieniu: " + length2); 
		
	}
}
