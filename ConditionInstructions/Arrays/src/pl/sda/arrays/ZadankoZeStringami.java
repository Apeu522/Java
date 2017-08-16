package pl.sda.arrays;

public class ZadankoZeStringami {
	public static void main(String[] args) {
		
		
		int couter = 0;
		String tab[] = {"Kot", "Kon", "Koza", "owca"} ;
		
		for (int i = 0; i < tab.length; i++) {
			if(tab[i].length() == 3) {
			couter++;
		}
		}
				System.out.println("couter is: " + couter);
	}

} 
