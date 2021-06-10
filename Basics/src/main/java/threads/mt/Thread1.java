package threads.mt;

public class Thread1 extends Thread{
    @Override
    public void run() {
        super.run();

        for (int i = 10; i > 0; i--) {
            System.out.println("Thread #1: "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Thread #1 is finished");
    }
}
