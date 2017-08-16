package pl.sda.arrays;

public class ArrayForEach {

	public static void main(String[] args) {
		
		String tab[] = {"Ala", "ma", "kota", "a", "Sierotka", "ma", "rysia"};
		
		for (String str : tab) {         // FOREACH odwo³anie do wszystkich elementów tablicy
			System.out.println(str);
		}
		
		int tabInt [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for (int i : tabInt) {
			System.out.println(i * i);
		}
	}

}
