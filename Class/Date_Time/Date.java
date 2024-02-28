package Class.Date_Time;
import java.util.Calendar;
public class Date {
    public static void main(String[] args) {
        // object created for Calendar
       Calendar mycal = Calendar.getInstance();

    //    obj.add(field,date/month/year)
       System.out.println("The current time is: "+mycal.getTime());
       mycal.add(Calendar.DATE, -15);  
       System.out.println("5 days ago the time was: "+mycal.getTime());
       mycal.add(Calendar.MONTH,4);
       System.out.println("add 4 months: "+mycal.getTime());
       mycal.add(Calendar.YEAR,2);
       System.out.println("it will add 2 years: "+mycal.getTime());

       //  object created for    
       Calendar mycal2 = Calendar.getInstance();
    //    obj.get(current date/month/year)
    System.out.println(mycal2.get(Calendar.MONTH));
    System.out.println(mycal2.get(Calendar.YEAR));
    }
}