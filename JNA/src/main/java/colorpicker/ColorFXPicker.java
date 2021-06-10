package colorpicker;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author Matthias.Flueckiger
 */
public class ColorFXPicker implements Runnable, ObservableColorAWT {
    private Robot robot;
    private PointerInfo pointerInfo;
    private Point mousePoint;
    private Color color;
    private List<ObserverColorAWT> list = new ArrayList<>();

    public ColorFXPicker() {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(this, 0, 1, TimeUnit.SECONDS);
    }

    public void colorPicker2() throws AWTException {
        Robot robot = new Robot();
        PointerInfo pointerInfo;
        Point mousePoint;
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection stringSelection;

        //Return mouse position and device(Screen) and saves it into the pointerInfo object
        pointerInfo = MouseInfo.getPointerInfo();

        //Return on which Screen/Graphical devices the mouse is.
        //System.out.println(pointerInfo.getDevice());

        //Save XY Coordinate into a Point object
        mousePoint = new Point(pointerInfo.getLocation());
        //Prints XY Coordinate to console
        //System.out.println(mousePoint);

        //Get Pixel Color with XY Coordinate
        color = robot.getPixelColor(mousePoint.x, mousePoint.y);

        //Print Color in RGB format
        //System.out.println(color.toString());

        //Print Color in HEX format ex. 1
        String colorHex = String.format("#%06X", color.getRGB());
        //System.out.println(colorHex);

        String colorHex2="#"+Integer.toHexString(color.getRGB()).substring(2);
        System.out.println(colorHex2);

        //Copy to Clipboard
        stringSelection = new StringSelection(colorHex2);
        clipboard.setContents(stringSelection, stringSelection);
    }

    @Override
    public void run() {
        try {
            colorPicker2();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        notifySubscribers();

    }

    @Override
    public void addSubscriber(ObserverColorAWT observerColorAWT) {
        list.add(observerColorAWT);
    }

    @Override
    public void removeSubscriber(ObserverColorAWT observerColorAWT) {
        list.remove(observerColorAWT);
    }

    @Override
    public void notifySubscribers() {
        list.forEach(list -> list.update(color));
    }

    public static void main(String[] args) {
        ColorFXPicker c = new ColorFXPicker();

    }
}
