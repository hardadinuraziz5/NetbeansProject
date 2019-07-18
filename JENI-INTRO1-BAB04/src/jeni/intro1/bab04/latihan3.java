/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeni.intro1.bab04;

/**
 *
 * @author hardadinuraziz
 */
public class latihan3 {
    public static void main(String[] args){
        int number1 = 10, number2 = 23, number3 = 5;
        int max;
        if(number1 > number2 && number1 > number3){
            max = number1;
        }else if(number2 > number1 && number2 > number3){
            max = number2;
        }else {
            max = number3;
        }
        
        System.out.println("number 1 = "+number1);
        System.out.println("number 2 = "+number2);
        System.out.println("number 3 = "+number3);
        System.out.println("Nilai tertingginya adalah angka = "+max);
    }
}
