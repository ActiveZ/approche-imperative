package fr.diginamic.chaines;

import fr.diginamic.banque.entities.Salarie;

import java.util.Arrays;

public class ManipulationChaine {
    public static void main(String[] args) {
        String chaine = "Durand;Marcel;2 523.5";

        char premierCaractere = chaine.charAt(0);

        System.out.println("Premier caractère: " + premierCaractere);

        System.out.println("Longueur de la chaine de caractères: " + chaine.length());

        System.out.println("Index du 1er ;: " + chaine.indexOf(";"));

        System.out.println("Nom de famille: " + chaine.substring(0, chaine.indexOf(";")));
        System.out.println("Nom de famille: " + chaine.substring(0, chaine.indexOf(";")).toUpperCase());
        System.out.println("Nom de famille: " + chaine.substring(0, chaine.indexOf(";")).toLowerCase());

        String[] arr = chaine.split(";");
        System.out.println("Tableau split: " + Arrays.toString(arr));

        Salarie salarie =   new Salarie(arr[0], arr[1], Double.parseDouble(arr[2].replaceAll("\\s","")));

    }
}
