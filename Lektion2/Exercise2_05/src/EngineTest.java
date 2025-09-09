import rentalcompany.model.*;
import java.util.Scanner;

public class EngineTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("What is the type of engine? ");
    String type = input.nextLine();

    System.out.println("What is the horsepower? ");
    int power = input.nextInt();

    System.out.println("What is the volume in m3? ");
    int volume = input.nextInt();

    Engine engine = new Engine(type, power, volume, false);

    System.out.println(engine.toString());

  }
}
