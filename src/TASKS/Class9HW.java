package TASKS;

public class Class9HW {

	public static void main(String[] args) {
		String cars[] = new String[6];
		cars[0] = "Chevy";
		cars[1] = "Ford";
		cars[2] = "Toyota";
		cars[3] = "Honda";
		cars[4] = "Mercedes";
		cars[5] = "Porsche";

		for (String n : cars) {
			System.out.println(n);
		}

		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

	}

}
