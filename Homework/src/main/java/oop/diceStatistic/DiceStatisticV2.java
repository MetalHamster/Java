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
public class DiceStatisticV2 {

    //Attributes
    private int[] counter  = new int[6];
    private int value, min, max;
    private String result="";

    DiceStatisticV2() {
        min = 1;
        max = 6;
    }

    //Methods
    public String roll(int howMany) {
        for (int i = 1; i <= howMany; i++) {
            value = (int) (Math.random() * (max - min + 1) + min);
            counter[value-1] = counter[value-1] + 1;

        }
        for (int i = 0; i < counter.length; i++) {
            result=result + (i+1+": "+counter[i]+" times\n");
        }
        return result;
    }

}
