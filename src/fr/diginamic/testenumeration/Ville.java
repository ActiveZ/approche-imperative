package fr.diginamic.testenumeration;

import java.util.Objects;

public class Ville implements Comparable<Ville> {
    public String nom;
    public int nbHabitants;
    Continent continent;

    public Ville(String nom, int nbHabitants, Continent continent) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.continent = continent;
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
        return "Ville{nom=" + nom +
                ", nbHabitants=" + nbHabitants +
                ", continent=" + continent +
                "}\n";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ville ville = (Ville) o;
        return nbHabitants == ville.nbHabitants && Objects.equals(nom, ville.nom);
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }
}