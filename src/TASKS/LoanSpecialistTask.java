package TASKS;

import java.util.Scanner;

public class LoanSpecialistTask {

	public static void main(String[] args) {

		Scanner loan = new Scanner(System.in);
		System.out.println("What is your loan amount?");
		double money = loan.nextDouble();
		if (money <= 200000) {
			System.out.println("Congratulations, your loan is approved");
		} else {
			System.out.println("We are sorry but your request isn't approved");
		}
	}

}
