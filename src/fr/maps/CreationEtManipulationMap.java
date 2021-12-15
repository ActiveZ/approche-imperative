package fr.maps;

import java.util.HashMap;

public class CreationEtManipulationMap {
    public static void main(String args[]) {
        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");

        // itération sur clés
        for (int i : mapVilles.keySet()) {
            System.out.println("Departement = " + i);
        }

        // itération sur valeurs
        for (String s : mapVilles.values()) {
            System.out.println("Nom = " + s);
        }

        mapVilles.put(59, "Lille");
        mapVilles.put(69, "Lyon");
        mapVilles.put(33, "Bordeaux");


        System.out.println("mapVilles.size() = " + mapVilles.size());
    }
}
