import java.util.Scanner;

public class CarTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("What is the make of the car?");
    String make = input.nextLine();

    System.out.println("What is the model of the car?");
    String model = input.nextLine();

    System.out.println("What is the colour of the car?");
    String colour = input.nextLine();

    System.out.println("Is it a manual car?");
    boolean manualGear = input.nextBoolean();

    Car car = new Car(make, model, colour, manualGear);

    System.out.println(car);

    input.nextLine();

    System.out.println("What new color did you paint your car?");
    String newColour = input.nextLine();

    car.setColour(newColour);

    System.out.println(car);
  }
}
