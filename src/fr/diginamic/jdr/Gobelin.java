package fr.diginamic.jdr;

import static fr.diginamic.jdr.Utils.dice;

public class Gobelin extends Creature {

    public Gobelin() {
        super(dice(5, 10), dice(10, 15), "gobelin", 2);
    }
}
