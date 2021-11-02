package TASKS;

import java.util.Scanner;

public class DMVTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner dmv = new Scanner(System.in);
		System.out.println("What is your age?");
		int age = dmv.nextInt();
		if (age >= 18) {
			System.out.println("You can get a drivers license");
		} else {
			System.out.println("You need to get a permit");

		}

	}

}
