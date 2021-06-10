package oop.clocks;

/**
 *
 * @author Matthias.Flueckiger
 */
public class Clock_Test1 {
	public static void main(String[] args) {
		// create Object
		Clock1 c1 = new Clock1();

		// testing
		for (int i = 0; i < 3600; i++) {
			c1.tick();
			c1.printTime();
		}

	}
}
