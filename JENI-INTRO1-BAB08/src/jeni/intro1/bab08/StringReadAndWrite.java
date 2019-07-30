/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeni.intro1.bab08;

import java.util.Scanner;
/**
 *
 * @author hardadinuraziz
 */
public class StringReadAndWrite {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the length of String array");
        int n = scan.nextInt();
        String[] sarray = new String[n];
        
        for(int i=0;i<n;i++){
            System.out.println("enter the "+(i+1)+" String : ");
            sarray[i]=scan.next();
        }
        System.out.println("Strings Entered by user: ");
        
        for(String s:sarray){
            System.out.println(s);
        }
    }
}
