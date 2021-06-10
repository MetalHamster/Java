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
public class DiceCup_Test {
    public static void main(String[] args) {
        DiceCup2 diceCup1 = new DiceCup2();
        
        diceCup1.roll();
        System.out.println(diceCup1.toString());
    }
}
