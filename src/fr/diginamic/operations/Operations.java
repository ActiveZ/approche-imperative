package fr.diginamic.operations;

public class Operations {

    public double calcul(double a, double b, char c) {
        double result = 0;

        switch (c) {
            case '+':
                result = a + b;
            break;
            case '-':
                result = a - b;
            break;
            case '*':
                result = a * b;
            break;
            case '/':
                if (b != 0) result = a / b;
                else System.out.println("ERREUR ! : Division par 0");
                break;
            default:
                System.out.println("ERREUR ! : opérateur inconnu: " + c);
        }
        return result;
    }
}
