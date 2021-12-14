package fr.listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class TestListeString {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>(
                List.of("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes")
        );

        // ville avec le plus grand nombre de lettres
        String result = "";
        for (String v : liste) {
            if (v.length() > result.length()) result = v;
        }
        System.out.println("result = " + result);

        // mise en majuscule avec for each
        for (String v : liste) {
            liste.set(liste.indexOf(v), v.toUpperCase(Locale.ROOT));
        }

        // suppression des villes commençant par "N"
        liste.removeIf(v -> v.charAt(0) == 'N');

        // affichage du résultat
        System.out.println("liste = " + liste);
    }
}
