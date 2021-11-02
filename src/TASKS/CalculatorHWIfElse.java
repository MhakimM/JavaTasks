package TASKS;

import java.util.Scanner;

public class CalculatorHWIfElse {

	public static void main(String[] args) {

		/*
		 * Using scanner, create calc and allow user to input 2 numbers and perform one
		 * of the operators Based on operator, profvid result to user.
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number");
		double num1 = input.nextDouble();
		System.out.println("Enter second number");
		double num2 = input.nextDouble();
		System.out.println("Choose an operator");
		char oper = input.next().charAt(0);

		double calc = 0;

		if (oper == '+') {
			calc = (num1 + num2);
		} else if (oper == '-') {
			calc = (num1 - num2);
		} else if (oper == '*') {
			calc = (num1 * num2);
		} else if (oper == '/') {
			calc = (num1 / num2);
		}

		System.out.println("Your answer is " + calc);

	}
}
