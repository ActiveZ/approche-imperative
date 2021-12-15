package fr.listes;

public class Ville implements Comparable<Ville> {
    String nom;
    int nbHabitants;

    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }


    // tri par ordre décroissant de nombre d'habitants
//    @Override
//    public int compareTo(Ville o) {
//        return o.nbHabitants - nbHabitants;
//    }


    // tri par ordre de nom de ville a -> z
    @Override
    public int compareTo(Ville o) {
        return this.nom.compareTo(o.nom);
    }


    @Override
    public String toString() {
        return "Ville{nom=" + nom + ", nbHabitants=" + nbHabitants + "}\n";
    }
}