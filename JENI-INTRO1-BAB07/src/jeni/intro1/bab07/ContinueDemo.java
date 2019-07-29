/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeni.intro1.bab07;

/**
 *
 * @author hardadinuraziz
 */
public class ContinueDemo {
    public static void main(String[] args){
        boolean t = true;
        System.out.println("Before the return.");
        
        if(t){
            return;
        }
        
        // Compiler will bypass every statement
        // after return
        System.out.println("This won't execute");
            
    }
}
