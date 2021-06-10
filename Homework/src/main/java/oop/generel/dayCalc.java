package oop.generel;

import java.util.Scanner;
    
public class dayCalc {
	public static void main(String[] args) {
		int day, month, year, monthNumber, yearNumber, dayNumber;
		int monthYearNumber[];
		Scanner date = new Scanner(System.in);

		// get date
		System.out.print("Type in a day: ");
		day = date.nextInt();
		System.out.print("Type in a month: ");
		month = date.nextInt();
		System.out.print("Type in a year: ");
		year = date.nextInt();
		date.close();

		// get Month and Year number for getDay() function
		monthYearNumber = getMonthAndYear(month, year);         //runs getMonhAndYear and put in a array
		monthNumber = monthYearNumber[0];                       //access array postionn with arrayName[index]
		yearNumber = monthYearNumber[1];

		// calculat the dayNumber
		dayNumber = getDay(monthNumber, yearNumber, day);       //get day number
		System.out.println("Day: " + dayName(dayNumber));       //get name of the day

	}
        
	public static int[] getMonthAndYear(int month, int year) {
		int[] monthAndYear;
		monthAndYear = new int[2];                              //set array with max 2 numbers

		if (month >= 3) {
			monthAndYear[0] = month - 3;
			monthAndYear[1] = year;

		} else {
			monthAndYear[0] = month + 9;
			monthAndYear[1] = year - 1;
		}
		return monthAndYear;
	}

	public static int getDay(int month, int year, int day) {        //some math stuff
		int n = ((year * 1461) / 4) + ((month * 153 + 2) / 5) + (day - ((year / 100 * 3 - 5) / 4));
		n = n % 7;
		return n;
	}

	public static String dayName(int dayNumber) {
		String name;
		switch (dayNumber) {
			case 0:
				name = "Sunday";
				break;
			case 1:
				name = "Monday";
				break;
			case 2:
				name = "Tuesday";
				break;
			case 3:
				name = "Wednesday";
				break;
			case 4:
				name = "Thursday";
				break;
			case 5:
				name = "Friday";
				break;
			case 6:
				name = "Saturday";
				break;
			default:
				name = "Something went wrong, expected number between 0 and 6";
				break;
		}
		return name;
	}
}
