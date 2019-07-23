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
public class latihan4forloop {
    public static void main(String[] args){
        Scanner dataIn = new Scanner(System.in);
        int batas = 100;
        System.out.print("Masukkan Angka Anda: ");
        int angka = dataIn.nextInt();
        
        for(angka = angka;angka == angka;angka++){
            System.out.println("Angka Anda "+angka+" Mempunyai Pangkat "+Math.sqrt(angka));
            break;
        }
    }
}
