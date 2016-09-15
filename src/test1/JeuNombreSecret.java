/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.IOException;
import test1.util.ConsoleUtil;
import test1.util.MathUtil;

/**
 *
 * @author admin
 */
public class JeuNombreSecret {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws IOException {
        // Util entre min / max
        String minStr = ConsoleUtil.lireTexte("Minimum");
        int min = Integer.valueOf(minStr);
        
        String maxStr = ConsoleUtil.lireTexte("Maximum");
        int max = Integer.valueOf(maxStr);
        
        
        // generer un nombre secret
        int nombreSecret = MathUtil.genererNombreAleat();
        int essai;
        int count = 1;
                
        do{
        String essaiString = ConsoleUtil.lireTexte("Votre essai:");
        essai = Integer.valueOf(essaiString);
        
        if (nombreSecret < essai) {
                    count = count +1;
                    System.out.println("Inférieur");
                }
        else if (nombreSecret > essai){
                    count = count +1;
                    System.out.println("Supérieur");
                }
        }
        while (nombreSecret != essai);
        
        // Création d'un bloc "Appreciation"
        String appreciation = "";
        if (count <= 3 ){
            appreciation = "Génial";
        }else if(count <= 6 ){
            appreciation = "Super";
        }else if(count <= 9 ){
            appreciation = "Cool";
        }else if(count <= 12 ){
            appreciation = "Pas Mal";
        }else if(count > 12 ){
            appreciation = "Nul";
        }
        
        System.out.println("Gagné en " + count + " coups " + appreciation);
        
    }
}
