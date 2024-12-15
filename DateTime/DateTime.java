package DateTime;

import java.time.LocalDate;

public class DateTime {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        var startDate = today.minusDays(6);
        System.out.println(startDate);
    }
}
