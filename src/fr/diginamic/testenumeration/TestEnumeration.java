package fr.diginamic.testenumeration;

public class TestEnumeration {
    public static void main(String[] args) {

        // affichage de toutes les saisons
        for (Saison saison : Saison.values()) {
            System.out.println("saison = " + saison.toString());
        }

        Saison ete = Saison.ETE;
        System.out.println("ete = " + ete);

        String libelle = "Hiver";

    }
}
