package pl.sda.model;

public abstract class Animal {

	private static int counter = 0;         //
	
	protected String name;		//pola (zmienne okreslajace stan naszego obiektu)
	protected int age;			// starajmy sie tworzyc zmienne jako private a najlepiej protected (widoczne w danym
	protected double weight;	// pakiecie a nie we wszystkich plikach)
	protected char sex;
	protected String color; 
	

	public Animal (String name) {
		
		this.name = name;
		this.weight = 1.0;
	}
	
	public Animal (int age) {
		this("Jacek");
			
		this.age = age;
		System.out.println("constructor super class");
	}
	
	public Animal(String name, int age, double weight, char sex, String color) {
		
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.sex = sex;
		this.color = color;
	}

	public static int getCounter() {
		
		return counter;
		}
	
	public static void incrementCounter() {
		
		counter++;
	}
	
	public double getPI() {
		
		return Math.PI;
	}
	
	public abstract void voice(String s);
	
//	public void voice(String s) { 			//void <== ¿eby metoda nic nie zwraca³a tylko ¿eby siê wykona³a bez ¿adnego rezultatu
//											// tylko wykonuje instrukcje które sa zawarte.	
//		System.out.println(s);				// wypisanie metody bez zwrotu dzia³ania; instrukcja.
//		getCounter();
//		
//	}
	
	public int nameLength()  {					//a metody twórzmy jako public ¿eby by³y dostêpne w innych pakietach
		
		return name.length(); // zwracanie wyniku dzia³ania metody
		
	}
	
	public void setColor(String c)  {  
		color = c; 
	}
	
	public String getColor()  {  			//bez void zostanie zwrócony wynik dzia³ania 
		return color;
	}

	public String getName() {   // generowanie setterów i getterów: ppm>source>get setters ang getters
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", weight=" + weight + ", sex=" + sex + ", color=" + color
				+ "]";
	}
	
	
		
}
