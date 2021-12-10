package fr.diginamic.banque.entities;

import utils.ObjetGeometrique;

public class Rectangle implements ObjetGeometrique {
    double longueur;
    double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double perimetre() {
        return largeur * 2 + longueur * 2;
    }

    @Override
    public double surface() {
        return largeur * longueur;
    }
}
