package fr.diginamic.banque.banque;

import fr.diginamic.banque.entities.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte monCompte = new Compte("123z", 1000);
        System.out.println("Mon compte: " + monCompte); // affichage de l'adresse du compte, mais pas de son contenu
    }
}
