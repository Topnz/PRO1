import java.util.Scanner; //Used for Scanner "input" object

public class UserAccountTest
{
  //Sets a new password on the created UserAccount-object.
  public static String readPassword(Scanner input)
  {
    while (true)
    {
      System.out.println("Type password: ");
      String password = input.nextLine();

      System.out.println("Confirm password: ");
      String repeatedPassword = input.nextLine();

      if (password.equals(repeatedPassword))
      {
        return password;
      }

      else
      {
        System.out.println("Password doesn't match, please try again!");
      }
    }
  }

  public static void main(String[] args)
  {
    //Creates new scanner object named input
    Scanner input = new Scanner(System.in);

    //Reads name & username
    System.out.println("Please type your name: ");
    String name = input.nextLine();

    System.out.println("Please type your username: ");
    String username = input.nextLine();

    //Asks for password to be written twice and checks if both inputs are identical.
    // If not, then asks the user to write it again. This is done in a while loop with if statements.
    String password;
    while (true)
    {
      System.out.println("Please type your password: ");
      password = input.nextLine();

      System.out.print("Please confirm your password by typing it again: \n");
      String repeatPassword = input.nextLine();

      if (password.equals(repeatPassword))
      {
        break;
      }

      else
      {
        System.out.println("Passwords don't match, please try again!");
      }
    }

    UserAccount account = new UserAccount(name, username, password);
    System.out.println("\nUser account created:");
    System.out.println(account);

    // Calls readPassword
    String newPassword = readPassword(input);

    // Prints the result
    System.out.println("The password you entered is: " + password);

    // Checks for the correct password
    System.out.println("Test correct password: " + account.hasPassword(password)); // Must be true!

    // Checks for the wrong password
    System.out.println("Test wrong password: " + account.hasPassword("wrong")); // Must be false!

    // Same data as account
    UserAccount sameAccount = new UserAccount(name, username, password);
    System.out.println("Compare with same data: " + account.equals(sameAccount)); // true

    // Different data
    UserAccount differentAccount = new UserAccount("Preben", "PebenGamings", "PrebenErHot123");
    System.out.println("Compare with different data: " + account.equals(differentAccount)); // false

    input.close();


  }


}
