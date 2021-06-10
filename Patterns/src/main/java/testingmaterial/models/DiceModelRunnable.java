package testingmaterial.models;

/**
 * @author Matthias.Flueckiger
 */
public class DiceModelRunnable implements Runnable {
        private int value;
        private int min=1;
        private int max=6;
        private String message = "Rolled: ";

        public DiceModelRunnable(){
        }

        public DiceModelRunnable(String message){
            this.message = message;
        }

        public void roll() {
            value = (int) (Math.random() * (max - min + 1) + min);
        }

        public int getValue() {
            return value;
        }

        @Override
        public void run() {
            roll();
            System.out.println(message+getValue());
        }
    }

