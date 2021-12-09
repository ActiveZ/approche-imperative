/**
 * Diginamic TP 04
 * 9/12/2021
 * openjdk 17.0.1
 * Arnaud Couturier
 */

package fr.algorithmie;

import java.util.Arrays;

public class ComparaisonTableau {
    public static void main(String[] args) {
        // tableau 1
        int[] arr_1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        System.out.println("Tableau 1: " + Arrays.toString(arr_1));
        // tableau 2
        int[] arr_2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};
        System.out.println("Tableau 2: " + Arrays.toString(arr_2));
        // nombre d'éléments en commun
        int nbCommun = 0;

        for (int i : arr_1) {
            for (int j : arr_2) {
                if (i == j) {
                    nbCommun++;
                    break;
                }
            }
        }

        // affichage du nonbre d'éléments en commun sans tenir compte des doublons
        System.out.println("Nombre d'élements en commun: " + nbCommun);
    }
}
