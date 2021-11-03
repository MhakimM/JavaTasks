package TASKS;

public class Class10HW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] cars = { { "American", "German", "Korean", "Italian" }, { "Chevy", "BMW", "Hyundai", "Lambo" }

		};

		System.out.println();
		System.out.println("Retrieving cars using for loop");
		for (int f = 0; f < cars.length; f++) {
			for (int c = 0; c < cars[f].length; c++) {
				String element = cars[f][c];
				System.out.print(element + " ");
			}
			System.out.println();
		}
		System.out.println("Retrieving cars using enhanced");
		for (String[] car : cars) {
			for (String c : car) {
				System.out.print(c + "  ");
			}
		}
	}

}
