package oop.diceCup;

public class DiceV3 {
	private final int MIN = 1;
	private final int MAX = 6;

	public int rollAndGetValue() {
		return (int) (Math.random() * (MAX - MIN + 1) + MIN);
	}
}