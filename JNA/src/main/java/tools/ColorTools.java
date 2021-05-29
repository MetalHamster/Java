package tools;

import java.awt.*;

/**
 * @author Matthias.Flueckiger
 */
public class ColorTools {
    public static String getColorHex() throws AWTException {
        Robot robot = new Robot();
        PointerInfo pi = MouseInfo.getPointerInfo();
        Point mousePoint = new Point(pi.getLocation());
        Color color = robot.getPixelColor(mousePoint.x, mousePoint.y);
        return "#" + Integer.toHexString(color.getRGB()).substring(2);
    }

    public static Color getColorAWT() throws AWTException {
        Robot robot = new Robot();
        PointerInfo pi = MouseInfo.getPointerInfo();
        Point mousePoint = new Point(pi.getLocation());
        return robot.getPixelColor(mousePoint.x, mousePoint.y);
    }

    public static String convertColorToHex(Color colorAWT){
        return "#" + Integer.toHexString(colorAWT.getRGB()).substring(2);
    }

    public static javafx.scene.paint.Color getColorFX() throws AWTException {
        Robot robot = new Robot();
        PointerInfo pi = MouseInfo.getPointerInfo();
        Point mousePoint = new Point(pi.getLocation());
        Color colorAWT = robot.getPixelColor(mousePoint.x, mousePoint.y);
        return javafx.scene.paint.Color.rgb(colorAWT.getRed(),colorAWT.getGreen(), colorAWT.getBlue());
    }

    public static String convertColorToHex(javafx.scene.paint.Color colorFX){
        return "#" + colorFX.toString().substring(2,8);
    }

    public static void main(String[] args) throws AWTException {
        System.out.println(ColorTools.getColorHex());
        System.out.println(ColorTools.getColorFX());
        System.out.println(ColorTools.getColorAWT());
        System.out.println(ColorTools.convertColorToHex(ColorTools.getColorAWT()));
        System.out.println(ColorTools.convertColorToHex(ColorTools.getColorFX()));

    }


}
