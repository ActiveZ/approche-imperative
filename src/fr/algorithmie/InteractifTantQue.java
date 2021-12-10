/**
 * Diginamic TP 04
 * 9/12/2021
 * openjdk 17.0.1
 * Arnaud Couturier
 */

package fr.algorithmie;

import java.util.Scanner;

// test valeur numérique avec regex
public class InteractifTantQue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String val; // valeur à tester
        do {
            System.out.println("Entrez un nombre entre 1 et 10");
            val = sc.nextLine();
        } while (!val.matches("[1-9]|10"));
        System.out.println("Valeur correcte: " + val);
    }
}
