package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		String [] names = new String[n];
		String [] email = new String[n];
		int [] rooms = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Rent #" + (i + 1));
			System.out.println("Enter customer data: ");
			System.out.println("Name: ");
			names[i] = sc.next();
			System.out.println("Email: ");
			email[i] = sc.next();
			System.out.println("Room: ");
			rooms[i] = sc.nextInt();
		}
		
		System.out.println("Busy rooms");
		for (int i = 0; i < n; i++) {
			if (rooms[i] != 0) {
				System.out.printf("%d: %s, %s %n", rooms[i] ,names[i], email[i]);
			}
		}
		
		sc.close();
	}

}
