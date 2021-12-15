package fr.tri;

import fr.listes.Ville;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestVille {
    public static void main(String[] args) {
        List<Ville> liste = new ArrayList<>(
                //List<Ville> liste = new ArrayList<>(
                List.of(
                        new Ville("Nice", 343000),
                        new Ville("Carcassonne", 47800),
                        new Ville("Narbonne", 53400),
                        new Ville("Lyon", 484000),
                        new Ville("Foix", 9700),
                        new Ville("Pau", 77200),
                        new Ville("Marseille", 850700),
                        new Ville("Tarbes", 40600))
        );

        // villes triées parn nom a -> z
        Collections.sort(liste);
        System.out.println("liste = " + liste);


        // tri des villes par nombre d'habitants => changé l'implémentation de compareTo dans la classe ville
        Collections.sort(liste);
        System.out.println("liste = " + liste);
    }
}
