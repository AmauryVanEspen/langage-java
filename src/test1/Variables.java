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
public class Variables {
    
    public static void main(String[] args) {
        
        // Types primitifs entiers
        byte byte1 =99;
        short short1 =9999;
        int int1 = 123;
        long long1 =99999999;
        
        Byte b1 = new Byte("12"); 
        /* en faisant Ctrl + clic sur la Classe "Byte"
         on obtient le contenu de la classe
        */
        
        // Types primitifs décimaux
        float float1 = (float) 1234.56;
        double double1 = 1234.56;
        
        // Types booleen
        boolean booleen=true; // ou false
        
        // Texte
        String string1 ="coucou";
        

        Long l=new Long(123);
        String s2=l.toString();
        
        Long l123=Long.valueOf("1234");
        
        String s=Long.toString(123);
        
        Integer int123 = 123;
        String f=int123.toString();
        Long longue=Long.valueOf(f);
        longue = longue + 100;
        String string = longue.toString(longue);
        System.out.println(string);
        
    }
}
;