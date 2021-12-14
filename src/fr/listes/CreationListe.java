package fr.listes;

import java.util.ArrayList;
import java.util.List;

public class CreationListe {
    public static void main(String[] args) {

        // arraylist d'entiers de 1 à 100
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            list.add(i);
        }
        System.out.println("list.size() = " + list.size());
    }
}
