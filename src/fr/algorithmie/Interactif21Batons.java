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
 * <p>
 * A lire: https://kimunga.com/jeu-batons-technique-gagner
 * <p>
 * PS: si le joueur joue en 1er, il perdra !
 */


package fr.algorithmie;

import java.util.Scanner;

public class Interactif21Batons {
    public static void main(String[] args) {
        boolean player; // joueur en cours: false -> pc, true -> humain
        String s; // valeur à tester entrée dans le scanner
        int nbBar = 21; // nombre de batons

        Scanner sc = new Scanner(System.in);
        // définir qui commence la partie
        do {
            System.out.println("Qui commence ? 0: ordinateur, 1: vous");
            s = sc.nextLine();
        } while (!s.matches("[0-1]"));
        player = s.compareTo("1") == 0;

        // jeu jusqu'à ce qu'il ne reste qu'un baton
        do {
            System.out.println("Il reste " + nbBar + " batons");

            // le joueur joue et choisit d'enlever entre 1 et 3 batons
            if (player) {
                do {
                    System.out.println("Enlevez entre 1 et 3 batons:");
                    s = sc.nextLine();
                } while (!s.matches("[1-3]"));
                nbBar -= Integer.parseInt(s);
            }

            // l'ordinateur joue et calcule le nb de batons à enlever
            else {
                int n = ((nbBar - 1) % 4 == 0) ? 1 + (int) (Math.random() * 3) : (nbBar - 1) % 4;
                nbBar -= n;
                System.out.println("L'ordinateur joue et enlève " + n + " batons");
            }
            player = !player;
        } while (nbBar > 1);

        // fin du jeu
        s = "Il reste 1 baton, ";
        s += player ? "vous avez perdu !!!" : "l'ordinateur a perdu !!!";
        System.out.println(s);
    }
}