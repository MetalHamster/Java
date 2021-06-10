package algorythms;

import java.util.concurrent.*;

public class DiceModelAlain implements Runnable
{
  private int value;
  private int min = 1;
  private int max = 6;

  DiceModelAlain(){
    //Interval every
    ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    scheduler.scheduleAtFixedRate(this, 0, 1, TimeUnit.SECONDS);
  }

  DiceModelAlain(int delay, int interval){
    //individual delay and interval
    ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    scheduler.scheduleAtFixedRate(this, delay, interval, TimeUnit.SECONDS);
  }

  public void roll()
  {
    value = (int) (Math.random() * (max - min + 1) + min);
  }

  public int getValue()
  {
    return value;
  }

  @Override
  public void run()
  {
    roll();
    System.out.print("Rolled: "+getValue()+"\n");
  }

  public static void main(String[] args)
  {
    DiceModelAlain diceModelAlain = new DiceModelAlain();
    DiceModelAlain diceModelAlain2 = new DiceModelAlain(0,3);

  }
}