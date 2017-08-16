package pl.sda.arrays;

public class TwoDimensionArray {

	public static void main(String[] args) {

		int tab[][] = {
							{2, 5, 8, 6},
							{1, 2, 3, 4},
							{7, 9, 12, 14}
						};
		
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				System.out.print(tab[i] [j] + " ");
			}
			System.out.println();
			
		}
		
		
//----------------------------------------------------------------------------------------
		
		//Tabliczka mno¿enia
		
		int array[][] = new int[11][11];
		System.out.println();
		System.out.println();
		
		for (int i = 1; i < array.length; i++) {
			for (int j = 1; j < array[i].length; j++) {
			
				array[i][j] = i * j ;
				System.out.print(i + " * " + j + " = " + array[i][j] + "\t");
			
			}
			
			System.out.println();
		}
		
	}

}


















