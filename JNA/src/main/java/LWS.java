import com.sun.jna.Native;

public class LWS {
    static {
        Native.register("User32.dll");
    }

    public static native boolean LockWorkStation();

    public static void main(String[] args) {
        LWS.LockWorkStation();
    }
}
