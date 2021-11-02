package TASKS;

import java.util.Scanner;

public class CCTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Do you have a CC");
		boolean CC = input.nextBoolean();

		if (CC == true) {
			System.out.println("What is balance on CC");
			double balance = input.nextDouble();

			if (balance > 1000) {
				System.out.println("Pls pay off");
			} else {
				System.out.println("You may spend more");
			}
		} else {
			System.out.println("Do you want to open a CC");
		}

	}

}
