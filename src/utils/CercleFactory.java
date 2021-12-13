package utils;

import fr.diginamic.banque.entities.Cercle;

public class CercleFactory {

    public static Cercle CreateCircle(double rayon) {
        return new Cercle(rayon);
    }
}
