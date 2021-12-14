package fr.listes;

public class Ville implements Comparable<Ville> {
    String nom;
    int nbHabitants;

    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }


    // tri par ordre décroissant
    @Override
    public int compareTo(Ville o) {
        return o.nbHabitants - nbHabitants;
    }


    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", nbHabitants=" + nbHabitants +
                '}';
    }
}