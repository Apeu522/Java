package pl.sda.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainWriter {

	public static void main(String[] args) throws IOException {
	
		File file = new File("plik.txt");
		System.out.println(file.exists());
		
		boolean ok = false;
		if (!file.exists()){
			ok = file.createNewFile();
		}		
		
		BufferedWriter bw = null;
		try {
		FileWriter fw = new FileWriter(file, true);		//true znaczy ¿e plik nie bedzie nadpisywany tylko bedzie dopisywane do niego
		bw = new BufferedWriter(fw);
		
		bw.write("\nala ma kota a marysia");
		bw.newLine();
		bw.write("chuj chuj kurwa");
		bw.flush();								//czyszczenie buffora
		} finally {
			bw.close();
		}
			
	}

}
