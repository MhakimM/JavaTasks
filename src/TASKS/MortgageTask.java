package TASKS;

public class MortgageTask {

	public static void main(String[] args) {

		double rate = 3.5;
		int price = 500000;

		if (rate < 4.5) {
			System.out.println("Time to buy a house");
			if (price > 200000) {
				System.out.println("I'll need a loan");
			} else {
				System.out.println("I can afford to pay cash");
			}
		} else {
			System.out.println("I can't buy now. Rate is too high");
		}
	}
}
