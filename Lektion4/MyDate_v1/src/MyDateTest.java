import java.util.Scanner;

public class MyDateTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("What is the year?");
    int year = input.nextInt();

    System.out.println("What is the month?");
    int month = input.nextInt();

    System.out.println("What is the day?");
    int day = input.nextInt();

    MyDate date = new MyDate(year, month, day);

    System.out.println(date);

    date.set(2001, 9, 11);

    System.out.println(date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
    System.out.println(date);
  }
}
