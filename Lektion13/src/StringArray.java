import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class StringArray

{
  public static void main(String[]args)
  {
   ArrayList<String> list = new ArrayList<>();

   Scanner keyboard = new Scanner(System.in);

   for(int i=0; i < 8; i++)
   {
     System.out.println("What is your next input?");
     String input = keyboard.nextLine();
     list.add(input);
   }

   for(int i=0; i < list.size(); i++)
    {
      System.out.println(list.get(i));
    }


    System.out.println("What do you wish to insert?");
    String inputString = keyboard.nextLine();

    System.out.println("At which index do you wish to put your next input?");
    int inputIndex = keyboard.nextInt();

    list.add(inputIndex, inputString);

    for(int i=0; i < list.size(); i++)
    {
      System.out.println(list.get(i));
    }

  }
}
