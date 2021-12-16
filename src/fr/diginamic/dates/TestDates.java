package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TestDates {
    public static void main(String[] args) {

        // old
        SimpleDateFormat sdf = new SimpleDateFormat("d/M/yyyy 'à' hh:mm:ss");
        System.out.println(sdf.format(new Date()));
        // Créez une instance de la classe Date à la date du 19/05/2016 à 23 :59 :30 secondes
        Date date = new Date(2016 - 1900, 4, 16);
        System.out.println(sdf.format(date)); // ingérable !


        //
    }
}
