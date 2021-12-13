package fr.diginamic.jdr;

import java.util.Scanner;

import static fr.diginamic.jdr.Utils.monstreFactory;

public class Launch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;

        // création du personnage
        Personnage hero = new Personnage();
        System.out.println("Hero est né ! Type: " + hero + "\n");

        do {
            // création d'un monstre
            Creature monstre = monstreFactory();

            // bagarre !!!
            System.out.println("Héro rencontre un " + monstre.toString());
            do {
                if (hero.estVivant()) hero.attaque(monstre);
                System.out.println("Appuyez sur entrée pour continuer...");
                s = sc.nextLine();
            } while (hero.estVivant() && monstre.estVivant());
            // le hero gagne et monte son score
            if (hero.estVivant()) hero.score += monstre.scoreValue;
            System.out.println("Score du héros: " + hero.score + "\n");
        } while (hero.estVivant());
    }
}
