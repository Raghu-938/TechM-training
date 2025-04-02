import java.time.*;
class TimeApi{
    public static void main(String[] args){
        LocalDate date=LocalDate.of(2024,12,25);
        LocalTime time=LocalTime.of(12,35,9);
        LocalDateTime dateTime=LocalDateTime.of(2024,12,25,12,35,07);

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);

        date=date.plusWeeks(2);
        System.out.println(date);

        date=date.minusMonths(1);
        System.out.println(date);

    }
}