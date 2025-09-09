import java.util.Scanner;

public class NameTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("What is your first name?");
    String firstName = input.nextLine();

    System.out.println("What is your last name?");
    String lastName = input.nextLine();

    Name name = new Name(firstName, lastName);

    System.out.println(name.getFirstName());
    System.out.println(name.getLastName());
    System.out.println(name.getFullName());
    System.out.println(name.getFormalName());
  }
}
