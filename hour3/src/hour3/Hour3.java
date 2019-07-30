/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hour3;

import java.util.Arrays;
/**
 *
 * @author hardadinuraziz
 */
public class Hour3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] myArray;
        myArray = new int[10]; // create an array "myArray"
        for(int n=0;n<myArray.length;n++){ // run 10 times
            myArray[n] = n; // set the value of "n" to each array element
            System.out.print(myArray[n]+"\n"); // output each element
        }
    }
}