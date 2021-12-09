/**
 * Diginamic TP 04
 * 9/12/2021
 * openjdk 17.0.1
 * Arnaud Couturier
 */

package fr.algorithmie;

public class AffichageSuite {
    public static void main(String[] args) {
        /************
         * boucle for
         ************/

        // affichage des nombres de 1 à 10 inclus
        System.out.println("Affichage des nombres de 1 à 10 inclus");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        // affichage des nombres pairs de 0 à 10 inclus
        System.out.println("\nAffichage des nombres pairs de 1 à 10 inclus");
        for (int i = 0; i < 11; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // affichage des nombres impairs de 0 à 9 inclus
        System.out.println("\nAffichage des nombres impairs de 1 à 9 inclus");
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        /***************
         * boucle while
         ***************/

        // affichage des nombres de 1 à 10 inclus
        System.out.println("\nAffichage des nombres de 1 à 10 inclus");
        int i = 1;
        while (i < 11) {
            {
                System.out.println(i);
                i++;
            }
        }

        // affichage des nombres pairs de 0 à 10 inclus
        System.out.println("\nAffichage des nombres pairs de 0 à 10 inclus");
        i = 0;
        while (i < 11) {
            {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
                i++;
            }
        }

        // affichage des nombres impairs de 0 à 9 inclus
        System.out.println("\nAffichage des nombres impairs de 0 à 10 inclus");
        i = 0;
        while (i < 9) {
            {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
                i++;
            }
        }
    }
}
