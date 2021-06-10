/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.rectangle;

/**
 *
 * @author Matthias.Flueckiger
 */
public class Rectangle {

	// attributes
	private int length, width, posX, posY, length2, width2, posX2, posY2, area;
	private boolean withinX, withinY, withinRect;

	// Constructers
	public Rectangle() {
	}

	public Rectangle(int width, int length, int posX, int posY) {
		this.width = width;
		this.length = length;
		this.posX = posX;
		this.posY = posY;
	}

	// Methods
	public void setPostion(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}

	public String getPostion() {
		String position = "X-Coordinate: " + posX + "\nY-Coordinate: " + posY;
		return position;
	}

	public void setArea(int width, int length) {
		this.width = width;
		this.length = length;
		area = width * length;

	}

	public int getArea() {
		return area;

	}

	public String getAreaParameters() {
		String parameters = "\nlength: " + length + "\nwidth: " + width;
		return parameters;
	}

	public void printArea() {

		// go to Y-Postion
		for (int i = posY; i > 0; i--) {
			// length + posY
			for (int column = 1; column <= (length + posX); column++) {
				System.out.print("O");
			}
			System.out.println("");
		}

		// draw rectangle
		for (int row = 1; row <= width; row++) {
			// go to X-Postion
			for (int i = posX; i > 0; i--) {
				System.out.print("O");
			}
			// draw length
			for (int column = 1; column <= length; column++) {
				System.out.print("#");
			}
			System.out.println("");
		}

	}

	public int[] getRectAttributes() {
		int[] rectAttributes = new int[4];
		rectAttributes[0] = posX;
		rectAttributes[1] = posY;
		rectAttributes[2] = length;
		rectAttributes[3] = width;

		return rectAttributes;
	}

	public boolean withinOtherRect(int[] rectAttributes) {
		posX2 = rectAttributes[0];
		posY2 = rectAttributes[1];
		length2 = rectAttributes[2];
		width2 = rectAttributes[3];

		if ((posX2 > posX) && //
				(posX2 < (posX + length)) && //
				((posX2 + length2) > posX) && //
				((posX2 + length2) > (posX + length))) {

			withinX = true;
		}

		if ((posY2 > posY) && //
				(posY2 < (posY + width)) && //
				((posY2 + width2) > posY) && //
				((posY2 + width2) > (posY + width))) {
			withinY = true;
		}

		if ((withinX == true) && (withinY == true)) {
			withinRect = true;
		} else {
			withinRect = false;
		}

		return withinRect;
	}
}