import java.util.Scanner;
public class MyNameAndAge
{
  public static void main(String[] args)
  {
    String name;
    int age;

    Scanner input = new Scanner(System.in);
    System.out.println("What is your name?");
    name = input.nextLine();
    System.out.println("What is your age?");
    age = input.nextInt();

    System.out.println("Your name is: " + name);
    System.out.println("You age is: " + age);

    input.close();
  }
}
