package fr.fichier;

import java.util.Comparator;

public class compFrance implements Comparator<Data> {

    // tri de la population en ordre décroissant
    @Override
    public int compare(Data o1, Data o2) {
        return o2.population - o1.population;
    }
}
