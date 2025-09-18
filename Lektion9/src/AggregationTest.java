public class AggregationTest
{
  public static void main(String[] args)
  {
    Name name = new Name("Bob", "Jensen");
    Person person1 = new Person(name, 'M', new MyDate(2006, 2, 15));

    System.out.println(person1);
    System.out.println(person1.getStatus());
  }
}
