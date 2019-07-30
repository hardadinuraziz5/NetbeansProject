/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hour2;

/**
 *
 * @author hardadinuraziz
 */
public class Hour2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 1;
        int sum = 0;
        
        while(n <= 100){ // run 100 times
            sum += n; // sum = sum+n
            n++;
        }
        System.out.println("Sum = "+n);
    }
}
