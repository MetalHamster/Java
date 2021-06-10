import com.sun.jna.Native;

public class CDoubles {
    static {
        Native.register("doubles.dll");
    }

    public static native double getDouble(Double d[], int length);

    public static void main(String[] args) {
        Double[] d = new Double[]{2.3,2.5,2.6};
        System.out.println(CDoubles.getDouble(d,3));
    }
}
