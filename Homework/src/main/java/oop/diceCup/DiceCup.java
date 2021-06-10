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
public class DiceCup {
    Dice dice1 = new Dice();
    Dice dice2 = new Dice();
    Dice dice3 = new Dice();
    Dice dice4 = new Dice();
    Dice dice5 = new Dice();
    Dice dice6 = new Dice();
    
    private int val1, val2, val3, val4, val5, val6;
    
    
    
    public void roll(){
        val1=dice1.roll();
        val2=dice2.roll();
        val3=dice3.roll();
        val4=dice4.roll();
        val5=dice5.roll();
        val6=dice6.roll();
        
    }
    public String toString(){
        return 
                "dice1: "+val1
                +"\ndice2: "+val2
                +"\ndice3: "+val3
                +"\ndice4: "+val4
                +"\ndice5: "+val5
                +"\ndice6: "+val6;
    }
}
