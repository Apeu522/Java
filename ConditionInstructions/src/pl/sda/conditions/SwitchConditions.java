/**
 * 
 */
package pl.sda.conditions;

// Te informacje generujemy przy tworzeniu klasy
// Komentarz z dwoma gwiazkami jest traktowany jako dokumentacja

/**
 * @author Maciej Podkowa
 * @since 09.03.2017
 */
public class SwitchConditions {

	public static void main(String[] args) {

		// zmienne, ktore przyjmuje SWITCH :
		// byte, short, int, char, enum, String (z du�ej bo nazwa klasy)
		// !!!!!!!!!!!!!!!!!!!!!!

		int a = 5;
		final int d = 5; // final oznacza zmienna jako sta��
						 // raz nadanej zmiennej finalnej nie mozna zmienic

		switch (a) {
		case 1 + 1: // litera�y s� to zmienne zapisane w pamieci komputera
					// i dlatego mo�emy je do siebie dodac w CASE
					// musi byc to sta�a
			System.out.println("dwa");
			break; // pami�taj o BREAK'ach i o �rednikach :P
			
		case d:    // tu mo�emy u�y� zmiennej "d" poniewa� zadeklarowali�my
			       // j� jako sta�� poprzez final
			System.out.println("piec");
			break;
		case 7:
			System.out.println("siedem");
			break;
		default:
			System.out.println("Nierozpoznana wartosc");
			break; // tu te�
		}
		char b = 'B';

		switch (b) {
		case 'A':
			System.out.println("Odpowiedz A");
			break; // pami�taj o BREAK'ach i o �rednikach :P
		case 'B':
			System.out.println("Odpowiedz B");
			break;
		case 'C':
			System.out.println("Odpowiedz D");
			break;
		default:
			System.out.println("Zadna z powyzszych");
			break; // tu te�
		}
	}
}
