package fr.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;


public class TestPays {
    public static void main(String[] args) {
        HashSet<Pays> set = new HashSet<>(List.of(
                new Pays("usa", 332915000, 59495),
                new Pays("France", 65426000, 43551),
                new Pays("Allemagne", 83900000, 50206),
                new Pays("uk", 68207000, 43620),
                new Pays("Italie", 60367000, 37970),
                new Pays("Japon", 126051000, 42659),
                new Pays("Chine", 1444216000L, 16624), // ajouter L à la fin, sinon erreur integer
                new Pays("Russie", 145912000, 28712),
                new Pays("Inde", 1393409000, 5174)
        ));


        Pays pPibHabMax = set.stream().findFirst().get(); // initialisation avec le pays avec le plus grand pib/habitant
        Pays pPibTotalMax = set.stream().findFirst().get(); // initialisation avec le pays avec le pib total max
        Pays pPibTotalMin = set.stream().findFirst().get(); // initialisation avec la première valeur du set pour le pib total le plus petit

        // création d'un itérateur
        Iterator<Pays> it = set.iterator();
        for (Pays p : set) {
            if (p.pibHab > pPibHabMax.pibHab) pPibHabMax = p; // pays avec le plus grand pib/habitant
            if (p.pibHab * p.nbHabitants > pPibTotalMax.pibHab * pPibTotalMax.nbHabitants)
                pPibTotalMax = p; // pays avec le pib total max
            if (p.pibHab * p.nbHabitants < pPibTotalMin.pibHab * pPibTotalMin.nbHabitants)
                pPibTotalMin = p; // pays avec le pib total le plus petit
        }

        System.out.println("pays avec le plus grand pib/habitant = " + pPibHabMax);
        System.out.println("pays avec le pib total max = " + pPibTotalMax);

        // nom du pays avec le pib total le plus petit en majuscule
        set.remove(pPibTotalMin);
        pPibTotalMin.nom = pPibTotalMin.nom.toUpperCase(Locale.ROOT);
        set.add(pPibTotalMin);
        // System.out.println("set = " + set); // vérification du passage en majuscule

        // Suppression du pays dont le PIB total est le plus petit et affichage final
        set.remove(pPibTotalMin);
        System.out.println("set = " + set);
    }
}
