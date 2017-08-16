package pl.sda.codeBlocks;

public class BlockExample {
	
	int tab[] = new int[10];
	
	static {
		System.out.println("jestem w bloku statycznym");
	}
	
	{
		System.out.println("Jestem w bloku");		//blok inicjalizacyjny
		tab[0] = 1;
		tab[1] = 18;
	}
	
	public BlockExample() {
		System.out.println("Konstruktor");
		System.out.println(tab[1]);
	}
	
	

}
