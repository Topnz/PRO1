import java.util.Scanner;

public class RectangleTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("What is the length?");
    double length = input.nextDouble();

    System.out.println("What is the width?");
    double width = input.nextDouble();

    Rectangle reccy = new Rectangle(length, width);

    System.out.println(reccy.getLength());
    System.out.println(reccy.getWidth());
    System.out.println(reccy.getArea());
  }
}
