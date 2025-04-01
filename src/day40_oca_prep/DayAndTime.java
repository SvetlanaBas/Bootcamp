package day40_oca_prep;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class DayAndTime {
    public static void main(String[] args) {
        localDateAndTimePractice();
        dateTimeFormatterPractice();
        task1();
        periodPractice();
        durationPractice();

        instantPractice();
        printAllAvailableTimeZones();
        zonedDateTimePractice();

        exOfParsing();

        task2();
        task3();
    }

    public static void localDateAndTimePractice() {
        LocalDate localDate = LocalDate.now();
        LocalDate date2 = LocalDate.of(2025, 12, 13);
        LocalDate newDate = localDate.plusWeeks(4);
        LocalDate newDate2 = localDate.plusDays(10);
        LocalDate newDate3 = localDate.minusYears(20);
        System.out.println(localDate);
        System.out.println(date2);
        System.out.println(newDate);
        System.out.println(newDate2);
        System.out.println(newDate3);
        System.out.println("localDate.getDayOfMonth() = " + localDate.getDayOfMonth());
        System.out.println("localDate.getDayOfYear() = " + localDate.getDayOfYear());
        System.out.println("localDate.getDayOfWeek() = " + localDate.getDayOfWeek());


        LocalTime localTime = LocalTime.now();
        LocalTime time2 = LocalTime.of(23, 23, 23);
        if (time2.getHour() > 12) {
            int hour = time2.getHour();
            int result = hour - 12;
            System.out.println(result + ":" + time2.getMinute() + " PM");
        }
        LocalTime time3 = time2.plusHours(10);
        LocalTime time4 = time2.plusMinutes(20);
        LocalTime time5 = time2.minusMinutes(23);
        System.out.println(time2);
        System.out.println(localTime);
        System.out.println("time3 = " + time3);
        System.out.println("time4 = " + time4);
        System.out.println("time5 = " + time5);
        System.out.println("localTime.getHour() = " + localTime.getHour());
        System.out.println("localTime.getMinute() = " + localTime.getMinute());
    }

    public static void dateTimeFormatterPractice() {
        LocalDateTime localDateTime = LocalDateTime.now();
        // 2025-03-31T09:26:49.008160
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss  MM/dd/yyyy");
        String formattedDateAndTime = localDateTime.format(formatter);
        System.out.println("formattedDateAndTime = " + formattedDateAndTime);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MMM dd, yyyy, HH:mm");
        System.out.println(localDateTime.format(formatter2));

    }

    public static void task1() {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter task1 = DateTimeFormatter.ofPattern("dd/MM, yyyy HH-mm-ss");
        String formattedDateAndTime = localDateTime.format(task1);
        System.out.println(formattedDateAndTime);
    }

    public static void periodPractice() {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2022, 10, 13);

        Period period = Period.between(date2, date1);
        System.out.println("period.getDays() = " + period.getDays());
        System.out.println("period.getMonths() = " + period.getMonths());
        System.out.println("period.getYears() = " + period.getYears());
    }

    public static void durationPractice() {
        LocalTime time1 = LocalTime.now();
        LocalTime time2 = LocalTime.of(22, 10, 50);

        Duration duration = Duration.between(time1, time2);
        System.out.println("duration.getSeconds() " + duration.getSeconds());
        System.out.println("duration.toHours() " + duration.toHours());
        System.out.println("duration.toMinutes() " + duration.toMinutes());
    }

    public static void instantPractice() {
        Instant instant = Instant.now();
        System.out.println(instant.getEpochSecond());
    }

    public static void printAllAvailableTimeZones() {
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        for (String availableZoneId : availableZoneIds) {
            System.out.println(availableZoneId);
        }
    }

    public static void zonedDateTimePractice() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime = " + zonedDateTime);
        ZonedDateTime zonedDate1 = ZonedDateTime.now(ZoneId.of("Europe/Moscow"));
        System.out.println(zonedDate1);
    }

    public static void exOfParsing() {
        String date = "2025-31-03";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-dd-MM");

        LocalDate localDate = LocalDate.parse(date, formatter);
        LocalDate newDate = localDate.minusMonths(1);
        System.out.println(localDate);
        System.out.println("newDate = " + newDate);

    }

    public static void task2() {
        String date = "2025-03-20";
        String date2 = "2025-03-10";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate localDate = LocalDate.parse(date, formatter);
        LocalDate localDate2 = LocalDate.parse(date2, formatter);
        Period period = Period.between(localDate2, localDate);
        System.out.println("Days between: " + period.getDays());
    }

    public static void task3() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime = " + zonedDateTime);
        ZonedDateTime zonedDate1 = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        ZonedDateTime zonedDate2 = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime zonedDate3 = ZonedDateTime.now(ZoneId.of("Europe/London"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy, HH:mm");
        System.out.println("Tokyo: " + zonedDate1.format(formatter));
        System.out.println("New York: " + zonedDate2.format(formatter));
        System.out.println("London: " + zonedDate3.format(formatter));
    }
}

