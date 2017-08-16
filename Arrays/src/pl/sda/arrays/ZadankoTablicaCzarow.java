package pl.sda.arrays;

public class ZadankoTablicaCzarow {
	
	public static void main(String[] args) {
		
		char charArray[] = {'a', 'b', 'c', 'd'};
		
		for (int i = 0; i < charArray.length; i++){
			charArray[i] = (char) (charArray[i] - 32);
		}
		
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}

}
}
