/**
 * Diginamic TP 04
 * 9/12/2021
 * openjdk 17.0.1
 * Arnaud Couturier
 */

package fr.algorithmie;

import java.util.Arrays;

public class Rotation {
    public static void main(String[] args) {
        // tableau initial
        int[] array = {0, 1, 2, 3};
        // tableau temporaire de taille + 1 par rapport au tableau à traiter
        int[] array_temp = new int[array.length + 1];

        System.out.println("Tableau initial: " + Arrays.toString(array));

        // passage de la dernière valeur de array à l'index 0 du tableau temporaire
        array_temp[0] = array[array.length - 1];

        // remplissage du tableau temporaire avec un décalage d'une position à droite
        for (int i = 0; i < array.length; i++) {
            array_temp[i + 1] = array[i];
        }

        // modification du tableau initial
        for (int i = 0; i < array.length; i++) {
            array[i] = array_temp[i];
        }

        // destruction du tableau temporaire
        array_temp = null;

        // affichage du résultat
        System.out.println("Tableau transformé: " + Arrays.toString(array));
    }
}
