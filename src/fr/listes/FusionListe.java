package fr.listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {
    public static void main(String args[]) {
        List<String> liste1 = new ArrayList<>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");
        List<String> liste2 = new ArrayList<>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        // fusion des 2 listes dans liste 3
        List<String> liste3 = new ArrayList<>(liste1); // méthode facile

        for (String l: liste2) { // méthode pour l'exercice (avec boucle for each)
            liste3.add(l);
        }

        System.out.println("liste3 = " + liste3);
    }

}
