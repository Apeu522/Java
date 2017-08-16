package pl.sda.obiektowosc2;

import pl.sda.model.Animal;
import pl.sda.model.Cat;
import pl.sda.model.Dog;

public class Main2 {

	public static void main(String[] args) {

//		Animal dog = new Animal();
//		dog.voice(" menda");
//		
//		dog.setName("Antek");
//		
//		System.out.println(dog.getName());
//		System.out.println(dog.nameLength());
//	}
		//======================================================================================================
		
//		Dog dog = new Dog();
//		dog.setAge(13);
//		dog.setColor("czorny");
//		dog.setName("Burek");
//		dog.setSex('m');
//		dog.setWeight(25);
//		System.out.println(dog.toString());
//		dog.voice(" Burek");
//		System.out.println();
//		
//		
//		Cat cat = new Cat();
//		cat.setAge(3);
//		cat.setColor("bio³y");
//		cat.setName("Filemon");
//		cat.setSex('f');
//		cat.setWeight(13);
//		System.out.println(cat.toString());
//		cat.voice(" Filemon");
		
		//======================================================================================================
		
//		System.out.println(Animal.getCounter());
//		
//			Animal.incrementCounter();
//			Animal.incrementCounter();			//je¿eli jest private to dzia³amy za pomoc¹ metod
//			Animal.incrementCounter();
//		
//		System.out.println(Animal.getCounter());
//		
//			Animal.counter = 43554;
//		System.out.println(Animal.getCounter()); 		// je¿eli zmienna jest public to mo¿emy dowoln¹ wartoœæ podaæ.
	
	//===========================================================================================================

//	Dog a = new Dog("Jacek");
//	System.out.println(a.getName());
//	
//	Dog a2 = new Dog("Zbyszek", 12, 23.5, 'F', "Gówniany");
//	System.out.println(a2);					//a2.toString te¿ mo¿na u¿yæ ale ³atwej napisaæ "a2"
//	System.out.println(a2.toString());		// o w³asnie to jest dowód ¿e tak te¿ mo¿esz :P
	
	//Dog d = new Dog(12);
	Dog d2 = new Dog("zbigniew", 15, 2.5, 'm', "BlaszanyS");
//	System.out.println(d);
	System.out.println(d2);
	
	d2.voice("");
	
	Cat c = new Cat(15);
	System.out.println(c);
	c.voice("");
	
	//=======================================================================================================
	
	Animal dog = new Dog("wacek");
	Animal cat = new Cat(12);
	
	dog.voice("hehe");
	cat.voice("haha");
	System.out.println();
	System.out.println();
	System.out.println();
	
	Animal animals[] = new Animal[2];
		animals[0] = dog;
		animals[1] = cat;
		
		for (Animal an : animals) {
			an.voice("rrr");
			System.out.println(an);
			
			
		}
	
	}	
}