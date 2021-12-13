package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {
    public static void main(String[] args) {
        Operations op = new Operations();
        System.out.println("2 + 3 = " + op.calcul(2, 3, '+'));
        System.out.println("5 - 2 = " + op.calcul(5, 2, '-'));
        System.out.println("6 x 3 = " + op.calcul(6, 3, '*'));
        System.out.println("6 / 2 = " + op.calcul(6, 2, '/'));
        System.out.println("6 / 0 = " + op.calcul(6, 0, '/'));
        System.out.println("7 a 3 = " + op.calcul(7, 3, 'a'));
    }
}
