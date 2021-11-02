package TASKS;

import java.util.Scanner;

public class CityTempTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your city");
		String city = input.next();
		System.out.println("What is the temp in F?");

		int temp = input.nextInt();
		int FtoC = ((temp - 32) * 5 / 9);

		System.out.println("The temperature in the city of " + city + " is " + FtoC);

	}

}
