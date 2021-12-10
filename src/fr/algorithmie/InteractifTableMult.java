/**
 * Diginamic TP 04
 * 9/12/2021
 * openjdk 17.0.1
 * Arnaud Couturier
 */

package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args) {
        /**
         * Ecrire un programme qui demande un nombre à l’utilisateur qui doit être compris entre 1 et
         * 10. Une fois que le nombre est bien entre 1 et 10, le programme affiche la table de
         * multiplication de ce nombre.
         */

        // sélection d'un nombre entre 1 et 10
        Scanner sc = new Scanner(System.in);
        String n; // valeur à tester
        do {
            System.out.println("Entrez un nombre entre 1 et 10");
            n = sc.nextLine();
        } while (!n.matches("[1-9]|10"));

        // affichage de la table de multiplication coresspondante
        String txt = "Table de " + n + ":\n";
        for (int i = 1; i < 11; i++) {
            txt += (n + " x " + i + " = " + (Integer.parseInt(n) * i) + "\n");
        }
        System.out.println(txt);
    }
}
