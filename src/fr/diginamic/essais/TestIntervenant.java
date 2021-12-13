package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {
    public static void main(String[] args) {
        Salarie salarie = new Salarie("salarié_1", "Prénom_1",2000);
        System.out.println("salarie.getSalaire() = " + salarie.getSalaire());
        System.out.println("salarie.afficherDonnees() = " + salarie.afficherDonnees());

        Pigiste pigiste = new Pigiste("Pigiste_1", "Prémon_2",10, 80);
        System.out.println("pigiste.getSalaire() = " + pigiste.getSalaire());
        System.out.println("pigiste.afficherDonnees() = " + pigiste.afficherDonnees());
    }
}
