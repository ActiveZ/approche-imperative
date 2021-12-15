package fr.sets;

public class Pays implements Comparable<Pays> {
    String nom;
    long nbHabitants;
    int pibHab;

    public Pays(String nom, long nbHabitants, int pibHab) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.pibHab = pibHab;
    }


    @Override
    public int compareTo(Pays o) {
        return 0;
    }


    @Override
    public String toString() {
        return "Pays{" +
                "nom='" + nom + '\'' +
                ", nbHabitants=" + nbHabitants +
                ", pib/habitant=" + pibHab +
                "}\n";
    }
}
