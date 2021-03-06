package fr.fichier;

public class Region implements Comparable<Region> {
    int regCodeRegion;
    String regNomRegion;
    int regPopulation;

    public Region(int regCodeRegion, String regNomRegion, int regPopulation) {
        this.regCodeRegion = regCodeRegion;
        this.regNomRegion = regNomRegion;
        this.regPopulation = regPopulation;
    }


    @Override
    public String toString() {
        return "Region{" +
                "regCodeRegion=" + regCodeRegion +
                ", regNomRegion='" + regNomRegion + '\'' +
                ", regPopulation=" + regPopulation +
                '}' + "\n";
    }


    // tri en ordre décroissant
    @Override
    public int compareTo(Region o) {
        return o.regPopulation- this.regPopulation;
    }
}
