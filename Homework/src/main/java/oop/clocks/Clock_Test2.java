/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.clocks;

import java.util.Scanner;

/**
 *
 * @author Matthias.Flueckiger
 */
public class Clock_Test2 {
	public static void main(String[] args) {
		// inializing stuff
		// watch 1
		Clock2 watch1;
		watch1 = new Clock2();
		// watch 2
		Clock2 watch2;
		watch2 = new Clock2();
		// watch 3
		Clock2 watch3;
		watch3 = new Clock2();
		// Scannner
		Scanner in = new Scanner(System.in);

		// program sequence
		// test function tick
		watch1.setTime(9, 0, 0);
		System.out.println("setting time from watch1 to: " + watch1.getTime() + " and doing 1 tick");
		watch1.tick();
		System.out.println("Value of getSec() from watch1: " + watch1.getSec() + "\n");

		// set tickN
		// test tickN
		System.out.print("Type in a number, \"0\" for no value. The input will be read as seconds ");
		watch1.setTickN(in.nextInt());
		watch1.tick();
		System.out.println("time from watch1 after " + watch1.getTickN() + " seconds " + watch1.getTime() + "\n");

		// test time change
		watch2.setTime(23, 59, 58);
		System.out.println("time from watch2 set to: " + watch2.getTime() + " and doing 3 ticks");
		watch2.tick();
		watch2.tick();
		watch2.tick();
		System.out.println("current time from watch2: " + watch2.getTime() + "\n");

		// testing TimeFormat change on watch3
		watch3.setTimeFormat(1);
		System.out.println("watch3 has been manually set to \"12h\" mode");
		watch3.setTime(18, 59, 58);
		System.out.println("Time from watch3 has been set to: " + watch3.getTime() + " and doing 3 ticks");
		watch3.tick();
		watch3.tick();
		watch3.tick();
		System.out.println("current time from watch3: " + watch3.getTime() + "\n");
		in.close();

	}

}
