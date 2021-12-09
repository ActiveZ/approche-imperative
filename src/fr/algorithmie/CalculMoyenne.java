/**
 * Diginamic TP 04
 * 9/12/2021
 * openjdk 17.0.1
 * Arnaud Couturier
 */

package fr.algorithmie;

import java.util.Arrays;

public class CalculMoyenne {
    public static void main(String[] args) {
        // tableau initial
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        System.out.println("array: " + Arrays.toString(array));
        int sum = 0;

        // calcul de la somme des entiers du tableau
        for (int i : array) {
            sum += i;
        }

        // affichage de la moyenne
        System.out.println("Moyenne = " + sum / array.length);
    }
}
