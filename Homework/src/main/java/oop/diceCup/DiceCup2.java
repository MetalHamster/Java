/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.diceCup;

/**
 *
 * @author Matthias.Flueckiger
 */
public class DiceCup2 {
    private int[] dices = new int[6];
    private String result="";
    Dice dice1 = new Dice();
    
    public void roll(){
        for (int i = 0; i < dices.length; i++) {
            dices[i]=dice1.roll();   
        }
    }
    
    public String toString(){
        for (int i = 0; i < dices.length; i++) {
            result=result + ("Dice "+(i+1)+": "+dices[i]+"\n");
        }
        return result;
                
    }
}
