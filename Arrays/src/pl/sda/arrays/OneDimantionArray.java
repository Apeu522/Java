package pl.sda.arrays;

public class OneDimantionArray {

	public static void main(String[] args) {
		
		int array [] = new int [4];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		// System.out.println(array[]);
		
		for (int i = 0; i < array.length; i++) {
			array[i] = i * i;
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			
		}
		System.out.println();
		System.out.println();
		System.out.println(array.length); //sprawdzanie ile ma elementów tablica w danym wierszu [DanyWiersz]
	}

}
