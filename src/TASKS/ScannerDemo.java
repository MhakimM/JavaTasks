package TASKS;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		String str="Abc";
		str="zyx";
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("please enter your name");
		
		String name=scan.next(); //it will capture String value from console
		
		System.out.println("Hello "+name);
		
		System.out.println("Please enter your age");
		int age=scan.nextInt();
		
		System.out.println(name +" you are "+age+" years old");
		
		
		

	}

}
