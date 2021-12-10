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

        // sélection d'un nombre entre 1 et 3
        Scanner sc = new Scanner(System.in);
        String s; // valeur à tester
        do {
            System.out.println("Entrez un nombre entre 1 et 100");
            s = sc.nextLine();
        } while (!s.matches("[1-3]"));
    }
}

/////////////// TODO ////////////////////