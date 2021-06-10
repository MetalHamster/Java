package oop.radio;

public class Radio {
	private String onOff = "";
	private boolean state = false;
	private int channel = 0;
	private double freq = 0.0;
	private double[] channelList = new double[] { 73.5, 64.5, 88.9, 69.7, 102.9 };

	public boolean getState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public void listChannels() {
		for (int i = 0; i < channelList.length; i++) {
			System.out.println(i + 1 + ": " + channelList[i]);
		}
	}

	public void setChannel(int channel) {
		this.channel = channel;
		freq = channelList[this.channel-1];
	}

	public void setFreq(double freq) {
		this.freq = freq;

	}

	public void saveChannel() {
		channelList[channel] = freq;

	}

	public void displayTxt() {
		if (state) {
			onOff = "on";
		} else {
			onOff = "off";
		}

		System.out.println("----------Radio----------");
		System.out.println("Status: " + onOff + " / Channel: " + channel + " / Frequency: " + freq + "Mhz");
		System.out.println("-------------------------");

	}

}
