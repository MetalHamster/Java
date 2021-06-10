package colorpicker;

import java.awt.*;


/**
 * @author Matthias.Flueckiger
 */
public class ColorAWTViewText implements ObserverColorAWT {
    @Override
    public void update(Color color) {
        System.out.println("Color text view: "+color.toString());
    }
}
