import com.sun.jna.Native;

public class SimpleDLL {
    static {
        Native.register("simpleDll.dll");
    }
    public static native String getVersion();

    public static native float multiply(float num1, float num2);

    public static void main(String[] args) {
        System.out.println(SimpleDLL.getVersion());
        System.out.println(SimpleDLL.multiply(2,3));
    }

}
