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
public class latihan4dowhile {
    public static void main(String[] args){
        Scanner baca = new Scanner(System.in);
        
        System.out.print("Masukkan Angka :");
        int angka = baca.nextInt();
        
        do{
            System.out.println("Angka Anda "+angka+" Mempunyai Pangkat "+Math.sqrt(angka));
            break;
        }while(angka == angka);
    }
}
