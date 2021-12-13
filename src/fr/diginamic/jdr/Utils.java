package fr.diginamic.jdr;

import java.util.Random;

public class Utils {

    // lance un dé et retourne une valeur entre les deux bornes incluses
    public static int dice(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }


    // création des monstres
    public static Creature monstreFactory() {
        Creature monstre = switch (dice(1, 3)) {
            case 1 -> new Loup();
            case 2 -> new Gobelin();
            case 3 -> new Troll();
            default -> null;
        };
        return monstre;
    }
}
