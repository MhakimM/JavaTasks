package TASKS;

public class TaskSumofEvenOdd {

	public static void main(String[] args) {
		/*
		 * Calculate sum of all even and all odd numbers from range 1 to 100
		 */
		int sumEven = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sumEven += i;
			}
		}
		System.out.println(sumEven);

		System.out.println("---------------------");

		int sumOdd = 0;

		for (int h = 1; h <= 100; h++) {
			if (h % 2 == 1) {
				sumOdd += h;
			}
		}
		System.out.println(sumOdd);

	}
}
