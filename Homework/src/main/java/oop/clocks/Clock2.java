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
public class Clock2 {
	private int hour = 0;
	private int min = 0;
	private int sec = 0;
	private int tickN = 0;
	private int getTickN = 0;
	private boolean Mode24h = true;

	void setSec(int secManual) {
		sec = secManual;
	}

	void setMin(int minManual) {
		min = minManual;
	}

	void setHour(int hourManual) {
		hour = hourManual;
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

	void setTime(int hourManual, int minManual, int secManual) {
		sec = secManual;
		min = minManual;
		hour = hourManual;
	}

	void setTickN(int settingTickN) {
		tickN = settingTickN;
		tickN = tickN + sec;
	}

	int getTickN() {
		return getTickN;
	}

	void tick() {

		if (tickN > 0) {
			getTickN = tickN;
			for (int i = tickN; i > 0; i = i - 60) {
				if (i < 60) {
					sec = i;
				} else if (i == 60) {
					min = min + 1;
				} else if ((i > 60) && (i < 120)) {
					sec = i - 60;
					min = min + 1;
				} else if (i >= 120) {
					min = min + 1;
				}
				if (min == 60) {
					min = 0;
					hour = hour + 1;
				}
				if (hour == 24) {
					hour = 0;
				}
				if ((Mode24h == false) && (hour > 12)) {
					hour = hour - 12;
				}

			}
			tickN = 0;

		} else {
			sec++;
			if (sec == 60) {
				sec = 0;
				min = min + 1;
			} else if (sec > 60) {
				sec = sec - 60;
				min = min + 1;
			}
			if (min == 60) {
				min = 0;
				hour = hour + 1;
			} else if (min > 60) {
				min = min - 60;
				hour = hour + 1;
			}
			// 24h Mode
			if (hour == 24) {
				hour = 0;
			}
			// 12h Mode
			if ((Mode24h == false) && (hour > 12)) {
				hour = hour - 12;
			}

		}
	}

	String getTime() {
		String currentTime = (hour + ":" + min + ":" + sec);
		return currentTime;
	}

	// time mode
	// mode 0 = 24h
	// mode 1 = 12h
	void setTimeFormat(int mode) {
		if (mode == 0) {
			Mode24h = true;
		} else if (mode == 1) {
			Mode24h = false;
		}

	}
}
