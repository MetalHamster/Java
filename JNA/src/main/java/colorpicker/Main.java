package colorpicker;

/**
 * @author Matthias.Flueckiger
 */
public class Main {
    public static void main(String[] args){
        //Model
        ColorFXPicker colorPicker2 = new ColorFXPicker();
        //Create Viewer
        ObserverColorAWT viewer1 = new ColorAWTViewText();
        //Add viewer
        colorPicker2.addSubscriber(viewer1);
    }
}
