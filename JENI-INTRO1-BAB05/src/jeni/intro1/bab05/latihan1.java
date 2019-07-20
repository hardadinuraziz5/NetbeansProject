/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeni.intro1.bab05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author hardadinuraziz
 */
public class latihan1 {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        String word1 = "",word2="",word3="";
        
        System.out.print("Enter word1: ");
        try{
            word1 = dataIn.readLine();
        }catch(IOException e){
            System.out.println("Error!");
        }
        
        System.out.print("Enter word2: ");
        try{
            word2 = dataIn.readLine();
        }catch(IOException e){
            System.out.println("Error!");
        }
        
        System.out.print("Enter word3: ");
        try{
            word3 = dataIn.readLine();
        }catch(IOException e){
            System.out.println("Error!");
        }
        
        System.out.println(word1+" "+word2+" "+word3);
        
        
    }
}
