/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeni.intro1.bab06;



/**
 *
 * @author hardadinuraziz
 */
public class GradeSwitch {
    public static void main(String[] args){
        int grade = 90;
        
        switch(grade){
                case 100:
                    System.out.println("Excellent!");
                    break;
                case 90:
                    System.out.println("Good Job!");
                    break;
                case 80:
                    System.out.println("Study Harder!");
                    break;
                default:
                    System.out.println("Sorry, you failed");
                    break;
        }
    }
}
