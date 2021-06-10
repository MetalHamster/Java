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
public class Dice {
    private int min =1;
    private int max = 6;
    
    public int roll(){
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
