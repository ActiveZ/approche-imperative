/**
 * Diginamic TP 04
 * 9/12/2021
 * openjdk 17.0.1
 * Arnaud Couturier
 */

package fr.algorithmie;

import java.util.Arrays;

public class RechercheMax {
    public static void main(String[] args) {
        // tableau initial
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        System.out.println("array: " + Arrays.toString(array));
        int max;


        // recherhe du max méthode 1 :  boucle for
        max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max (1) = " + max);


        // recherhe du max méthode 1 bis :  boucle for avec ternaire
        max = array[0];
        for (int i = 0; i < array.length; i++) {
            max = array[i] > max ? array[i] : max;
        }
        System.out.println("Max (1 bis) = " + max);


        // recherhe du max méthode 2 : for each
        max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Max (2) = " + max);


        // recherche du max méthode 3 (pas de variable max) : méthode sort
        Arrays.sort(array);
        System.out.println("Max (3) = " + array[array.length - 1]);
    }
}
