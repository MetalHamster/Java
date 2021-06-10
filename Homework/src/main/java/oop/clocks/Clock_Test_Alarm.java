package oop.clocks;

public class Clock_Test_Alarm {
	public static void main(String[] args) {
		AlarmClock a1 = new AlarmClock(12, 0, 0);

		a1.setTime(11, 59, 58);

		for (int i = 0; i < 5; i++) {
			a1.tick();
			System.out.println(a1.checkAlarm());
		}

	}
}
