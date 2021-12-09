/**
 * Diginamic TP 03
 * 9/12/2021
 * openjdk 17.0.1
 * Arnaud Couturier
 */

package fr.boucles;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ExerciceTableauEntier {
    /*************************************
     PARCOURS D'UN TABLEAU D'ENTIERS
     *************************************/

    public static void main(String[] args) {

        // tableau d'entiers de 1 à 10
        int[] myNum = IntStream.range(1, 11).toArray();
        // affichage du 1er élément
        System.out.println("premier élément = " + myNum[0]);
        // longueur du tableau
        System.out.println("nombre d'éléments = " + myNum.length);
        // dernier élément du tableau
        System.out.println("Dernier élément = " + myNum[myNum.length - 1]);
        // remplacement de l'élément d'index 4 avec la valeur 8
        myNum[4] = 8;
        // vérification
        System.out.println("mon tableau: " + Arrays.toString(myNum));
    }

}
