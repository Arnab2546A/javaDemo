
import java.time.*;

public class timeAPI {
    public static void main(String[] args) {
        //date
        LocalDate date=LocalDate.now();
        System.out.println(date);
        int day=date.getDayOfMonth();
        int month=date.getMonthValue();
        Month monthName=date.getMonth();
        int year=date.getYear();
        System.out.println(day+"/"+month+"/"+year);
        System.out.println(monthName);

        //time
        LocalTime time=LocalTime.now();
        System.out.println(time);
        int hour=time.getHour();
        int min=time.getMinute();
        int sec=time.getSecond();
        System.out.println(hour+":"+min+":"+sec);
    }
}
