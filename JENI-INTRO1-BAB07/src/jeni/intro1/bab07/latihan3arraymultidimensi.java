/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeni.intro1.bab07;
//import java.util.Scanner;
/**
 *
 * @author hardadinuraziz
 */
public class latihan3arraymultidimensi {
    public static void main(String[] args){
        int[] angka = new int[100];
        
        int x = 1;
        // untuk memberi nilai pada tiap index
        for(int i=0;i<=angka.length;i++){
            angka[i] = x;
            x++;
        }
        
        int total = 0;
        // untuk menjumlahkan nilai 1-100
        for(int i = 0;i<=angka.length;i++){
            total+=angka[i];
        }
        System.out.println(total);
    }
}