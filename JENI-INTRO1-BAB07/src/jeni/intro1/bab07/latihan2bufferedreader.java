/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeni.intro1.bab07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author hardadinuraziz
 */
public class latihan2bufferedreader {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        int jml_data[]=new int[10];
        String masuk = "";
        
        for(int a=0;a<jml_data.length;a++){
            System.out.print("Inputan Data ke"+(a+1)+" :");
            try{
                masuk = dataIn.readLine();
                jml_data[a]=Integer.parseInt(masuk);
            }catch(IOException e){
            }
        }
        int terbesar = jml_data[0];
        for(int a=0;a<jml_data.length;a++){
            if(jml_data[a]>terbesar){
                terbesar = jml_data[a];
            }
        }
        
        System.out.println("Nilai terbesar Dari Data = "+terbesar);
    }
}
