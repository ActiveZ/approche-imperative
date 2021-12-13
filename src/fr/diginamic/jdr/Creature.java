package fr.diginamic.jdr;

import static fr.diginamic.jdr.Utils.dice;

public abstract class Creature {
    int force;
    int pointDeVie;
    String type;
    int scoreValue; // valeur que rapporte de tuer le monstre


    public Creature(int force, int pointDeVie, String type, int scoreValue) {
        this.force = force;
        this.pointDeVie = pointDeVie;
        this.type = type;
        this.scoreValue = scoreValue;
    }


    public void attaque(Creature c) {
        // dégats = attaque héro - attaque monstre
        int degats = force + dice(1, 10) - (c.force + dice(1, 10));
        // si dégats > 0 le joueur gagne
        if (degats > 0) {
            System.out.println("Héro inflige " + degats + " points de dégats au " + c.type + " !");
            c.setPointDeVie(degats);
        } else if (degats < 0) {
            degats = -degats;
            System.out.println("Le " + c.type + " tape sur le héros pour " + degats + " points de dégats ! (Ouille)");
            setPointDeVie(degats);
        } else System.out.println("Les deux combattants esquivent leurs coups mutuellement ... ");
    }


    public boolean estVivant() {
        return pointDeVie > 0;
    }


    // ajuste les points de vie selon les dégats
    public void setPointDeVie(int degats) {
        this.pointDeVie -= degats;
        System.out.println(estVivant() ? "Il reste " + pointDeVie + " points de vie au " + type : "Le " + type + " est mort !!!");
    }


    @Override
    public String toString() {
        return type + " (force: " + force + ", points de vie: " + pointDeVie + ")";
    }
}
