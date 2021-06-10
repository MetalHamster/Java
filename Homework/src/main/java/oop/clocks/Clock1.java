package oop.clocks;

/**
 *
 * @author Matthias.Flueckiger
 */
public class Clock1 {
	int hour = 0;
	int min = 0;
	int sec = 0;

	void tick() {
		sec = sec + 1;
		if (sec == 60) {
			sec = 0;
			min = min + 1;
		}
		if (min == 60) {
			min = 0;
			hour = hour + 1;

		}
		if (hour == 24) {
			hour = 0;
		}

	}

	void printTime() {
		System.out.println("Aktuelle Uhrzeit = " + hour + ":" + min + ":" + sec);
	}
}
