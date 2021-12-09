/**
 * Diginamic TP 03
 * 9/12/2021
 * openjdk 17.0.1
 * Arnaud Couturier
 */

package fr.algorithmie;
import java.util.Arrays;

public class AffichageInversionContenu {
    public static void main(String[] args) {
        // tableau initial
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        System.out.println("array: " + Arrays.toString(array));

        //inversion du tableau dans arrayCopy
        int[] arrayCopy = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            arrayCopy[array.length - i - 1] = array[i];
        }

        // affichage résultat
        System.out.println("arrayCopy: " + Arrays.toString(arrayCopy));
    }
}
