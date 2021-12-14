package fr.sets;

import java.util.*;

public class TestSetDouble {
    public static void main(String[] args) {
        HashSet<Double> set = new HashSet<>(List.of(.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));

        // affichage des éléments
        System.out.println("set = " + set);

        // création d'un itérateur
        Iterator<Double> it = set.iterator();

        // affiche le 1er item
        System.out.println("1er élément: " + it.next());

        // remise de l'itérateur au début du set
        it = set.iterator();

        // recherche du plus grand élément
        double max = it.next(); // initialisation de max avec la première valeur du set
        for (Double d : set) {
            if (d > max) max = d;
        }
        System.out.println("max = " + max);

        // remise de l'itérateur au début du set
        it = set.iterator();

        // supprimer le plus petit élément
        // on le recherche
        double min = it.next(); // initialisation de max avec la première valeur du set
        for (Double d : set) {
            if (d < min) min = d;
        }
        // on le supprime
        set.remove(min);

        // affichage du set final
        System.out.println("set = " + set);
    }
}
