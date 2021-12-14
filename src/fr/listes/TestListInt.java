package fr.listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestListInt {
    public static void main(String[] args) {
        // initialisation de la liste
        List<Integer> list = new ArrayList<>(
                List.of(-1, 5, 7, 3, -2, 4, 8, 5));

        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());

        // min et max de la liste après tri
        Collections.sort(list);
        System.out.println("max = " + list.get(0) + " min = " + list.get(list.size() - 1));

        // suppression des extrémités
        list.remove(0);
        list.remove(list.size() - 1);
        System.out.println("list = " + list);

        //passage en valeur positive des éléments négatifs
        for (Integer i : list) {
            if (i < 0) {
                list.set(list.indexOf(i), -i);
            }
        }
        System.out.println("list = " + list);
    }
}
