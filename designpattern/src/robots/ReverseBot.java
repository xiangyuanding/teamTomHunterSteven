package robots;

/**
 * class ReverseBot, represents a robot that reverses the given string.
 */
public class ReverseBot {

  /**
   * returns the given string in a reversed order.
   * @param str string to be reversed
   * @return str in reversed order
   */
  protected String reverse(String str) {
    String temp = "";
    for (int i = 0; i < str.length(); i++) {
      temp = str.substring(i, i+1) + temp;
    }
    return temp;
  }
}
