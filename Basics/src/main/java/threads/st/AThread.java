package threads.st;

public class AThread extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("Im running 1");
        System.out.println("Im running 2");
    }
}
