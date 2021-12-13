package fr.diginamic.essais;

import fr.diginamic.banque.entities.Theatre;

public class TestTheatre {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Kraporoy", 50, 30, 300);
        theatre.inscrire(7, 10);
        theatre.inscrire(8, 10);
        theatre.inscrire(10, 10);
        System.out.println("Total clients inscrits: " + theatre.getInscrits());
        System.out.println("Total recette: " + theatre.getRecette());
    }
}
