package TASKS;

public class Class10HW4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] groceries = { { "tomato", "eggplant", "carrot", "lettuce" },
				{ "apples", "strawberries", "pomegranate", "tangerines" }, { "yogurt", "gouda", "cream cheese" },
				{ "chocolate", "licorice", "sour patch kids" } };

		for (int i = 0; i < groceries.length; i++) {
			for (int j = 0; j < groceries[i].length; j++) {

				String elements = groceries[i][j];
				System.out.print(elements + " ");

			}
			System.out.println();

		}

		System.out.println("-----------------------------------------------");
		{

			for (String[] grocery : groceries) {
				for (String g : grocery) {
					System.out.print(g + " ");

				}
				System.out.println();
			}

		}
	}

}
