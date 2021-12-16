package fr.diginamic.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {

        //////// VERSION STRINGBUILDER //////////
        long debut = System.currentTimeMillis();

        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < 100001; i++) {
            builder.append(i);
        }

        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (fin - debut));


        //////////////// VERSION STRING /////////////
        long debut2 = System.currentTimeMillis();

        String s = "";
        for (int i = 1; i < 100001; i++) {
            s += i;
        }

        long fin2 = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (fin2 - debut2));
    }
}
