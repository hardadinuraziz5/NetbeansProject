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
public class latihan2switch {
    public static void main(String[] args){
        Scanner baca = new Scanner(System.in);
        System.out.print("Masukkan Angka Anda: ");
        int angka = baca.nextInt();
        
        switch(angka){
                case 1:
                    System.out.println("Angka Anda "+angka);
                    break;
                case 2:
                    System.out.println("Angka Anda "+angka);
                    break;
                case 3:
                    System.out.println("Angka Anda "+angka);
                    break;
                case 4:
                    System.out.println("Angka Anda "+angka);
                    break;
                case 5:
                    System.out.println("Angka Anda "+angka);
                    break;
                case 6:
                    System.out.println("Angka Anda "+angka);
                    break;
                case 7:
                    System.out.println("Angka Anda "+angka);
                    break;
                case 8:
                    System.out.println("Angka Anda "+angka);
                    break;
                case 9:
                    System.out.println("Angka Anda "+angka);
                    break;
                case 10:
                    System.out.println("Angka Anda "+angka);
                    break;
                default:
                    System.out.println("Invalid Number "+angka);
                    break;
        }
    }
}
