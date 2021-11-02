package TASKS;

import java.util.Scanner;

public class LargerNumber {

	public static void main(String[] args) {

		Scanner user = new Scanner(System.in);
		System.out.println("Please input your first number: ");
		int num1 = user.nextInt();
		System.out.println("Please input your second number: ");
		int num2 = user.nextInt();

		if (num1 > num2) {
			System.out.println("Your first number " + num1 + " is larger than your second number " + num2);
		} else {
			if (num1 == num2) {
				System.out.println("Both numbers are same");
			} else {
				System.out.println("Your first number " + num1 + " is smaller than your second number " + num2);

			}
		}
	}
}
