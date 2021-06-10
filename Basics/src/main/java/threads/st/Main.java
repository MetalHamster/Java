package threads.st;

public class Main {
    public static void main(String[] args) {
        AThread thread1 = new AThread();

        thread1.setName("1nd Thread");
        thread1.setPriority(1);
        thread1.start();


    }
}
