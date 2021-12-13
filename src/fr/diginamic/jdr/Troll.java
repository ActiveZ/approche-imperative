package fr.diginamic.jdr;

import static fr.diginamic.jdr.Utils.dice;

public class Troll extends Creature {

    public Troll() {
        super(dice(10, 15), dice(20, 30), "troll", 5);
    }
}
