package oop.radio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RadioControl {
	Scanner in = new Scanner(System.in);
	Radio radio = new Radio();
	public boolean exError;
	public int input;

	public RadioControl() {
		while (true) {
			int choice = menu();
			switch (choice) {
				case 1: // changeState
					radio.setState(!radio.getState());
					break;
				case 2: // List Channels
					radio.listChannels();
					break;
				case 3: // Set Channels
					System.out.println("Which Channel:");

					try {
						// radio.setChannel(Integer.parseInt(in.next()));
						radio.setChannel(Integer.parseInt(in.next()));
					} catch (ArrayIndexOutOfBoundsException ex) {
						System.out.println("Array limit exceeded");
						System.out.println("Type in a Number between 1-5");
						radio.setChannel((Integer.parseInt(in.next())));
						in.next();
					} catch (Exception ex) {
						System.out.println("Something went wrong");
						System.out.println("Type in a Number between 1-5");
						radio.setChannel((Integer.parseInt(in.next())));
						in.next();
					}
					break;

				case 4: // Set Frequence
					System.out.println("Which Freq:");

					try {
						radio.setFreq(in.nextDouble());
					} catch (InputMismatchException ex) {
						System.out.println("Input must be a number");
						radio.setFreq(in.nextDouble());

					} catch (Exception ex) {
						System.out.println("Something went wrong");
						System.out.println("Try Again");
						radio.setFreq(in.nextDouble());

					}

					break;
				case 5: // Save actual Freq
					radio.saveChannel(); // to channel
			}
		}
	}

	private int menu() {
		int pos = 1;

		radio.displayTxt();

		System.out.println("[" + pos++ + "]  Change Status");
		System.out.println("[" + pos++ + "]  ListChannels");
		System.out.println("[" + pos++ + "]  SetChannel");
		System.out.println("[" + pos++ + "]  SetFrequency");
		System.out.println("[" + pos++ + "]  SaveChannel");
		System.out.println();
		System.out.print("Your Choice: ");
		return in.nextInt();
	}

	public static void main(String[] args) {
		new RadioControl();
	}
}