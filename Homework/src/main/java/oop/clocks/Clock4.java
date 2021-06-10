package oop.clocks;

public class Clock4 {
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
	Clock4() {
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
}
