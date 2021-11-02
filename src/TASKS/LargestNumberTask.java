package TASKS;

import java.util.Scanner;

public class LargestNumberTask {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("pls enter first number");
		int num1 = input.nextInt();
		System.out.println("pls enter second number");
		int num2 = input.nextInt();
		System.out.println("pls enter third number");
		int num3 = input.nextInt();

		if (num1 == num2 && num2 == num3) {
			System.out.println("The numbers are equal");
		}

		if (num1 >=num2 && num1 > num3) {
			System.out.println(num1+" is the largest number");
			
			if(num1%2==0) {
				System.out.println(num1+" is the even number");
			}else {
				System.out.println(num1+" is the odd number ");
			}
		} else if (num2 >= num1 && num2 > num3) {
			System.out.println(num2 + " is the largest number");
		} else if (num3 >= num1 && num3 > num2) {
		
			System.out.println(num3 + " is the largest number");
			
			
			
			
			

		}

	}

}
