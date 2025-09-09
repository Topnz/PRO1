import java.util.Scanner;

public class NameInitial
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Your first name: ");
    String firstName = input.nextLine();

    System.out.println("Your last name: ");
    String lastName = input.nextLine();

    char charFirstName = firstName.charAt(0);
    char charLastName = lastName.charAt(0);

    String initials = "" + charFirstName + charLastName;

    String upper = initials.toUpperCase();

    System.out.println(upper);
  }
}
