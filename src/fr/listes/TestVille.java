package fr.listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class TestVille {
    public static void main(String[] args) {
        List<Ville> liste = new ArrayList<>(
                List.of(
                        new Ville("Nice", 343000),
                        new Ville("Carcassonne", 47800),
                        new Ville("Narbonne", 53400),
                        new Ville("Lyon", 484000),
                        new Ville("Foix", 9700),
                        new Ville("Pau", 77200),
                        new Ville("Marseille", 850700),
                        new Ville("Tarbe", 40600))
        );

        // ville la plus peuplée
        Collections.sort(liste);
        System.out.println("Ville la plus peuplée: " + liste.get(0).nom);

        // suppression de la ville la moins peuplée
        liste.remove(liste.size() - 1);

        // ville de plus de 100 000 habitants en majuscules
        for (Ville v : liste) {
            if (v.nbHabitants > 100000) {
                v.nom = v.nom.toUpperCase(Locale.ROOT);
            }
        }

        //affichage final
        System.out.println("liste.toString() = " + liste);
    }
}