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

    person1.setName("John");
    person1.setGender('M');
    person1.setAge(22);
    System.out.println(person1);

    //Person 2

    input.nextLine();

    System.out.println("Type your name");
    String name2 = input.nextLine();

    System.out.println("Type your gender");
    String line2 = input.nextLine();
    char gender2 = line2.charAt(0);

    Person person2 = new Person(name2, gender2);

    System.out.println(person2.getName() + "\n" +
        person2.getAge() + "\n" +
        person2.getGender());

    person2.setName("Maggie");
    person2.setGender('F');
    person2.setAge(24);

    System.out.println(person2);

    //Person 3

    System.out.println("Type your gender");
    String line3 = input.nextLine();
    char gender3 = line3.charAt(0);

    Person person3 = new Person(gender3);
    System.out.println(person3.getName() + "\n" +
        person3.getAge() + "\n" +
        person3.getGender());

    person3.setName("Preben");
    person3.setGender('M');
    person3.setAge(38);

    System.out.println(person3);
  }
}
