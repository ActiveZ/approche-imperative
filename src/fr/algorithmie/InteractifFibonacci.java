/**
 * Diginamic TP 04
 * 9/12/2021
 * openjdk 17.0.1
 * Arnaud Couturier
 */

package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {
    public static void main(String[] args) {
        int nb1 = 0, nb2 = 1, nb3 = 0, rang;
        String s; // valeur à tester

        // sélection du rang
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Entrez le rang");
            s = sc.nextLine();
        } while (!s.matches("\\d+")); // vérifie que c'est un nombre
        rang = Integer.parseInt(s);
        if (rang == 0) System.out.println("rang 0 -> 0");
        if (rang == 1) System.out.println("rang 0 -> 1");
        if (rang > 1) {
            for (int i = 2; i < rang + 1; i++) {
                nb3 = nb1 + nb2;
                nb1 = nb2;
                nb2 = nb3;
            }
            // affichage du résultat
            System.out.print("rang " + rang + " -> " + nb3);
        }
    }
}
