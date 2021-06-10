package threads.strun.dice;

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
            System.out.print("Rolled: "+n);
            try {
                System.out.println(rollAndGetValue());
                Thread.sleep(milliseconds);
            } catch (InterruptedException e) {
            }
        }
    }


}
