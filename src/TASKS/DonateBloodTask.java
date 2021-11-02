package TASKS;

public class DonateBloodTask {

	public static void main(String[] args) {

		int age = 40;
		int wt = 125;

		if (age > 18) {
			if (wt >= 110) {
				System.out.println("You can donate blood");
			} else {
				System.out.println("You don't meet requirements to donate blood");
			}

		} else {
			System.out.println("You don't meet requirements to donate blood");

		}
	}

}
