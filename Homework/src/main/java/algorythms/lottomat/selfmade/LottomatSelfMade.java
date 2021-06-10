package algorythms.lottomat.selfmade;

import java.util.ArrayList;
import java.util.Scanner;

public class LottomatSelfMade {
    private int howManyBalls;
    ArrayList<String> numberList = new ArrayList<>();
    ArrayList<String> lottoNumbers = new ArrayList<>();

    public LottomatSelfMade(int balls){
        howManyBalls = balls;
    }

    public ArrayList getNumberList() {
        //generate array with unique numbers
        for (int i = 0; i < howManyBalls; i++) {
            //generate numbers from 1 to "howManyBalls" in this case to 20
            String random = String.valueOf((int) (Math.random() * (howManyBalls - 1 + 1) + 1));
            //if not unique
            if (numberList.contains(random)){
                i--;
            }
            //if unique
            else{
                numberList.add(random);
            }
        }
        //return whole list
        return numberList;
    }

    public String getNextRandomBall() {
        //get random number of current list size
        //IMPORTANT: (howManyBalls - 1 + 1) + 1) to (numberList.size() - 1) + 1) because index starts with 0
        String random = String.valueOf((int) (Math.random() * (numberList.size() - 1) + 1));
        //get number of numberList using random as index
        String randomBall = (String) numberList.get(Integer.parseInt(random));
        //remove it from list (so it cant get taken twice)
        numberList.remove(randomBall);
        //add the number to the lottonumbers list.
        lottoNumbers.add(randomBall);
        return randomBall;
    }

    public ArrayList getLottoNumbers() {
        return lottoNumbers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LottomatSelfMade lottomatSelfMade = new LottomatSelfMade(20);

        System.out.println("----- Lottmat -----");
        //show generated array
        System.out.println(lottomatSelfMade.getNumberList());

        //get 6 numbers from numberList array
        for (int i = 0; i < 6; i++) {
            System.out.print("Return for next number");
            in.nextLine();
            System.out.println(lottomatSelfMade.getNextRandomBall());
            System.out.println(lottomatSelfMade.numberList.toString());
        }

        //display lotto numbers
        System.out.print("Lotto Numbers: ");
        System.out.println(lottomatSelfMade.getLottoNumbers());
    }




}
