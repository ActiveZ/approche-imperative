package fr.diginamic.testexceptions;

import fr.listes.Ville;

import static fr.diginamic.testexceptions.ReflectionUtils.afficherAttributs;

public class TestReflectionUtils {
    public static void main(String[] args) throws IllegalAccessException {
        Ville ville = new Ville("Nantes", 325748);

        afficherAttributs(ville);

        //afficherAttributs(null);
    }


}
