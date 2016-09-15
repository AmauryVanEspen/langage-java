/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.util;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author admin
 */
public class ConsoleUtil {

    // Création d'une fonction lireTexte qui récupère
    // le contenu de la saisie au calvier dans la console
    public static Integer lireInt(String message) throws IOException {
        return Integer.valueOf(lireTexte(message));
    }
    
        // Création d'une fonction lireTexte qui récupère
    // le contenu de la saisie au calvier dans la console
    public static String lireTexte(String message) throws IOException {
        DataInputStream clavier = new DataInputStream(System.in);
        System.out.println(message);
        String texte = clavier.readLine();
        return texte;
    }
    
}
