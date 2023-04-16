package robots;

import java.util.Calendar;

/**
 * class TimeBot, represents a robot that tells the time on the local computer.
 */
public class TimeBot {

  /**
   * returns the time on the local computer.
   * @return the time on the local computer
   */
  protected String time() {
    Calendar now = Calendar.getInstance();
    return now.get(Calendar.YEAR) + "/" + now.get(Calendar.MONTH) + "/" + now.get(Calendar.DATE)
            + "\n" + now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE) + ":"
            + now.get(Calendar.SECOND);
  }
}
