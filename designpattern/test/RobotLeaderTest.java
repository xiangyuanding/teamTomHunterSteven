import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.util.Calendar;
import org.junit.Before;
import org.junit.Test;
import robots.*;

/**
 * test class for package robots
 */
public class RobotLeaderTest {
  private RobotLeader testLeader;
  private WeatherBot testWeather;
  private TimeBot testTime;
  private ReverseBot testReverse;

  @Before
  public void setUp() {
    testLeader = new RobotLeaderImpl();
    testReverse = new ReverseBot();
    testTime = new TimeBot();
    testWeather = new WeatherBot();
  }
  @Test
  public void testCallWeatherBot() {
    assertTrue(testLeader.callWeatherBot().equals("Cloudy") ||
            testLeader.callWeatherBot().equals("Rainy") ||
            testLeader.callWeatherBot().equals("Sunny") ||
            testLeader.callWeatherBot().equals("Snowy"));
  }

  @Test
  public void testCallReverseBot() {
    assertEquals("sdrow", testLeader.callReverseBot("words"));
    assertEquals("dlrow olleh", testLeader.callReverseBot("hello world"));
  }

  @Test
  public void testCallTimeBot() {
    Calendar now = Calendar.getInstance();
    String str = now.get(Calendar.YEAR) + "/" + now.get(Calendar.MONTH) + "/" + now.get(Calendar.DATE)
            + "\n" + now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE) + ":"
            + now.get(Calendar.SECOND);
    assertEquals(str, testLeader.callTimeBot());
  }
}
