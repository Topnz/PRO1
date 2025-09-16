import java.util.Scanner;

public class ClockTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("What is your total amount of seconds you need calculated?");
    int totalSeconds = input.nextInt();

    Clock calculatedClock =  new Clock(totalSeconds);

    Clock theSecondClock = new Clock(3600);

    System.out.println(calculatedClock);
    System.out.println(theSecondClock);

    Clock timeDifference = calculatedClock.timeTo(theSecondClock);

    System.out.println(timeDifference);

  }
}
