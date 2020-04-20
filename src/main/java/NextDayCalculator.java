import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NextDayCalculator {
    public static Date nextDay(Date calendar){
//        date = Timestamp.valueOf(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR,0);
        cal.set(Calendar.MINUTE,0);
        cal.set(Calendar.SECOND,0);
        cal.add(Calendar.DATE,1);
        return cal.getTime();
    }
}
