package TASKS;

import java.util.Scanner;

public class PurchaseTask {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("What would you like to buy?");
		String item = scan.next();

		double itemPrice = 380;
		System.out.println("Please pay for the " + item + ". The cost is $" + itemPrice);
		double amountPaid = scan.nextDouble();

		while (itemPrice > amountPaid) {
			System.out.println("You still owe $" + (itemPrice - amountPaid) + " more");
			itemPrice -= amountPaid;
			amountPaid = scan.nextDouble();
		}
		if (amountPaid == itemPrice) {
			System.out.println("Great, thank you for shopping with us!");
		} else if (amountPaid > itemPrice) {
			System.out.println("Here is your change $" + (amountPaid - itemPrice) + " .Thank you for your business!");

		}

	}
}
