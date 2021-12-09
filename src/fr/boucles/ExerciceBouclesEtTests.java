/**
 * Diginamic TP 03
 * 9/12/2021
 * openjdk 17.0.1
 * Arnaud Couturier
 */

package fr.boucles;

public class ExerciceBouclesEtTests {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // affichage des données du tableau
        System.out.println("Affichage du tableau complet sans tri");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Valeur " + i + " = " + array[i]);
        }

        // affichage en ordre inverse
        System.out.println("\nAffichage trié en ordre inverse");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Valeur " + i + " = " + array[array.length - i - 1]);
        }

        // afficher les entiers > 3
        System.out.println("\nValeurs supérieures à 3");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 3) {
                System.out.println("Valeur " + i + " = " + array[i]);
            }
        }

        // afficher valeurs paires
        System.out.println("\nValeurs paires");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("Valeur " + i + " = " + array[i]);
            }
        }

        // afficher valeurs des index pairs avec boucle et test (pas le plus simple)
        System.out.println("\nValeurs des index pairs");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println("Valeur " + i + " = " + array[i]);
            }
        }

        // afficher valeurs impaires
        System.out.println("\nValeurs impaires");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println("Valeur " + i + " = " + array[i]);
            }
        }
    }
}
