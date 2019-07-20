/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeni.intro1.bab05;

import javax.swing.JOptionPane;
/**
 *
 * @author hardadinuraziz
 */
public class GetInputFromKeyboardJOPTIONPANE {
    public static void main(String[] args){
        String name = "";
        name = JOptionPane.showInputDialog("Please enter your name");
        
        String msg = "Hello "+name+" !";
        JOptionPane.showMessageDialog(null, msg);
        
    }
}
