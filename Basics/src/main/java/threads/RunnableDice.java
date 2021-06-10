package threads;

public class RunnableDice implements Runnable {
    private int min;
    private int max;
    private int milliseconds;

    public RunnableDice() {
        min = 1;
        max = 6;
        milliseconds=1000;
    }

    public RunnableDice(int milliseconds){
        min = 1;
        max = 6;
        this.milliseconds = milliseconds;
    }


    public int rollAndGetValue() {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    @Override
    public void run() {
        String n = Thread.currentThread().getName();
        for (int i = 1; i <= 10; i++) {
            System.out.print(n);
            try {
                System.out.println(rollAndGetValue());
                Thread.sleep(milliseconds);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) {
        RunnableDice r1 = new RunnableDice(500);
        RunnableDice r2 = new RunnableDice();
        Thread t1 = new Thread(r1, "Rolled: ");
        //Thread t2 = new Thread(r2, " you");
        t1.start();
        //t2.start();
    }
}
