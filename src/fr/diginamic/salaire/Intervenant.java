package fr.diginamic.salaire;

public abstract class Intervenant {
    String nom;
    String prenom;

    public Intervenant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    abstract double getSalaire();

    abstract String afficherDonnees();
}
