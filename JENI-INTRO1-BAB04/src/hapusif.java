/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author hardadinuraziz
 */
public class hapusif {
    public static void main(String[] args){
        // Deklarasi konstanta
        final double PI = 3.14;
        
        // Deklarasi variabel jari2 dan luas
        int jari2;
        double luas;
        
        // Memberi nilai awal ke variabel jari2
        jari2 = 7;
        
        // Menghitung luas lingkaran
        luas = PI * jari2 * jari2;
        
        System.out.println("Nilai Jari-jari : "+jari2);
        System.out.println("Nilai PI : "+PI);
        System.out.println("Nilai Luas Lingkaran : "+luas);
    }
}
