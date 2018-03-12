
      
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class date {

  public static void main(String[]args) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTimeInMillis(0);
    calendar.set(2018, Calendar.MARCH, 1, 0, 0, 0);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");
    calendar.add(Calendar.DAY_OF_MONTH, 30);
    System.out.println(sdf.format(calendar.getTime()));
  }
}