import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // System.out.println(LocalDate.now());
        // System.out.println(LocalTime.now());
        // System.out.println(LocalDateTime.now());
        // System.out.println(ZonedDateTime.now());

        // LocalDate date1 = LocalDate.of(1000, Month.JANUARY, 20);
        // LocalDate date2 = LocalDate.of(2015, 3, 20);

        // System.out.println(date1 + " " + date2);

        // LocalTime time1 = LocalTime.of(6, 15); // ora și minuta
        // LocalTime time2 = LocalTime.of(6, 15, 33); // + secunde
        // LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanosecunde

        // System.out.println(time1 + " " + time2 + " " + time3);

        // LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15);
        // LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
        // ZoneId zone = ZoneId.of("US/Eastern");
        // ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime2, zone);

        // System.out.println(zonedDateTime);

        // System.out.println(ZonedDateTime.now(zone));

        // for (String ids : ZoneId.getAvailableZoneIds()) {
        //     System.out.println(ids);
        // }

        // ZoneId zone = ZoneId.of("Europe/Chisinau");
        // System.out.println(ZonedDateTime.now(zone));

        // LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
        // System.out.println(date); // 2014–01–20
        // date = date.plusDays(2);
        // System.out.println(date); // 2014–01–22
        // date = date.plusWeeks(1);
        // System.out.println(date); // 2014–01–29
        // date = date.plusMonths(1);
        // System.out.println(date); // 2014–02–28
        // LocalDate badDate = date.plusDays(365 * 5);
        // System.out.println(badDate);
        // date = date.plusYears(5);
        // System.out.println(date);

        LocalDate date = LocalDate.of(2014, Month.JANUARY, 20)
            .plusDays(2)
            .plusWeeks(1)
            .minusDays(2)
            .plusMonths(1)
            .plusYears(5);

        // System.out.println(date);

        // LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        // System.out.println(date);
        // date.plusDays(10);
        // System.out.println(date);
        // LocalDateTime now = LocalDateTime.now();
        // System.out.println(now);
        // DateTimeFormatter europeanFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // String formattedDate = now.format(europeanFormatter);

        // System.out.println("European time format: " + formattedDate);

        // String europeanDate = "06-11-2024 09:19:39";
        // LocalDateTime dateTime = LocalDateTime.parse(europeanDate, europeanFormatter);
        // System.out.println("Parsed LocalDateTime: " + dateTime);
    }
}