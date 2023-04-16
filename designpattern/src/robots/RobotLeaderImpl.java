package robots;

/**
 * class RobotLeaderImpl that implements RobotLeader, represents a robot leader that can
 * give commands to 3 robots: the weather bot, the time bot and the reverse bot.
 */
public class RobotLeaderImpl implements RobotLeader {

  private WeatherBot weatherBot;
  private TimeBot timeBot;
  private ReverseBot reverseBot;

  /**
   * the constructor of class RobotLeaderImpl.
   */
  public RobotLeaderImpl() {
    weatherBot = new WeatherBot();
    timeBot = new TimeBot();
    reverseBot = new ReverseBot();
  }

  @Override
  public String callWeatherBot() {
    return weatherBot.getWeather();
  }

  @Override
  public String callTimeBot() {
    return timeBot.time();
  }

  @Override
  public String callReverseBot(String str) {
    return reverseBot.reverse(str);
  }
}
