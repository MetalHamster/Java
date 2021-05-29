import java.awt.*;

/**
 * @author Matthias.Flueckiger
 */
public class RobotAWTClass {
    public static Color getPixelColor(Point pointAWT) throws AWTException {
        Robot robot = new Robot();
        return robot.getPixelColor(pointAWT.x, pointAWT.y);
    }
    public static void main(String[] args) {

    }
}
