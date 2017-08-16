package pl.sda.conditions;

public class ContinueCondition {

	public static void main(String[] args) {

//		for (int i = 0; i < 10; i++) {
//			
//			if (i == 5) {
//				continue;
//				}
//			// to sie nie wykona jesli zmienna "i" bedzie rowna 5
//			System.out.println(i);
//		}
		
		peniz: 
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 3){
					break peniz; //continue albo break.
				}
			
				System.out.println("j: " + j);
		
			}
			
			System.out.println("i: " + i);
		
		}
	}
}
