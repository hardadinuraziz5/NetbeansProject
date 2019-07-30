/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeni.intro1.bab08;

/**
 *
 * @author hardadinuraziz
 */
public class latihan2 {
    public static void main(String[] args){
        int sum1 = Integer.parseInt(args[2]);
        int sum2 = Integer.parseInt(args[3]);
        int sum = sum1+sum2;
        
        int diff1 = Integer.parseInt(args[2]);
        int diff2 = Integer.parseInt(args[3]);
        int diff = diff1-diff2;
        
        int product1 = Integer.parseInt(args[2]);
        int product2 = Integer.parseInt(args[3]);
        int product = product1*product2;
        
        int quo1 = Integer.parseInt(args[2]);
        int quo2 = Integer.parseInt(args[3]);
        int quo = quo1/quo2;
        
        System.out.println("sum = "+sum);
        System.out.println("difference = "+diff);
        System.out.println("product = "+product);
        System.out.println("quotient = "+quo);
    }
}
