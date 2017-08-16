package pl.sda.conditions;

import java.util.Scanner;

public class IfConditions2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Podja wiek: ");
		int age = scanner.nextInt();

		if (age < 6) {
			System.out.println("Wiek przedszkolny");
		} else if (age >=6 && age <12) {
			System.out.println("Wiek szkolny");
		} else if (age >12 && age <=16) {
			System.out.println("Wiek gimnazjalny");
		} else {
			System.out.println("Wiek ponadgimnazjalny");
		}

		scanner.close();
	}
}
