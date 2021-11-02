package TASKS;

import java.util.Scanner;

public class WeekendOrWeekdayTask {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("pls enter day number");

		String day = scan.next();

		if (day.equals("1") || day.equals("2")||day.equals("3")||day.equals("4")||day.equals("5")) {
			System.out.println("It is a weekday");

		} else if (day.equals("6") || day.equals("7")) {
			System.out.println("It is a weekend");

		} else {
			System.out.println("Invalid day");

		}
	}



	

}
