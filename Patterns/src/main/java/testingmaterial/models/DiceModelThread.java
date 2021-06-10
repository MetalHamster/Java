package testingmaterial.models;

/**
 * @author Matthias.Flueckiger
 */
public class DiceModelThread extends Thread{
        private int value;
        private int min=1;
        private int max=6;
        private String message = "Rolled: ";

        public DiceModelThread(){
        }

        public DiceModelThread(String message){
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
            while(true) {
                roll();
                System.out.println(message + getValue());
            }
        }
    }

