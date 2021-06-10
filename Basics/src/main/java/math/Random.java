package math;

public class Random {
    public static void main(String[] args) {
        final int MIN=1;
        final int MAX=6;

        //----------Prints between 1 and 6----------//
        for (int i=0; i<100; i++) {
            int random = (int) (Math.random() * (MAX - MIN + 1) + MIN);
            System.out.println("pos"+i+":"+random);
        }

        //----------Prints between 1 and 5 (One lower than MAX)----------//
        for (int i = 0; i < 100; i++) {
            int random = (int) (Math.random() * (MAX - MIN) + MIN);
            System.out.println("pos"+i+": "+random);
        }
    }
}
