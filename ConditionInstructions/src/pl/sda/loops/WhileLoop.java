package pl.sda.loops;

public class WhileLoop {

	public static void main(String[] args) {

		int a = 1;

		while (a < 10) {
			System.out.println(a);
			a++; // a = a + 1; System.out.println(a++); [ALTERNATYWY]
		}

		int x = 10;

		do { //w DO WHILE petla wykona sie przynajmniej raz
			System.out.println(x++);
		} while (x < 5);

	}

}
