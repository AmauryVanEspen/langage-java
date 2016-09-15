/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.util;

/**
 *
 * @author admin
 */
public class MathUtil {

    public static int exposant(int nombre, int puissance) {

        if (puissance <= 0) {
            return 1;
        }
        // puissance 0

        int resultat = nombre;
        while (puissance > 0) {
            resultat = resultat * nombre;
            puissance--;
        }
        return resultat;
    }

    public static int factoriel(int nombre) {
        int resultat = nombre;

        if (nombre <= 0) {
            throw new RuntimeException("Erreur mathématique !");
        } // factoriel 0
        else {
            return resultat * factoriel(resultat - 1);
        }
    }

    public static Integer genererNombreAleat() {
        double nombreSecretDecimal = Math.random() * 100;
        int nombreSecret = (int) nombreSecretDecimal;

        return nombreSecret;
    }

    public static Integer genererNombreAleat(int min, int max) {
        int valeur;

        do{
            valeur = (int) (Math.random() * max);
            if (valeur < min || valeur > max) {
                valeur = valeur++;
            } else if (valeur > max) {
                valeur = valeur--;
            }
        } while (valeur > max || valeur < min);

        return valeur;
    }

    // Crération d'une fonction qui calcule le carre
    public static int carre(int n) {
        return n * n;
    }

}
