package fr.tri;

import fr.listes.Ville;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {

    @Override
    public int compare(Ville o1, Ville o2) {
       return o1.nbHabitants - o2.nbHabitants;
    }
}
