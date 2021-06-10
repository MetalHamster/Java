package oop.clocks;

public class AlarmClock extends Clock2 {
	private int aHour, aMin, aSec;
	private boolean alarm;

	AlarmClock(int aHour, int aMin, int aSec) {
		this.aHour = aHour;
		this.aMin = aMin;
		this.aSec = aSec;
	}

	public void setAlarmClock(int aHour, int aMin, int aSec) {
		this.aHour = aHour;
		this.aMin = aMin;
		this.aSec = aSec;
	}

	public boolean checkAlarm() {
		alarm = getHour() == aHour && getMin() == aMin && getSec() == aSec;
		return alarm;
	}
}
