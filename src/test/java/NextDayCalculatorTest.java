import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class NextDayCalculatorTest {
    @Test
    public void nextDay() {
//        Date date = new Date(2020-1900,3,20);
        Calendar expected = Calendar.getInstance();
        expected.set(Calendar.HOUR,0);
        expected.set(Calendar.MINUTE,0);
        expected.set(Calendar.SECOND,0);
        expected.set(Calendar.YEAR, 2020);
        expected.set(Calendar.MONTH, Calendar.APRIL);
        expected.set(Calendar.DAY_OF_MONTH, 21);

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR,0);
        cal.set(Calendar.MINUTE,0);
        cal.set(Calendar.SECOND,0);
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, Calendar.APRIL);
        cal.set(Calendar.DAY_OF_MONTH, 20);

        Date expect = expected.getTime();
        Date result = NextDayCalculator.nextDay(cal.getTime());
        expect.compareTo( result);
    }
}
