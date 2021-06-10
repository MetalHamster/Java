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
public class Dice_Test {
	public static void main(String[] args) {
		// generate Dice's
		// [ClassName] [ObjectName] =[new][Constructer]
		Dice dice1 = new Dice();
		/*
		 * Dice dice2 = new Dice(); Dice dice3 = new Dice(); Dice dice4 = new
		 * Dice(6,12); //(min , max) Dice dice5 = new Dice();
		 */
		int value;

		// programm sequence
		/*
		 * dice1.roll(); System.out.println("Dice1 rolls: "+dice1.getValue()
		 * +" within the range of 1<= & <=6"); dice2.roll();
		 * System.out.println("Dice2 rolls: "+dice2.getValue()
		 * +" within the range of 1<= & <=6"); dice3.roll();
		 * System.out.println("Dice3 rolls: "+dice3.getValue()
		 * +" within the range of 1<= & <=6"); dice4.roll();
		 * System.out.println("Dice4 rolls: "+dice4.getValue()
		 * +" within the range of 6<= & <=12"); dice5.setMinAndMax(1, 12); dice5.roll();
		 * System.out.println("Dice5 rolls: "+dice5.getValue()
		 * +" within the range of 1<= & <=12");
		 */
		value = dice1.rollAndGetValue();
		System.out.println(value);

		System.out.println(dice1.rollAndGetValue());
	}

}
