import java.util.Scanner;

public class CarTest
{
  public static void main(String[] args)
  {
    Engine engine = new Engine("Big engine", 480, 600,true);
    Car car = new Car("Volkswagen", "Passat 1.6", "Red", false, engine);

    System.out.println(car);
  }
}
