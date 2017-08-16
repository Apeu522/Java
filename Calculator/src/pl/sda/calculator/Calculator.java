package pl.sda.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		
		if (args.length == 2) {
			if (!(args[0].equals("login") && args [1].equals("pass"))) {
				System.out.println("podano niewlasciwe dane logowania");
				System.exit(0);
				
			}	
		}	else {System.out.println("podano niewlasciwa ilosc argumentow");
		System.exit(0);
		}
		
		Scanner scanner = new Scanner(System.in);
		double a, b;
		int menu;
		double score = 0.0;

		System.out.println("Witaj w kalkulatorze");

		do {
			System.out.print("Podaj 1 liczbe ");
			a = scanner.nextDouble(); // jesli zmienimy a i b na double
			System.out.print("Podaj 2 liczbe ");
			b = scanner.nextDouble(); // to skaner tez zmieniamy na double

			System.out.println(
					"Wybierz dzia³anie jakie chcesz wykonaæ: Dodawanie (1), Odejmowanie (2), Mno¿enie (3), Dzielenie (4), Zakoñcz (5)");
			menu = scanner.nextInt();

			switch (menu) {
			case 1:
				score = a + b;
				System.out.println("Wynik dzia³ania: " + score);
				break;
			case 2:
				score = a - b;
				System.out.println("Wynik dzia³ania: " + score);
				break;
			case 3:
				score = a * b;
				System.out.println("Wynik dzia³ania: " + score);
				break;
			case 4:
				score = (1.0 * a / b); // mnozymy 1.0, by wynik by³ w double
				System.out.println("Wynik dzia³ania liczb " + a + " i " + b + " : " + score);
				break;
			case 5:
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Nie rozpoznano dzia³ania");
			}
		} while (true);

	}

}
