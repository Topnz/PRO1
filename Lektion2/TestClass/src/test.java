import java.util.Scanner;

public class test
{
  public static void main(String[] args)
  {
    int little;
    int big;
    char testA = 'A';

    little = 2;
    big = 2;
    System.out.println("Lille er " + little + " stor er " + big + " " + testA);

    String name1 = "Bob";
    String name2 = "Wendy";
    System.out.println("Hello " + name1 + " and " + name2);

    String message = "Java is Great Fun!";
    String upper = message.toUpperCase();
    String lower = message.toLowerCase();
    char letter = message.charAt(2);
    int stringSize = message.length();

    System.out.println(message);
    System.out.println(upper);
    System.out.println(lower);
    System.out.println(letter);
    System.out.println(stringSize);

    Scanner input = new Scanner(System.in);
    System.out.println("Insert your name here");
    int age = input.nextInt();
    System.out.println("You age is: " + age);
    input.close();



  }
}
