/**
 * Diginamic TP 04
 * 9/12/2021
 * openjdk 17.0.1
 * Arnaud Couturier
 * <p>
 * Jeu des 21 batons
 * Le jeu est simple mais la réalisation est plus délicate. Vous allez jouer contre l’ordinateur.
 * Celui qui prend le dernier baton a perdu.
 * <p>
 * Jeu des 21 batons
 * Le jeu est simple mais la réalisation est plus délicate. Vous allez jouer contre l’ordinateur.
 * Celui qui prend le dernier baton a perdu.
 * <p>
 * Jeu des 21 batons
 * Le jeu est simple mais la réalisation est plus délicate. Vous allez jouer contre l’ordinateur.
 * Celui qui prend le dernier baton a perdu.
 */

/**
 * Jeu des 21 batons
 * Le jeu est simple mais la réalisation est plus délicate. Vous allez jouer contre l’ordinateur.
 * Celui qui prend le dernier baton a perdu.
 */

package fr.algorithmie;

import java.util.Scanner;

public class Interactif21Batons {
    public static void main(String[] args) {
        boolean player; // joueur en cours: false -> pc, true -> humain
        String s; // valeur à tester entrée dans le scanner
        int nbBar = 21;

        Scanner sc = new Scanner(System.in);
        // définir qui commence la partie
        do {
            System.out.println("Qui commence ? 0: ordinateur, 1: vous");
            s = sc.nextLine();
        } while (!s.matches("[0-1]"));
        player = Boolean.parseBoolean(s);

        // jeu jusqu'à ce qu'il ne reste qu'un baton
        do {
            System.out.println("Il reste " + nbBar + " batons");
            // le joueur joue
            if (player) {
                // sélection d'un nombre entre 1 et 3 pour enlever les batons
                do {
                    System.out.println("Enlevez entre 1 et 3 batons:");
                    s = sc.nextLine();
                } while (!s.matches("[1-3]"));
                nbBar =- Integer.parseInt(s);
                player = !player;
            }
            // l'ordinateur joue
            else {
                System.out.println("L'ordinateur joue et enlève batons");
                player = !player;
            }
        } while (nbBar>1);


    }
}

/////////////// TODO ////////////////////