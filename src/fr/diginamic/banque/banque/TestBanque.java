package fr.diginamic.banque.banque;

import fr.diginamic.banque.entities.Compte;
import fr.diginamic.banque.entities.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte[] arrCompte = new Compte[2]; // tableau des comptes

        Compte monCompte = new Compte("123z", 1000);
        CompteTaux monCompteTaux = new CompteTaux("456a", 2000, 0.05);

        arrCompte[0] = monCompte;
        arrCompte[1] = monCompteTaux;

        for (int i = 0; i < arrCompte.length; i++) {
            System.out.println("Mon compte: " + arrCompte[i].toString());
        }
    }
}
