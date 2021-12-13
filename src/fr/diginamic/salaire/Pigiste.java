package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
    int joursTravailles;
    double salaireJournalier;

    public Pigiste(String nom, String prenom, int joursTravailles, double salaireJournalier) {
        super(nom, prenom);
        this.joursTravailles = joursTravailles;
        this.salaireJournalier = salaireJournalier;
    }

    @Override
    public double getSalaire() {
        return joursTravailles * salaireJournalier;
    }

    @Override
    public String afficherDonnees() {
        return "Nom: " + nom + " Prénom: " + prenom + " Salaire: " + getSalaire() + " Statut: pigiste";
    }
}
