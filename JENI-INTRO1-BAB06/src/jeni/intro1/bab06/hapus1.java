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
public class hapus1 {
    public static void main(String[] args){
        // Branching Statements
        String names[] = {"Beah","Bianca",
                          "Lance","Belle",
                          "Nico","Yza",
                          "Gem","Ethan"};
        
        String searchName = "Yza";
        boolean foundName = false;
        
        for(int i=0;i<names.length;i++){ // for(int i=0;i<names.length;i++){
            if(names[i].equals(searchName)){ // if(names[i].equals(searchName)){
                foundName = true;
                break;
            }
        }
        
        //Pada contoh ini, jika string "Yza" ditemukan, pengulangan pada for loop
        // akan dihentikan dan akan melanjutkan ke proses berikutnya.
        
        if(foundName){
            System.out.println(searchName+" Found");
        }else{
            System.out.println(searchName+" not Found");
        }
    }
}