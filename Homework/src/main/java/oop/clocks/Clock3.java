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
public class Clock3 {
	private int sec, min, hour;
	private String currentTime;

	public Clock3() {
		hour = 12;
		min = 30;
		sec = 0;
	}

	public Clock3(int h, int m, int s) {
		hour = h;
		min = m;
		sec = s;
	}

	public String getTime() {
		currentTime = hour + ":" + min + ":" + sec;
		return currentTime;
	}
}
