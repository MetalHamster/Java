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
public class DiceStatistic_Test {
    public static void main(String[] args) {
        DiceStatisticV2 diceV2= new DiceStatisticV2();
        
        System.out.println("\n"+diceV2.roll(1000));
        
    }
}
