import java.time.LocalDate;
import java.time.DayOfWeek;
class Solution02
{
    public static void main(String[] args)
    {
        String day = findday(2004,05,25);
        System.out.println(day);
    }
    static String findday(int year, int month, int day )
    {
        LocalDate mydate = LocalDate.of(year,month,day);
        DayOfWeek days = mydate.getDayOfWeek();
        return days.toString();
    }
    
}
