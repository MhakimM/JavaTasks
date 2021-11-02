package TASKS;

import java.util.Scanner;

public class CurrentTimeTask {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter current time");
		int time = in.nextInt();

		if (time >= 1 && time <= 11) {
			System.out.println("morning");

		} else if (time >= 12 && time <= 15) {
			System.out.println("afternoon");

		} else if (time >= 16 && time <= 20) {
			System.out.println("evening");

		} else if (time >= 21 && time <= 24) {
			System.out.println("night");

		} else {
			System.out.println("invalid time");

			System.out.println("--------------------------------------------------");

			String timeOfDay=null;

			if (time >= 1 && time <= 11) {
				timeOfDay = "morning";

			} else if (time >= 12 && time <= 15) {
				timeOfDay = "afternoon";
			} else if (time >= 16 && time <= 20) {
				timeOfDay = "evening";
			

				System.out.println("right now is " + timeOfDay);

			}

		}

	}

}
