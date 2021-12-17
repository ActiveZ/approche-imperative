package fr.fichier;

public class Departement implements Comparable<Departement>{
    String deptCode;
    //String nom;
    int deptPopulation;

    public Departement(String dept, int population) {
        this.deptCode = dept;
        this.deptPopulation = population;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "dept='" + deptCode + '\'' +
                ", population=" + deptPopulation +
                '}' + "\n";
    }

    // tri en ordre décroissant
    @Override
    public int compareTo(Departement o) {
        return o.deptPopulation - this.deptPopulation;
    }
}
