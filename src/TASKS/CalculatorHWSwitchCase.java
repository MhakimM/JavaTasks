package TASKS;

import java.util.Scanner;

public class CalculatorHWSwitchCase {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = input.nextInt();
		System.out.println("Enter second number");
		int num2 = input.nextInt();
		System.out.println("Choose an operator");
		char oper = input.next().charAt(0);
		String result = null;

		switch (oper) {
		case '+':
			result = "Result= " + (num1 + num2);
			break;
		case '-':
			result = "Result= " + (num1 - num2);
			break;
		case '*':
			result = "Result= " + (num1 * num2);
			break;
		case '/':
			result = "Result= " + (num1 / num2);
			break;
		}

		System.out.println(result);
	}
}
