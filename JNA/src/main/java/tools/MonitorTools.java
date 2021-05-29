package tools;

import java.awt.*;

/**
 * @author Matthias.Flueckiger
 */
public class MonitorTools {
    public static Point getMousePoint(){
        PointerInfo pi = MouseInfo.getPointerInfo();
        return new Point(pi.getLocation());
    }
}
