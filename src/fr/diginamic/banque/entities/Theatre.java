package fr.diginamic.banque.entities;

public class Theatre {
    String nom;
    int capacite;
    int inscrits;
    float recette;

    public Theatre(String nom, int capacite, int inscrits, float recette) {
        this.nom = nom;
        this.capacite = capacite;
        this.inscrits = inscrits;
        this.recette = recette;
    }

    public void inscrire(int nbClient, float prixPlace) {
        if (nbClient + inscrits > capacite) {
            System.out.println("ERREUR: Capacité maximum dépassée !");
        } else {
            inscrits += nbClient;
            recette += prixPlace * nbClient;
        }
    }

    // getters - setters

    public int getInscrits() {
        return inscrits;
    }

    public float getRecette() {
        return recette;
    }
}
