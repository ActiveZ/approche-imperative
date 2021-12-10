package entities2;

import entities.AdressePostale;

public class Personne {
    public String fname;
    public String lname;
    public AdressePostale address;

    public Personne() {
    }

//    Personne(String nom, String prenom) {
//        fname = prenom;
//        lname = nom;
//    }

    Personne(String nom, String prenom, int numero, String nomVoie, String codePostal, String ville) {
        fname = prenom;
        lname = nom;
        AdressePostale address = new AdressePostale(numero, nomVoie, codePostal, ville);
    }
}