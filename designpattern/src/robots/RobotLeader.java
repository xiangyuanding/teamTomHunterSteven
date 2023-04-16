package robots;

/**
 * Interface RobotLeader, represents a robot leader that can give commands to 3 robots: the
 * weather bot, the time bot and the reverse bot.
 */
public interface RobotLeader {

  /**
   * returns a weather String randomly.
   * @return returns a weather String randomly.
   */
  public String callWeatherBot();

  /**
   * returns the time on the local computer.
   * @return the time on the local computer
   */
  public String callTimeBot();

  /**
   * returns the given string in a reversed order.
   * @param str string to be reversed
   * @return str in reversed order
   */
  public String callReverseBot(String str);
}
