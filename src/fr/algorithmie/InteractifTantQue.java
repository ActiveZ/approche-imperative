/**
 * Diginamic TP 04
 * 9/12/2021
 * openjdk 17.0.1
 * Arnaud Couturier
 */

package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre entre 1 et 10");
        String val = sc.nextLine();
        System.out.println("Value: " + val);
    }
}
