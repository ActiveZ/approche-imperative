package fr.listes;

import java.util.ArrayList;

public class CreationListe {
    public static void main(String[] args) {

        // arraylist d'entiers de 1 à 100
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < 101; i++) {
            list.add(i);
        }
        System.out.println("list.size() = " + list.size());
    }
}
