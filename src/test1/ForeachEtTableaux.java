/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author admin
 */
public class ForeachEtTableaux {

    public static void main(String[] args) {
        int[] tab = new int[9];
        
        // Initialiser tab
        for(int indice=0; indice<tab.length; indice++){
            tab[indice] = indice +1;
        }
        
        // Afficher tab
        for(int elem: tab){
            System.out.println(elem);
        }
    }
}
