package oop.diceCup;

public class DiceCupV3 {
	public static void main(String[] args) {
		int rolls = 6;
		DiceV3[] diceList = new DiceV3[rolls];
		int[] diceValues = new int[rolls];

		for (int i = 0; i < diceList.length; i++) {
			diceList[i] = new DiceV3();
			diceValues[i] = diceList[i].rollAndGetValue();
			System.out.println("Dice " + (i + 1) + " rolls: " + diceValues[i]);
		}

	}
}
