package testingmaterial.models;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author Matthias.Flueckiger
 */
public class DiceModelScheduler implements Runnable {
        private int value;
        private int min;
        private int max;
        private String message = "Rolled: ";

        public DiceModelScheduler(){
            //default
            min = 1;
            max = 6;
            roll();
            ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
            scheduler.scheduleAtFixedRate(this, 0, 1, TimeUnit.MILLISECONDS);
        }

        public DiceModelScheduler(int delayMilliSeconds, int intervalMilliSeconds){
            min = 1;
            max = 6;
            roll();
            //individual delay and interval
            ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
            scheduler.scheduleAtFixedRate(this, delayMilliSeconds, intervalMilliSeconds, TimeUnit.MILLISECONDS);
        }

        public void roll() {
            value = (int) (Math.random() * (max - min + 1) + min);
        }

        public int getValue() {
            return value;
        }

        public void setMessage(String message){
            this.message = message;
        }

        @Override
        public void run() {
            while(true) {
                roll();
                System.out.println(message + getValue());
            }
        }
    }

