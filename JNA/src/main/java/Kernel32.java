import com.sun.jna.Native;
/**
 * @author Matthias.Flueckiger
 */

public class Kernel32 {
    static {
        Native.register("kernel32.dll");
    }
    public static native boolean Beep(int freq, int dur);

    public static void main(String[] args) {
        Kernel32.Beep(600,2000);
    }
}
