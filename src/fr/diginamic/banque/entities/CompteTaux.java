package fr.diginamic.banque.entities;

public class CompteTaux extends Compte {
    double taux;

    public CompteTaux(String numero, float solde, double taux) {
        super(numero, solde);
        this.taux = taux;
    }

    @Override
    public String toString() {
        return "CompteTaux{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountValue=" + accountValue +
                ", taux=" + taux +
                '}';
    }
}
