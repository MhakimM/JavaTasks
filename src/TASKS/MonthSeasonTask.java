package TASKS;

import java.util.Scanner;

public class MonthSeasonTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String season = null;

		System.out.println("Please enter your birth month");
		String month = input.nextLine();

		if (month.equals("December") || month.equals("January") || month.equals("February")) {
			season = "Winter";
		} else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			season = "Spring";
		} else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			season = "Summer";
		} else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			season = "Autumn";
		}

		System.out.println("You were born in " + season);
	}

}
