/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeni.intro1.bab06;
import java.util.Scanner;
/**
 *
 * @author hardadinuraziz
 */
public class latihan2ifelse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai: ");
        int nilai = input.nextInt();
        
        if(nilai >=1 && nilai <=10){
            System.out.println("nilai yang dimasukkan: "+nilai);
        }else{
            System.out.println("Invalid Number");
        }
    }
}
