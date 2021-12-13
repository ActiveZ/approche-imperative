package fr.diginamic.essais;

import fr.diginamic.banque.entities.Cercle;

import static utils.CercleFactory.CreateCircle;

public class TestCercle {

    public static void main(String[] args) {
        Cercle c1 = new Cercle(1);
        Cercle c2 = new Cercle(2);

        System.out.println("périmètre c1 = " + c1.perimetre());
        System.out.println("surface c1 = " + c1.surface());

        System.out.println("périmètre c2 = " + c2.perimetre());
        System.out.println("surface c2 = " + c2.surface());

        Cercle c3 = CreateCircle(3);
        System.out.println("périmètre c3 = " + c3.perimetre());
        System.out.println("surface c3 = " + c3.surface());
    }
}
