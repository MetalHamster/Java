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
public class Rectanlge_Test {
	public static void main(String[] args) {
		int area;

		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(3, 3, 18, 4); // (width,length,posX,posY)

		rect1.setPostion(3, 5); // (posX, posY)
		rect1.setArea(10, 15); // (width, length)
		System.out.println("Parameters of rectangle: " + rect1.getAreaParameters());
		System.out.println(rect1.getPostion());
		area = rect1.getArea();
		System.out.println("Area: " + area);
		rect1.printArea();
		System.out.println("\n");
		rect2.printArea();

		System.out.println("The other rect is withing rect1 one: " + rect2.withinOtherRect(rect1.getRectAttributes()));

	}
}
