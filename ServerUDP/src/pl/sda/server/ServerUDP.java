package pl.sda.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ServerUDP {

	public static void main(String[] args) {

		final int LOCAL_PORT = 55511;

		while (true) {

			DatagramSocket ds = null;
			try {
				ds = new DatagramSocket(LOCAL_PORT);
			} catch (SocketException se) {
				se.printStackTrace();
			}

			byte[] buf = new byte[15000];

			DatagramPacket dp = new DatagramPacket(buf, buf.length);

			try {
				ds.receive(dp);
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}

			String mes = new String(buf, 0, buf.length); // fajny sposób na
															// wyswietlanie
															// bufferu
			System.out.println(mes);

			// for (byte b : buf) {
			// char a;
			// a = (char) b;
			// System.out.print(b);
			// }

			ds.close(); // zamkniecie portu by mo¿na go by³o ponownie uzyc
		}
	}

}
