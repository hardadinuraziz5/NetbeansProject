/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeni.intro1.bab06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.IOException;
        
/**
 *
 * @author hardadinuraziz
 */
public class latihan1bufferedreader {
    public static void main(String[] args) throws IOException{
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Masukkan Nilai1: ");
        String input1 = dataIn.readLine();
        System.out.print("Masukkan Nilai2: ");
        String input2 = dataIn.readLine();
        System.out.print("Masukkan Nilai3: ");
        String input3 = dataIn.readLine();
        
        double number1 = Double.parseDouble(input1);
        double number2 = Double.parseDouble(input2);
        double number3 = Double.parseDouble(input3);
        double average = (number1+number2+number3)/3;
        System.out.print("Output Rata-Rata: "+average+" ");
        //System.out.println("Square root of "+input1+" is "+Math.sqrt(number1));
        if(average >= 60){
            System.out.print(":)");
        }else{
            System.out.print(":-(");
        }
        dataIn.close();
        
    }
}
