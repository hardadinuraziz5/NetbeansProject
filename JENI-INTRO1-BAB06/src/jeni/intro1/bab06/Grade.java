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
public class Grade {
    public static void main(String[] args){
        
        double grade = 92.0;
        
        if(grade >= 90){
            System.out.print("Excellent!");
        }else if((grade < 90) && (grade >=80)){
            System.out.print("Good Job");
        }else if((grade < 80) && (grade >=60)){
            System.out.print("Study Harder!");
        }else {
            System.out.print("Sorry, you failed.");
        }
        
        
    }
}