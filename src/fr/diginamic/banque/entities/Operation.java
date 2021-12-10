package fr.diginamic.banque.entities;

public abstract class Operation {
    String dateOp;
    double amountOp;

    Operation(String date, double montant) {
        dateOp = date;
        amountOp = montant;
    }

    public abstract void operation();

    public abstract String getType();
}
