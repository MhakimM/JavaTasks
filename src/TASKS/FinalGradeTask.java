package TASKS;

import java.util.Scanner;

public class FinalGradeTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your quiz grade");
		double q = input.nextDouble();
		System.out.println("Please enter your midterm grade");
		double m = input.nextDouble();
		System.out.println("Please enter your final grade");
		double f = input.nextDouble();
		double average = ((q + m + f) / 3);
		char grade;
		if (average >= 90) {
			grade = 'A';
		} else if (average >= 70 && average < 90) {
			grade = 'B';
		} else if (average >= 50 && average < 70) {
			grade = 'C';
		} else
			grade = 'F';

		System.out.println("Your grade is " + grade);
	}

}
