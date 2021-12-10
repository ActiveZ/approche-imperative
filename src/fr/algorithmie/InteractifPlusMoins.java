/**
 * Diginamic TP 04
 * 9/12/2021
 * openjdk 17.0.1
 * Arnaud Couturier
 */

package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {
    /**
     * Ecrire un jeu qui :
     * - choisit un nombre aléatoire entre 1 et 100
     * - puis demande à l’utilisateur de trouver ce nombre en lui indiquant s’il est au-dessus ou
     * en dessous du nombre,
     * - Lorsque l’utilisateur a trouvé le nombre, le programme affiche « Bravo, vous avez
     * trouvé en N coups » où N représente le nombre d’essais effecté par l’utilisateur
     * - le programme se termine.
     */

    public static void main(String[] args) {
        // nombre mystère entre 1 et 100
        int mystery = (int) (Math.random() * 100 + 1);
        // nombre d'essais
        int nbTry = 0;
        // valeur testée par le joueur
        int n = 0;

        do {
            // sélection d'un nombre entre 1 et 100
            Scanner sc = new Scanner(System.in);
            String s; // valeur à tester
            do {
                System.out.println("Entrez un nombre entre 1 et 100");
                s = sc.nextLine();
            } while (!s.matches("[0-9]|[1-9][0-9]|100"));
            n = Integer.parseInt(s);
            if (n > mystery) System.out.println("trop grand");
            if (n < mystery) System.out.println("trop petit");
            nbTry++;
        } while (n != mystery);
        System.out.println("Bravo ! Vous avez trouvé en " + nbTry + " coups !");
    }
}