import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        
        String dateTimeString = "2023-03-01T13:00:00Z";
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(dateTimeString, DateTimeFormatter.ISO_ZONED_DATE_TIME);

        int year = zonedDateTime.getYear();

        int month = zonedDateTime.getMonthValue();

        int day = zonedDateTime.getDayOfMonth();

        DayOfWeek dayOfWeek = zonedDateTime.getDayOfWeek();

        System.out.println("Anno: " + year);
        System.out.println("Mese: " + month);
        System.out.println("Giorno: " + day);
        System.out.println("Giorno della settimana: " + dayOfWeek);
    }
}