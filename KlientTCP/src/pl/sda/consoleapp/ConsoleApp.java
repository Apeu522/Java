package pl.sda.consoleapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ConsoleApp {

	public static void main(String[] args) {

		System.out.println("\n\nClientTCP\n\n");
		
		

		Socket socket = null;
		try {
			socket = new Socket(args[0], Integer.parseInt(args[1]));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		InputStream inputStream = null;
		try {
			inputStream = socket.getInputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		OutputStream outputStream = null;
		try {
			outputStream = socket.getOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(inputStreamReader);
		
		String receivedText = "DEFAULT receivedText";
		String transmittedText = "DEFAULT transmittedText";
		
		int p;
		byte[] receivedData = new byte[1024];
		
		while(!transmittedText.equals("exit")){
			try {
				transmittedText = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("ECHO" + transmittedText);
			
			try {
				outputStream.write(transmittedText.getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				p= inputStream.read(receivedData);
				if(p != -1){
					receivedText = new String(receivedData, 0, p);
					
					System.out.println("SERVER: " + receivedText);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}
		
	}
}
