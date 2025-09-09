import java.util.Scanner;
public class StringTest

{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    String name = input.nextLine();

    int lineLenght = name.length();
    char letter = name.charAt(0);
    char lastChar = name.charAt(lineLenght - 1);
    String upper = name.toUpperCase();
    String lower = name.toLowerCase();
    String firstsub = name.substring(0,4);
    String lastsub = name.substring(lineLenght -5, lineLenght);
    boolean ends = name.endsWith("abc");
    int indexa = name.indexOf("a");
    int indexb = name.indexOf("b");
    int indexx = name.indexOf("X");
    String replace = name.replace('a', 'X');

    System.out.println(letter);
    System.out.println(lastChar);
    System.out.println(upper);
    System.out.println(lower);
    System.out.println(firstsub);
    System.out.println(lastsub);
    System.out.println(ends);
    System.out.println(indexa);
    System.out.println(indexb);
    System.out.println(indexx);
    System.out.println(replace);

  }
}
