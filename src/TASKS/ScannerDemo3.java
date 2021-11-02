package TASKS;

import java.util.Scanner;

public class ScannerDemo3 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Pls enter sentence");
		
		String entireLine=in.nextLine();//for more than one word 
		System.out.println(entireLine);
		

	}

}
