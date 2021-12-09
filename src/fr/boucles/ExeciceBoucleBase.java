/**
 * Diginamic TP 03
 * 9/12/2021
 * openjdk 17.0.1
 * Arnaud Couturier
 */

package fr.boucles;

import java.util.Arrays;

public class ExeciceBoucleBase {
    public static void main(String[] args) {

        /**********************
            BOUCLES DE BASE
         **********************/

        // affichage des nombres de 1 à 10
        for (int i = 1; i < 11; i++) {
            System.out.format("i = %d\n", i);
        }

        // afficher 20 fois votre nom et votre prénom
        for (int i = 0; i < 20; i++) {
            System.out.println("Arnaud Couturier");
        }

        //afficher les éléments pairs de 2 à 100
        for (int i = 2; i <= 100; i = i + 2) {
            System.out.println(i);
        }

        // afficher les éléments impairs de 1 à 99
        for (int i = 1; i < 100; i = i + 2) {
            System.out.println(i);
        }
    }
}
