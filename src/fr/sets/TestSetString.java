package fr.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class TestSetString {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(List.of("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"));

        // affichage set
        System.out.println("set = " + set);

        // Recherche et suppression du pays avec le plus grand nombre de lettres
        // création d'un itérateur
        Iterator<String> it = set.iterator();

        // recherche du pays
        String pays = "";
        for (String p : set) {
            if (p.length() > pays.length()) pays = p;
        }

        // suppression de la ville du set
        set.remove(pays);

        // affichage du set nettoyé
        System.out.println("set = " + set);
    }
}
