/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Collections {
    
    public static void main(String[] args) {
        
//        ArrayList<String> liste = new ArrayList<String>();
//        liste.add("Coucou");
//        liste.add("Hello");
//        
//        System.out.println(liste.size());
//        liste.remove("Coucou");
//        System.out.println(liste);
//        System.out.println(liste.size());

/**
 * Créer une liste d'entiers;
 * placer tous les multiples de 10, de 10 jusqu'à 100;
 * Créer une seconde liste d'entiers;
 * placer tous les multiples de 2, de 2 jusqu'à 100;
 * Créer une liste d'entiers;
 * placer tous les multiples de 3, de 3 jusqu'à 99;
 * 
 * Soustraire la liste 1 puis la liste 3 à la liste 2;
 * Afficher le résultat
 */
        ArrayList<Integer> liste1 = new ArrayList<Integer>();
        for(int i = 10;i>=10 && i<=100; i = i + 10){
        liste1.add(i);
        }
        
        ArrayList<Integer> liste2 = new ArrayList<Integer>();
        for(int i = 2;i>=2 && i<=100; i = i + 2){
        liste2.add(i);
        }
        
        ArrayList<Integer> liste3 = new ArrayList<Integer>();
        for(int i = 3;i>=3 && i<=99; i = i + 3){
        liste3.add(i);
        }
        
        liste2.removeAll(liste1);
        liste2.removeAll(liste3);
        System.out.println(liste2);
    }
}