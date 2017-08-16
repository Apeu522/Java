package pl.sda.udp;

import java.io.IOException;
import java.net.DatagramPacket; // Tworzenie pakietu
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
//import java.net.SocketException; nie uzywamy trows exception poniewa� lepiej obs�u�y� ten wyj�tek ni� przerwa� program
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {

		final String ipaddress = "192.168.0.118";
		final int port = 55521;
		final int portdoc = 55555;

		InetAddress ip = null;
		try {
			ip = InetAddress.getByName(ipaddress);
		} catch (UnknownHostException uhe) {
			uhe.printStackTrace();
		}

//		byte[] buf = new byte[6];
//		buf[0] = 77;
//		buf[1] = 97;
//		buf[2] = 99;
//		buf[3] = 105;
//		buf[4] = 101;
//		buf[5] = 106;

		DatagramSocket ds = null; // wyciagamy poza blok try catch by mozna by�o uzyc zmiennej ds poza blokiem 
		try {
			ds = new DatagramSocket(port); // w nawiasie wpisujemy port (jest to port lokalny - nasz)
		} catch (SocketException se) { // na przyk�ad zajety port, lub
										// uruchomienie na tym samym porcie, nie
										// zaimplementowana obsluga portu UDP
			se.printStackTrace(); // wyswietlanie drzewa wyjatku
		}

		// pierwsza jest to d�ugo�� bufora, kt�ry przepycha nam dane przez
		// socket, drugie jest to ile znak�w wykorzystujemy z tego bufora (ile
		// ma pobra� znak�w z bufora)
		
//		DatagramPacket dp = new DatagramPacket(buf, 6, ip, port);
//		
//		try {
//			ds.send(dp);
//		} catch (IOException ioe) {
//			ioe.printStackTrace();
//		}
		
		String textMessage = "Yeti istnieje, m�wi� wam";
		
		byte[] buf1 = textMessage.getBytes();
		
		DatagramPacket dp1 = new DatagramPacket(buf1, buf1.length, ip, portdoc);
		
		try {
			ds.send(dp1);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		ds.close(); // zamkniecie portu by mo�na go by�o ponownie uzyc

	}

}
