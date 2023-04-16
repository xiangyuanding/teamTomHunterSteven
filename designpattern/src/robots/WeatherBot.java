package robots;

import java.util.Random;

/**
 * class WeatherBot, represents a robot that randomly gives a weather.
 */
public class WeatherBot {
  private String[] weather;

  /**
   * Constructor of the class WeatherBot.
   */
  public WeatherBot() {
    this.weather = new String[]{"Cloudy", "Rainy", "Sunny", "Snowy"};
  }

  /**
   * returns a weather String randomly.
   * @return returns a weather String randomly.
   */
  protected String getWeather() {
    Random random = new Random();
    return weather[random.nextInt(4)];
  }
}
