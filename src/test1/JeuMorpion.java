/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.IOException;
import test1.util.ConsoleUtil;

/**
 * Jeu Morpion Créer un tableau initialiser le tableau 3 * 3 avec la valeur 1 la
 * taille du tableau doit pouvoir être changée
 *
 * @author Amaury Bug à corriger : lors de la saisie d'un caractère qui n'est
 * pas un entier pour la taille du tableau probablement la même chose pour la
 * saisie des coordonnées
 */
public class JeuMorpion {

    public static String nomJoueur1() throws IOException {
        System.out.println("Saisir le nom du Joueur 1");
        String joueur1 = ConsoleUtil.lireTexte("Joueur 1 :");
        System.out.println("Merci " + joueur1);
        return joueur1;
    }

    public static String nomJoueur2() throws IOException {
        System.out.println("Saisir le nom du Joueur 2");
        String joueur2 = ConsoleUtil.lireTexte("Joueur 2 :");
        System.out.println("Merci " + joueur2);
        return joueur2;
    }

    /**
     * saisir dans le tableau Demander à l'utilisateur de choisir la ligne et la
     * colonne vérifier que l'emplacement est valable : - l'emplacement doit
     * exister - l'emplacement doit être vide Remplir l'emplacement avec le
     * contenu
     *
     * @param contenu
     * @param plateau
     * @param lo
     * @param la
     * @param tourDeJeu
     * @throws java.io.IOException
     */
    public static void saisiTableau(char contenu, char[][] plateau, int lo, int la, int tourDeJeu) throws IOException {

        // On choisit les coordoonées
        System.out.println("Choisissez les coordonnées du plateau");
        System.out.println("Plateau de largeur X = " + la + " et Y = " + lo);
        int x = ConsoleUtil.lireInt("Ligne");
        int y = ConsoleUtil.lireInt("Colonne");

        // On vérifie les conditions
        // - coordonnées dans le plateau
        if (x > la) {
            System.out.println("Veuillez saisir une valeur pour X inférieure ou égale à " + lo);
            return;
        } else if (y > lo) {
            System.out.println("Veuillez saisir une valeur pour Y inférieure ou égale à " + la);
            return;
        }

        // - l'emplacement est vide
        if (plateau[x][y] != ' ') {
            System.out.println("Les coordonnées choisies ne sont pas disponibles");
        } else {
            //Saisir contenu dans l'emplacement
            plateau[x][y] = contenu;
        }

        // Saisir et afficher
    }

    /**
     * Afficher le tableau
     *
     * @param plateau
     */
    public static void afficherTableau(char[][] plateau) {
        for (char[] plateau1 : plateau) {
            for (int lo = 0; lo < plateau1.length; lo++) {
                System.out.print(plateau1[lo]);
            }
            System.out.println();
        }
    }

    public static int tourDeJeu(String nomJoueur1, String nomJoueur2) {
        int tourDeJeu = 0;

        String joueur1 = nomJoueur1;
        String joueur2 = nomJoueur2;

        if (tourDeJeu != 0) {
            if (tourDeJeu != 0) {
                System.out.println(joueur1 + " Tour n°" + tourDeJeu);
                tourDeJeu++;
            } else {
                System.out.println(joueur2 + " Tour n°" + tourDeJeu);
            }
            tourDeJeu++;
        }
        return tourDeJeu;
    }

    public static char symbol(int tourDeJeu) {
        char symbol = ' ';

        if (tourDeJeu % 2 == 1) {
            return symbol = 'X';
        } else {
            return symbol = '0';
        }
    }

    public static boolean termine(char plateau[][], char symbol) {
        boolean partieTerminee = true;

        for (int i = 0; i > 0 && i < 2; i++) {
            for (int j = 0; j > 0 && j < 2; j++) {
                if (plateau[i][j] == ' ') {
                    partieTerminee = false;
                }
            }
        }

        for (int i = 0; i > 0 && i < 2; i++) {

            if (plateau[i][0] == symbol && plateau[i][1] == symbol && plateau[i][2] == symbol) {
                partieTerminee = true;
            }
        }

        for (int i = 0; i > 0 && i < 2; i++) {

            if (plateau[0][i] == symbol && plateau[1][i] == symbol && plateau[2][i] == symbol) {
                partieTerminee = true;
            }
        }

        if (plateau[0][0] == symbol && plateau[1][1] == symbol && plateau[2][2] == symbol) {
            partieTerminee = true;
        }

        if (plateau[0][2] == symbol && plateau[1][1] == symbol && plateau[2][0] == symbol) {
            partieTerminee = true;
        }

        return partieTerminee;
    }

    public static void main(String[] args) throws IOException {

        // Saisir le nom des joueurs
        String joueur1 = nomJoueur1();
        String joueur2 = nomJoueur2();
        System.out.print("Bienvenue à " + joueur1 + " & " + joueur2 + "\nLa partie peut commencer\n");

        // Récupérer le numéro de tour
        int tourDejeu = tourDeJeu(joueur1, joueur2);

        // Saisir la taille du plateau
        int plateauLa = 3;
        int plateauLo = 3;
        char symbol = symbol(tourDejeu);

        // initialiser le tableau
        char[][] plateau = new char[plateauLa][plateauLo];
        for (int la = 0; la < plateauLa; la++) {
            for (int lo = 0; lo < plateauLo; lo++) {
                plateau[la][lo] = ' ';
            }
        }

        do {
            // Définir le tour de jeu
            // fonction
            tourDeJeu(joueur1, joueur2);
            // Saisir dans le tableau
            // en fonction du tour de jeu puis afficher
            saisiTableau(symbol, plateau, plateauLo, plateauLa, tourDejeu);
            afficherTableau(plateau);
        }while(termine(plateau, symbol) == false);
    }
}
