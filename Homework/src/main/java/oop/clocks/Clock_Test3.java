/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.clocks;

/**
 *
 * @author Matthias.Flueckiger
 */
public class Clock_Test3 {
	public static void main(String[] args) {
		Clock3 c1 = new Clock3();
		Clock3 c2 = new Clock3(12, 7, 0);
		System.out.println(c1.getTime());
		System.out.println(c2.getTime());
	}
}
