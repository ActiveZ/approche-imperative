/**
 * Diginamic TP 04
 * 9/12/2021
 * openjdk 17.0.1
 * Arnaud Couturier
 */

package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args) {

        int[] arr_1 = {1, 6};
        boolean result;

        result = arr_1.length > 0 && (arr_1[0] == 6 || arr_1[arr_1.length - 1] == 6);

        // affichage du résultat
        System.out.println("Résultat: " + result);
    }
}
