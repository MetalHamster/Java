/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.diceStatistic;

/**
 *
 * @author Matthias.Flueckiger
 */
public class DiceStatistic {

    //Attributes
    private int[] counter = new int[6];
    private int value, min, max;
    private String result;

    DiceStatistic() {
        min = 1;
        max = 6;
        counter[0] = 0;
        counter[1] = 0;
        counter[2] = 0;
        counter[3] = 0;
        counter[4] = 0;
        counter[5] = 0;
    }

    //Methods
    public String roll(int howMany) {
        for (int i = 1; i < howMany; i++) {
            value = (int) (Math.random() * (max - min + 1) + min);
            switch (value) {
                case 1:
                    counter[0] = counter[0] + 1;
                    break;
                case 2:
                    counter[1] = counter[0] + 1;
                    break;
                case 3:
                    counter[2] = counter[0] + 1;
                    break;
                case 4:
                    counter[3] = counter[0] + 1;
                    break;
                case 5:
                    counter[4] = counter[0] + 1;
                    break;
                case 6:
                    counter[5] = counter[0] + 1;
                    break;
            }
        }
        result ="1: "+counter[0] +" times\n"+
                "2: "+counter[1] +" times\n"+
                "3: "+counter[2] +" times\n"+
                "4: "+counter[3] +" times\n"+
                "5: "+counter[4] +" times\n"+
                "6: "+counter[5] +" times\n";
        return result;
    }
}
