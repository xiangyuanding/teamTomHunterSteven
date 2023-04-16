package robots;

import java.util.Scanner;

/**
 * Driver class of a program that lets user control 3 robots, and is designed in facade pattern.
 */
public class Driver {
  public static void main(String[] args) {
    RobotLeader leader = new RobotLeaderImpl();
    System.out.println("please select which robot you need to call\n"
            + "1 -- Weather bot\n2 -- Time bot\n3 -- Reverse bot");
    Scanner line = new Scanner(System.in);
    String input = line.nextLine();
    if (input.equals("1")) {
      System.out.println(leader.callWeatherBot());
    } else if (input.equals("2")) {
      System.out.println(leader.callTimeBot());
    } else if (input.equals("3")) {
      System.out.println("please type the word you want to reverse");
      System.out.println(leader.callReverseBot(line.nextLine()));
    }
  }
}