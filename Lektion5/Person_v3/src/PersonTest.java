import java.util.Scanner;

public class PersonTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    //Person 1

    System.out.println("Type your name");
    String name = input.nextLine();

    System.out.println("Type your gender");
    String line = input.nextLine();
    char gender = line.charAt(0);

    System.out.println("Type your age");
    int age = input.nextInt();

    Person person1 = new Person(name, gender, age);

    System.out.println(person1.getName() + "\n" +
        person1.getAge() + "\n" +
        person1.getGender());

    System.out.println(person1.getStatus());

  }
}
