/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.junit.Test;

/**
 *
 * @author admin
 */
public class MapTest {

    /**
     * Créer une fonction de test getRuby getRuby récupère la définition de la
     * clé Ruby
     */
    @Test
    public void recupRuby() {
        HashMap<String, String> map = new HashMap<>();

        map.put("Java", "Langue de prog objet");
        map.put("C", "Langue de prog structuré");
        map.put("Ruby", "Langue de script objet");

        String def = map.get("ruby123");

        System.out.println(def);
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key) );
        }
    }

    @Test
    public void itererSurCles() {
        HashMap<String, String> map = new HashMap<>();

        map.put("Java", "Langue de prog objet");
        map.put("C", "Langue de prog structuré");
        map.put("Ruby", "Langue de script objet");

        Set<String> keySet = map.keySet();
        System.out.println(map);
    }

    @Test
    public void retirerC() {
        HashMap<String, String> map = new HashMap<>();

        map.put("Java", "Langue de prog objet");
        map.put("C", "Langue de prog structuré");
        map.put("Ruby", "Langue de script objet");

        map.remove("C");

        System.out.println(map);
    }

    @Test
    public void ajouterPython() {
        HashMap<String, String> map = new HashMap<>();

        map.put("Java", "Langue de prog objet");
        map.put("C", "Langue de prog structuré");
        map.put("Ruby", "Langue de script objet");

        HashMap<String, String> map2 = new HashMap<>();
        map2.put("Python", "langage haut niveau");
        map2.put("PHP", "langage dynamique");

        map2.putAll(map);
        System.out.println(map2);
    }

    @Test
    public void remplacerDefRubyParSuperLangage() {
        HashMap<String, String> map = new HashMap<>();

        map.put("Java", "Langue de prog objet");
        map.put("C", "Langue de prog structuré");
        map.put("Ruby", "Langue de script objet");

        map.replace("Ruby", "Super langage");

    }

    public void map() {
        HashMap<String, String> map = new HashMap<>();

        map.put("Java", "Langue de prog objet");
        map.put("C", "Langue de prog structuré");
        map.put("Ruby", "Langue de script objet");

        map.size(); // renvoie 3
        map.get("Java"); //renvoie "Langue de prog objet"
        map.keySet(); // renvoie un set avec java, c , ruby
        map.values(); // renvoie toutes les valeurs pas les clés
        map.putAll(map); // ajoute une map dans une autre
        map.remove("c"); // supprime l'entrée c dans le champ
        map.replace("C", "langage préhistorique"); // remplace
        map.clear();// vide la map

    }
}
