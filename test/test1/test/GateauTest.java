/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.test;

import org.junit.Test;
import test1.classes.Gateau;

/**
 *
 * @author tom
 */
public class GateauTest {

    @Test
    public void test3Gateaux() {

        Gateau g1 = new Gateau("citron", "jaune");

        Gateau g2 = new Gateau();

        Gateau g3 = new Gateau();

        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
        
        System.out.println(Gateau.getNbObjets());

    }

        

}
