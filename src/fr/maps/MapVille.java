package fr.maps;

import java.util.Collections;
import java.util.HashMap;

public class MapVille {
    public static void main(String[] args) {
        HashMap<String, Integer> ville = new HashMap<>();
        ville.put("Nice", 343000);
        ville.put("Carcassonne", 47800);
        ville.put("Narbonne", 53400);
        ville.put("Lyon", 484000);
        ville.put("Foix", 9700);
        ville.put("Pau", 77200);
        ville.put("Marseille", 850700);
        ville.put("Tarbe", 40600);


        // Recherchez et supprimez la ville qui a le moins d’habitants
        String key;
        // le plus petit nombre d'habitant
        int nbHabMin = Collections.min(ville.values());

        for (String k : ville.keySet()) {
            if (ville.get(k) == nbHabMin) {
                // System.out.println("ville avec le plus petit nombre d'habitants: " + k);
                ville.remove(k);
                break; // pas la peine de continuer à parcourir la map
            }
        }
        System.out.println("ville = " + ville);
    }
}
