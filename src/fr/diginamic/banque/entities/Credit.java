package fr.diginamic.banque.entities;

public class Credit extends Operation {

    Credit(String date, double montant) {
        super(date, montant);
    }

    @Override
    public void operation() {

    }

    @Override
    public String getType() {
        return "CREDIT";
    }
}
