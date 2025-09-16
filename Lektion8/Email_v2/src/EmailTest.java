import java.util.Scanner;

public class EmailTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter your user:");
    String user = input.nextLine();

    System.out.println("Enter your host:");
    String host = input.nextLine();

    System.out.println("Enter your domain:");
    String domain = input.nextLine();

    Email email = new Email(user, host ,domain);
    System.out.println(email.toString());
 }
}
