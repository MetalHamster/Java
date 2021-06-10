package oop;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Clock extends Frame implements WindowListener {
	// Class Attributes
	private static int countOfObj = 0;

	// Class Methods
	public static int getCountOfObj() {
		return countOfObj;
	}

	// Attributes
	private int hour = 0;
	private int min = 0;
	private int sec = 0;

	// Constructer
	Clock() {
		countOfObj++;
	}

	// Methods
	void setSec(int sec) {
		this.sec = sec;
	}

	void setMin(int min) {
		this.min = min;
	}

	void setHour(int hour) {
		this.hour = hour;
	}

	int getSec() {
		return sec;
	}

	int getMin() {
		return min;
	}

	int getHour() {
		return hour;
	}

	void setTime(int hour, int min, int sec) {
		this.sec = sec;
		this.min = min;
		this.hour = hour;
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println(1);
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println(2);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println(3);
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println(4);
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println(5);
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println(6);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println(7);
	}
}
