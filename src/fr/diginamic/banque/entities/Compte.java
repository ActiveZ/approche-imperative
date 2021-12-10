package fr.diginamic.banque.entities;

public class Compte {
    String accountNumber;
    float accountValue;

    public Compte(String numero, float solde) {
        accountNumber = numero;
        accountValue = solde;
    }

    // surchage de la fonction toString
    @Override
    public String toString() {
        return "Compte{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountValue=" + accountValue +
                '}';
    }
}
