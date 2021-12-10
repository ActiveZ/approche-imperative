package fr.diginamic.banque.entities;

public class Compte {
    String accountNumber;
    float accountValue;

    public Compte(String numero, float solde) {
        accountNumber = numero;
        accountValue = solde;
    }
}
