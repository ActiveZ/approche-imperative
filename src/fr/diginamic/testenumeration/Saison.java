package fr.diginamic.testenumeration;

public enum Saison {
    PRINTEMPS("Printemps", 1),
    ETE("Eté, 2", 2),
    AUTOMNE("Automne", 3),
    HIVER("Hiver", 4);

    String libelle;
    int ordre;

    Saison(String libelle, int i) {
        this.libelle = libelle;
//        this.ordre = ordre;
    }

//    public Saison SaisirLibelle(String libelle) {
//        switch (libelle.toUpperCase()) {
//            case "PRINTEMPS":
//                return PRINTEMPS;
//            case "ETE":
//                return ETE;
//            case "AUTOMNE":
//                return AUTOMNE;
//            case "HIVER":
//                return HIVER;
//            default:
//                return null;
//        }
//    }

    @Override
    public String toString() {
        return "Saison{" +
                "libelle='" + libelle + '\'' +
                ", ordre=" + ordre +
                '}';
    }
}
