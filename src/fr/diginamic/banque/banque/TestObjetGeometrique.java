package fr.diginamic.banque.banque;

import fr.diginamic.banque.entities.Cercle;
import fr.diginamic.banque.entities.Rectangle;
import utils.ObjetGeometrique;

public class TestObjetGeometrique {
    public static void main(String[] args) {
        ObjetGeometrique[] arrObjets = new ObjetGeometrique[2];

        Cercle monCercle = new Cercle(1);
        Rectangle monRectangle = new Rectangle(2, 5);

        arrObjets[0] = monCercle;
        arrObjets[1] = monRectangle;

        for (ObjetGeometrique obj : arrObjets) {
            System.out.println("Périmètre = " + obj.perimetre());
            System.out.println("Surface = " + obj.surface());
        }
    }

}
