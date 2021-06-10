package threads.strun;

public class Main {
    /*
    With a runnable you can still inherit from other classes
     */
    public static void main(String[] args) {
        MyRunnable runnable1 = new MyRunnable();
        Thread thread = new Thread(runnable1);
        thread.start();
    }
}
