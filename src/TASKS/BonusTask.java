package TASKS;

import java.util.Scanner;

public class BonusTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner work=new Scanner(System.in);
		System.out.println("Please enter number of years worked");
		int years=work.nextInt();
		System.out.println("What is your annual salary?");
		int salary=work.nextInt();
		if (years>=5) {
			System.out.println("You are eligible for bonus");
			if (salary>=50000) {
				System.out.println("Your bonus is 5000");
			}else {
				System.out.println("Your bonus is 3000");}
		}else {
				System.out.println("No bonus");
			}
		
	}
		
		
		
		
		
	
}

