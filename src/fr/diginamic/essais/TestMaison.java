package fr.diginamic.essais;

import fr.diginamic.maison.*;

import java.util.Scanner;

public class TestMaison {
    public static void main(String[] args) {
        // construction maison
        Maison maison = new Maison();
        // rdc
        maison.ajouterPiece(new Cuisine(40, 0));
        maison.ajouterPiece(new Salon(80, 0));
        // 1er étage
        maison.ajouterPiece(new Chambre(30, 1));
        maison.ajouterPiece(new Chambre(40, 1));
        maison.ajouterPiece(new SalleDeBain(20, 1));
        maison.ajouterPiece(new WC(10, 1));
        // 2ème étage
        maison.ajouterPiece(new Chambre(20, 2));


        maison.ajouterPiece(null); // => provoque exception => test cohérence données


        // calculs superficies
        System.out.println("Superficie rdc: " + maison.superficie(0));
        System.out.println("Superficie 1er étage: " + maison.superficie(1));
        System.out.println("Superficie 2eme étage: " + maison.superficie(2));
        System.out.println("Superficie totale: " + maison.superficie());


        // calcul de superficie par type de pièce
        Scanner sc = new Scanner(System.in);
        // définir le type de pièce
        String s;
        do {
            System.out.println("Calcul de superficie selon type de pièce: 0: salon, 1: cuisine, 2: chambre, 3: salle de bain, 4: wc");
            s = sc.nextLine();
        } while (!s.matches("[0-4]"));
        System.out.println("Superficie totale pour ces pièces: " + maison.superficiePieces(Integer.parseInt(s)));
        System.out.println("nombre de pièces concernées: " + maison.sommeTypePiece(Integer.parseInt(s)));
    }
}
