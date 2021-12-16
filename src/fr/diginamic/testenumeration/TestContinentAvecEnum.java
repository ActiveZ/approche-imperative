package fr.diginamic.testenumeration;

import java.util.ArrayList;
import java.util.List;

public class TestContinentAvecEnum {
    public static void main(String[] args) {

        List<Ville> liste = new ArrayList<>(
                List.of(
                        new Ville("Paris", 343000, Continent.EUROPE),
                        new Ville("New York", 47800, Continent.AMERIQUE),
                        new Ville("Pekin", 53400, Continent.ASIE),
                        new Ville("Sidney", 484000, Continent.OCEANIE)
                )
        );

        // liste des villes avec leur continent respectif
        for (Ville v : liste) {
            System.out.println("ville = " + v);
        }
    }
}
