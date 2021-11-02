package TASKS;

import java.util.Scanner;

public class HeightTask {

	public static void main(String[] args) {
		
	Scanner input=new Scanner (System.in);
	System.out.println("Please enter your height in inches");
	
	int num = input.nextInt();

	if (num < 60) {
		System.out.println("Short");

	} else if (num >= 60 && num <= 72) {
		System.out.println("Medium");
	} else if (num >72) {
		System.out.println("Tall");
	
	}
				
	}
}
