package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
    double[] arr;

    public CalculMoyenne(double[] arr) {
        this.arr = arr;
    }

    // ajout d'un nouvel élément par agrandissement du tableau
    public void ajout(double val) {
        int n = arr.length;
        double newArr[] = new double[n + 1];
        for (int i = 0; i < n; i++) {
            newArr[i] = arr[i];
        }
        newArr[n] = val;
        arr = newArr;
    }

    // calcul de la moyenne du tableau
    public double moyenne() {
        return Arrays.stream(arr).average().orElse(Double.NaN);
    }
}
