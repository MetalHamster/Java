package tools;

import java.time.LocalDateTime;

/**
 * @author Matthias.Flueckiger
 */
public class TimeTools {
    public static String getDigitalTime(){
        return LocalDateTime.now().getHour()+":"+LocalDateTime.now().getMinute()+":"+LocalDateTime.now().getSecond();
    }
}
