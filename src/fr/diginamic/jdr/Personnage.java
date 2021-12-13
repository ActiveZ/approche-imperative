package fr.diginamic.jdr;

import static fr.diginamic.jdr.Utils.dice;

public class Personnage extends Creature {
    public int score;

    public Personnage() {
        super(dice(12, 18), dice(20, 50), "humain", 0);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
