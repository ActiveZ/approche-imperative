/**
 * Diginamic TP 02
 * 9/12/2021
 * openjdk 17.0.1
 * Arnaud Couturier
 */
package fr.declaration.variable;

import java.util.Arrays;

public class DeclarationApp {
    public static void main(String[] args) {
        byte b = 10;
        short s = -17282;
        int i = 2846325;
        long l = 1000L;
        float f = 2.5F;
        double d = 6.4D;
        char c = 'c';
        boolean myBool = true;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(myBool);

        // affichage de randomstring sans saut de ligne
        String randomString = "voici le résultat d'un calcul:1+5=6";
        System.out.println(randomString);

        // affichage de randomstring avec saut de ligne
        randomString = "voici le résultat d'un calcul:\n1+5=6";
        System.out.println(randomString);



    }

}
