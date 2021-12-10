package entities;

import entities2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        // instanciation de la 1ère personne
        Personne p1 = new Personne();
        p1.fname = "prénom1";
        p1.lname = "nomFamille1";
        p1.address.numberRoad = 1;
        p1.address.nameRoad = "rue de la paix";
        p1.address.city = "Paris";
        p1.address.postCode = "75000";

        // instanciation de la 2ème seconde personne
//        Personne p2 = new Personne();
//        p2.fname = "prénom2";
//        p2.lname = "nomFamille2";
//        p2.address.numberRoad = 2;
//        p2.address.nameRoad = "Boulevard Matignon";
//        p2.address.city = "Paris";
//        p2.address.postCode = "75000";

        // instanciation avec constructeur complet
        Personne p3 = new Personne();
    }
}

// Commentaire: l'instanciation d'une personne gagnerait à être dans un constructeur pour diminuer le nombre de ligne de code

// commentaire 2 : constructeur => beaucoup mieux adaptée