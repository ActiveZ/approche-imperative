package entities;

import entities2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne p = new Personne("nom1", "prénom1", 1, "rue de la Paix", "75000", "Paris");
        p.showName();
        p.setLname("nouveauNom");
        p.showName();

        System.out.println(p.getAddress());
    }
}