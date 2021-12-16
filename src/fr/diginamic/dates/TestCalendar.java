package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2016);
        cal.set(Calendar.MONTH, 4); // index 0pour janvier
        cal.set(Calendar.DAY_OF_MONTH, 19);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 30);

        Date date = cal.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("d MMMM yyyy 'à' HH'h'mm 'et' ss 'secondes'");
        System.out.println(sdf.format(date));

        sdf = new SimpleDateFormat("d MMMM yyyy 'à' HH'h'mm 'et' ss 'secondes'", Locale.CHINESE);
        System.out.println(sdf.format(date));


        //sdf = new SimpleDateFormat("d MMMM yyyy 'à' HH'h'mm 'et' ss 'secondes'", Locale.); // pas de russe ?
        //System.out.println(sdf.format(date));

    }
}
