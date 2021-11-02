package TASKS;

public class DiplomaTask {

	public static void main(String[] args) {

		boolean diploma = true;
		double GPA = 3.8;

		if (diploma) {
			System.out.println("Congratulations");

			if (GPA >= 3.5) {
				System.out.println("You are eligible for scholarship");
			} else {
				System.out.println("You should've studied harder");

			}
		} else {
			System.out.println("You should get a degree");

		}
	}

}
