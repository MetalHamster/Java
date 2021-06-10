package syntax.enums;

public class Main {
    public static void main(String[] args) {
        Difficulty dif = Difficulty.EASY;
        Weekdays weekdays = Weekdays.MONDAY;
        switch (dif){
            case EASY:
                System.out.println("set on: "+dif);
                break;
            case MEDIUM:
            case HARD:
        }

        for (Weekdays day : Weekdays.values()) {
            System.out.println(day);
        }


    }
}
