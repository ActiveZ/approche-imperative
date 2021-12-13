package fr.diginamic.jdr;

import static fr.diginamic.jdr.Utils.dice;

public class Loup extends Creature {

    public Loup() {
        super(dice(3, 8), dice(5, 10), "loup", 1);
    }


}
