package TASKS;

public class LoopsHW {

	public static void main(String[] args) {

		/* Print numbers from 1 to 100 in 1 line with space */

		int q = 1;
		while (q <= 100) {
			System.out.print(q + " ");
			q++;
		}

		System.out.println();

		/* Print numbers from 100 to 1 */
		{
			int r = 100;
			while (r >= 1) {
				System.out.print(r + " ");
				r--;
			}

			System.out.println();

			/* Print even numbers from 20 to 100 */

			int y = 20;
			while (y <= 100) {

				if (y % 2 == 0) {
					System.out.print(y + " ");
				}y++;
			}

			System.out.println();
		}

		/* Print only odd numbers from 100 to 1 */
		{
			int z = 100;
			while (z > 0) {

				if (z % 2 != 0) {
					System.out.print(z + " ");
				}z--;
			}

		}
	}

}
