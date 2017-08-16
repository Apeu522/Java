package pl.sda.conditions;

import java.util.Scanner;

public class IfConditions {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Podja wiek: ");
		int age = scanner.nextInt();
		
		if (age >= 18){
			System.out.println("Wejscie do systemu");
		} else{
			System.out.println("Odmowa dostêpu");
		}
		
		scanner.close();
	}
}
