/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.dice;

/**
 *
 * @author Matthias.Flueckiger
 */
public class Dice {
	// Class Attributes
	private static int countOfObj = 0;

	// Class Methods
	public static int getCountOfObj() {
		return countOfObj;
	}

	// attributes
	private int min;
	private int max;

	// constructers
	public Dice() {
		countOfObj++;
		min = 1;
		max = 6;
	}

	public Dice(int min, int max) {
		countOfObj++;
		this.min = min;
		this.max = max;
	}

	// methods
	public int rollAndGetValue() {
		// value gets an int that is equal or greater than min and less or equal to max
		return (int) (Math.random() * (max - min + 1) + min);

	}

	// set roll range of the Dice
	public void setMinAndMax(int min, int max) {
		this.min = min;
		this.max = max;
	}
}
