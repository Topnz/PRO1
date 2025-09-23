import java.util.Scanner;
public class ArrayTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    String[] arrayTest;
    arrayTest = new String[8];


    for(int i=0; i<arrayTest.length-1; i++)
    {
      System.out.println("Give an input: ");
      String stringInput = input.nextLine();
      arrayTest[i] = stringInput;
    }

    for(int i=0; i<arrayTest.length; i++)
    {
      System.out.println("The name is: " + arrayTest[i]);

    }


    System.out.println("What do you wish to write on your chosen position?: ");
    String stringInput = input.nextLine();

    System.out.println("At which index number do you wish to insert a new element? ");
    int positionInput = input.nextInt();


    for(int i=arrayTest.length-1; i>positionInput; i--)
    {
      arrayTest[i] = arrayTest[i-1];
    }

    arrayTest[positionInput] = stringInput;
    System.out.println(arrayTest[positionInput]);

    for(int i=0; i<arrayTest.length; i++)
    {
      System.out.println("The name is: " + arrayTest[i]);
    }
  }
}
