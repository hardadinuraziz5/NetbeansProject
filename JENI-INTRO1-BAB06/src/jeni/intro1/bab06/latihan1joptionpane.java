/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeni.intro1.bab06;

import javax.swing.JOptionPane;
/**
 *
 * @author hardadinuraziz
 */
public class latihan1joptionpane {
    public static void main(String[] args){
        String number1 ="";
        number1 = JOptionPane.showInputDialog("Masukkan Nilai1: ");
        String number2 ="";
        number2 = JOptionPane.showInputDialog("Masukkan Nilai2: ");
        String number3 ="";
        number3 = JOptionPane.showInputDialog("Masukkan Nilai3: ");
        
        double int1 = Double.parseDouble(number1);
        double int2 = Double.parseDouble(number2);
        double int3 = Double.parseDouble(number3);
        double average = (int1+int2+int3)/3;
        
        if(average >= 60){
        String msg = "Nilai Anda "+average+" :-)";
        JOptionPane.showMessageDialog(null,msg);
        }else{
            String msg = "Nilai Anda "+average+" :-(";
        JOptionPane.showMessageDialog(null,msg);
        }
        //JOptionPane.showMessageDialog(null,msg);
    }
}
