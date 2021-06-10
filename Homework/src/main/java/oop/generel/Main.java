package oop.generel;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// create Scanner with its name "input"
		Scanner input = new Scanner(System.in);
		System.out.println("Type in a number");
		int num1 = input.nextInt();
		System.out.println("Type in another number");
		int num2 = input.nextInt();

		// closes Scanner otherwise it will waste resources
		// ! after you close it you can't use it anymore
		input.close();

		if (num1 > num2) {
			System.out.println("The bigger number is: " + num1);
		} else if (num2 > num1) {
			System.out.println("The bigger number is: " + num2);
		} else if (num1 == num2) {
			System.out.println("Equal numbers");
		}

	}

}
