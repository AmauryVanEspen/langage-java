/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.DataInputStream;
import java.io.IOException;
import test1.util.ConsoleUtil;
import test1.util.MathUtil;


/**
 *
 * @author admin
 */
public class FonctionCarre {
       
    // Main avec conversion de la saisie texte en nombre
    public static void main(String[] args) throws IOException {
        
        String txt = ConsoleUtil.lireTexte("Veuillez entrer un nombre entier");
        
        int n = Integer.valueOf(txt);
        
        System.out.println("Le carré de " + txt + " est " + MathUtil.carre(n));
        
    }
  
}
