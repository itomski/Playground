package de.provinzial;

import net.bytebuddy.asm.Advice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeTest {

    public static void main(String[] args) {

        LocalDate heute = LocalDate.now();
        //heute = LocalDate.of(2000, 11, 30);
        System.out.println(heute);

        LocalTime jetzt = LocalTime.now();
        jetzt = LocalTime.of(17,22);
        System.out.println(jetzt);

        LocalDateTime heuteUndJetzt = LocalDateTime.now();
        heuteUndJetzt = LocalDateTime.of(heute, jetzt);
        // heuteUndJetzt = LocalDateTime.of(2000, 11, 30, 16, 19);
        System.out.println(heuteUndJetzt);

        final DateTimeFormatter FMT_DATE = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        final DateTimeFormatter FMT_TIME = DateTimeFormatter.ofPattern("HH:mm");
        final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        Locale.setDefault(Locale.GERMANY); // Verändert die Systemsprache für das JRE auf deutsch

        System.out.println(heute.format(FMT_DATE));
        System.out.println(jetzt.format(FMT_TIME));
        System.out.println(heuteUndJetzt.format(FMT));

        LocalDate date1 = LocalDate.parse("17.05.2025", FMT_DATE);
        // LocalDate date1 = LocalDate.parse("2025-05-17");
        System.out.println(date1);
        System.out.println(date1.getYear());
        System.out.println(date1.getMonth());
        System.out.println(date1.getDayOfMonth());

        LocalDate date2 = date1.plusWeeks(1);
        System.out.println(date2);

    }
}
