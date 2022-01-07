import java.io.*;
import java.util.*;
import java.time.LocalDateTime;

public class Time {

  public static void main( String[] args){

    LocalDateTime time = LocalDateTime.now();
    final int SECONDS = ((24 * 60) * 60);
    int hour = time.getHour();
    int minute = time.getMinute();
    int second = time.getSecond();
    int ttlSec = 0;
    int remSec = 0;
    double lapsedDayRt = 0.0;

    ttlSec = ((hour * 60) * 60) + (minute * 60) + second;

    remSec = SECONDS - ttlSec;

    lapsedDayRt = 100 * (Double.valueOf(ttlSec)/Double.valueOf(SECONDS));

    String rtStr = String.format("%.0f%%", lapsedDayRt);

    System.out.println("Seconds since midnight: " + ttlSec + "\nSeconds remaining: " + remSec + "\n" + rtStr + " of the day has passed.");
    





    
  }
}