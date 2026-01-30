import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // How to work with DATES & TIMES using Java
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        //UTC
        
        Instant instant = Instant.now();

        System.out.println(instant);

        // Custom format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = localDateTime.format(formatter);
        System.out.println(newDateTime);

        localDate = LocalDate.of(2025, 12, 24);
        
        LocalDateTime localDateTime1 = LocalDateTime.of(2025, 12, 24, 22, 0, 0);
        LocalDateTime localDateTime2 = LocalDateTime.of(2026, 1, 1, 0, 0, 0);

        System.out.println(localDate);
        System.out.println(localDateTime1);
        System.out.println(localDateTime2);

        if (localDateTime1.isBefore(localDateTime2)) {
            System.out.println(localDateTime1 + " es antes que " + localDateTime2);
        } else if (localDateTime1.isAfter(localDateTime2)) {
            System.out.println(localDateTime1 + " es después que " + localDateTime2);
        } else if (localDateTime1.isEqual(localDateTime2)) {
            System.out.println(localDateTime1 + " es igual que " + localDateTime2);
        }
    }
}
