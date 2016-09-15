/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author admin
 */
public class CalculPerf {

    public static void main(String[] args) {
        Date today;
        String result = null;
        SimpleDateFormat formatter;
        Locale currentLocale = Locale.FRANCE;
        String debut = result;
        String fin = result;
        

        formatter = new SimpleDateFormat("EEE d MMM yy H:mm:ss:SSS", currentLocale);
        today = new Date();
        result = formatter.format(today);
        System.out.println("Locale: " + currentLocale.toString());
        System.out.println("Result: " + result);
        System.out.println(String.valueOf(debut) + " " + String.valueOf(fin) );
    }
}
