package pl.sda.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class MainClientTCP {

	// static do pól u¿ywamy z umiarem, bo czasem one powoduja nam ciezkie do
	// wykrycia bledy

	public static void main(String[] args) {

		final String host = "firehost.pl";
		final int port = 25;

		Socket socket = null;
		try {
			socket = new Socket(host, port); // socket musi miec adres i port
		} catch (UnknownHostException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		InputStream inputStream = null;
		try {
			inputStream = socket.getInputStream(); // wyciagamy z socketu
													// inputStream poprzez
													// metode getInputStream
		} catch (IOException e) {
			e.printStackTrace();
		}
		OutputStream outputStream = null;
		try {
			outputStream = socket.getOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// BufferedReader br = new BufferedReader(System.in);

		byte[] buffer = new byte[1500]; // tworzymy buffor do odbierania
										// wiadomoœci

		String textMessage = "mail from <nadawca@example.com>"; // tworzymy wiadomosc

		byte[] byteMessage = textMessage.getBytes(); // tworzymy nowa zmienna
														// jako tablice i w niej
														// zapisujemy ta
														// wiadomosc w bajtach

		try {
			outputStream.write(byteMessage); // ta komenda powoduje nam wys³anie
												// wiadomosci do serwera
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Teraz tak ta czesc kodu bedzie nam wyswietlac odpowiedz serwera na
		// nasze zapytanie
		try {

			// Teraz przypisujemy odpowiedz serwera do jakiejs zmiennej by nie
			// wyswietla³o nam ca³ego buffera, tylko wartosciowe informacje.
			// Zmienna ta jest nam potrzebna by mozna by³o ja uwarunkowac IFem
			int result = inputStream.read(buffer);

			if (result > 0) { // dajemy result > 0 by nie wyswietla³o nam
								// pustych miejsc bufferu jeœli nic w nim nie ma 
				
				//Teraz uzywamy metody zastosowanej w ServerUDP do wyswietlania wiadomosci
				String resultMessage = new String(buffer, 0, result);
				System.out.println(resultMessage);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Na koniec zamykamy od konca otwarte rzeczy :
		
		try {
			inputStream.close();
			outputStream.flush();
			outputStream.close();
			if (socket != null){
			socket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// teraz co zrobic by wys³ac dobre zapytanie:
		//Jest taka stara metoda GET / HTTP/1.0\r\n --- mi nie zadzia³a³a
		//Nowa metoda ponoæ na pewno zadzia³a GET / HTTP/1.1\r\nHost: www.google.pl\r\n\r\n
	}

}
