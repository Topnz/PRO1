import java.util.Scanner;

public class MyPersonalData
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("What is your name?");
    String name = input.nextLine();

    System.out.println("What is your age?");
    int age = input.nextInt();

    input.nextLine();

    System.out.println("What is your address?");
    String address = input.nextLine();

    System.out.println("Your name is: " + name);
    System.out.println("Your age is " + age);
    System.out.println("Your address is " + address);

  }
}
