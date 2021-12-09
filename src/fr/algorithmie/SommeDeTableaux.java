/**
 * Diginamic TP 04
 * 9/12/2021
 * openjdk 17.0.1
 * Arnaud Couturier
 */

package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableaux {
    public static void main(String[] args) {
        // tableau 1
        int[] arr_1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        System.out.println("Tableau 1: " + Arrays.toString(arr_1));
        // tableau 2
        int[] arr_2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1} ;
        System.out.println("Tableau 2: " + Arrays.toString(arr_2));

        // prérequis: les 2 tableaux sont de même taille
        int[] arr_sum = new int[arr_1.length];
        for (int i = 0; i < arr_1.length; i++) {
            arr_sum[i] = arr_1[i] + arr_2[i];
        }

        // affichage du résultat
        System.out.println("Tableau somme: " + Arrays.toString(arr_sum));
    }
}
