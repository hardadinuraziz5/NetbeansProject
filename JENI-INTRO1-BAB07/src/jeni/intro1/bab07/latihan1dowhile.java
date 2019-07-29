/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeni.intro1.bab07;

/**
 *
 * @author hardadinuraziz
 */
public class latihan1dowhile {
    public static void main(String[] args){
        String []days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        do{
            System.out.println(days[0]);
            System.out.println(days[1]);
            System.out.println(days[2]);
            System.out.println(days[3]);
            System.out.println(days[4]);
            System.out.println(days[5]);
            System.out.println(days[6]);
            break;
        }while(days == days);
    }
}
