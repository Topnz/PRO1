import java.sql.SQLOutput;
import java.util.Scanner;

public class ClockTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("What is the current hour?");
    int hour = input.nextInt();

    System.out.println("What is the current minute?");
    int minute = input.nextInt();

    System.out.println("What is the current second?");
    int second = input.nextInt();

    Clock currentClock = new Clock(hour, minute, second);

    System.out.println("Amout of hours: " + currentClock.getHour() +
        "\nAmount of minutes: " + currentClock.getMinute() +
        "\nAmount of seconds: "+ currentClock.getSecond());

    System.out.println(currentClock.getTimeInSeconds());

    System.out.println(currentClock.toString());

    System.out.println("What is the current hour?");
    int hourCurrent = input.nextInt();

    System.out.println("What is the current minute?");
    int minuteCurrent = input.nextInt();

    System.out.println("What is the current second?");
    int secondCurrent = input.nextInt();

    currentClock.set(hourCurrent, minuteCurrent, secondCurrent);

    System.out.println("Amout of hours: " + currentClock.getHour() +
        "\nAmount of minutes: " + currentClock.getMinute() +
        "\nAmount of seconds: "+ currentClock.getSecond());

    System.out.println(currentClock.getTimeInSeconds());

    System.out.println(currentClock.toString());

    System.out.println(currentClock.getSimpleTime());


  }
}
