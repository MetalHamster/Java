/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.generel;

import java.util.Scanner;

/**
 *
 * @author Matthias.Flueckiger
 */
public class GuessTheNumber {

	public static void main(String[] args) {
		int myGuess;
		boolean repeat;
		int counter = 0;
		Scanner input = new Scanner(System.in);
		int randomNumInt = (int) (Math.random() * 101); // outher () are Important!!

		do {
			System.out.println("Guess a number between 0 and 100");
			do {
				myGuess = input.nextInt();
				if (myGuess < randomNumInt) {
					System.out.println("too small");
					counter++;
				} else if (myGuess > randomNumInt) {
					System.out.println("too big");
					counter++;
				}

			} while (myGuess != randomNumInt);
			counter++;
			System.out.println("You got it! Its: " + myGuess + "\n You got it in: " + counter + " tries");
			counter = 0;
			System.out.println("Do you want to play again?");
			repeat = input.nextBoolean();
		} while (repeat == true);
		System.out.println("Thanks for playing");
		input.close();
	}
}
