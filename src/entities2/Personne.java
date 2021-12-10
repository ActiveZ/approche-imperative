package entities2;

import entities.AdressePostale;

public class Personne {
    public String fname;
    public String lname;
    public AdressePostale address;

    public Personne(String nom, String prenom, int numero, String nomVoie, String codePostal, String ville) {
        fname = prenom;
        lname = nom;
        address = new AdressePostale(numero, nomVoie, codePostal, ville);
    }

    public void showName() {
        System.out.println("Je m'appelle " + fname.toUpperCase() + " " + lname.toUpperCase());
    }

    // setters
    public void setFname(String newFname) {
        fname = newFname;
    }

    public void setLname(String newLname) {
        lname = newLname;
    }

    public void setAddress(int numero, String rue, String codePostal, String ville) {
        address.numberRoad = numero;
        address.nameRoad = rue;
        address.postCode = codePostal;
        address.city = ville;
    }

    // getters
    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getAddress() {
        String txt = address.numberRoad + " " + address.nameRoad + " " + address.postCode + " " + address.city;
        return txt;
    }
}