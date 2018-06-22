import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class Date_format { public static void main(String args[]) {
    Date date = new Date(0);
    DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
    String strDate = dateFormat.format(date);
    System.out.println("converted Date to String: " + strDate);
    }
}