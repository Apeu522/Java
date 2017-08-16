package pl.sda.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.BorderFactory;

public class MainReader {

	public static void main(String[] args) throws IOException {

		File file = new File("plik.txt");
		System.out.println(file.exists());
		
		boolean ok = false;
		if (!file.exists()){
			ok = file.createNewFile();
		}
		System.out.println(ok);
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		
		String line = br.readLine();
		
		while (line != null){
		
		System.out.println(line);
		line = br.readLine();
		
		}
		
	
	}
}



















