public class Person
{
  private String name;
  private int age;
  private char gender;

  public Person (String name, char gender, int age)
  {
    this.name = name;
    this.gender = gender;
    this.age = age;
  }

  public Person (String name, char gender)
  {
    this.name = name;
    this.gender = gender;
    this.age = 0;
  }

  public Person (char gender)
  {
    this.gender = gender;
    this.name = null;
    this.age = 0;
  }

  public String getName()
  {
    return name;
  }

  public char getGender()
  {
    return gender;
  }

  public int getAge()
  {
    return age;
  }

  public void setName(String newName)
  {
    this.name = newName;
  }

  public void setGender(char newGender)
  {
    this.gender = newGender;
  }

  public void setAge(int newAge)
  {
    this.age = newAge;
  }

  public String toString()
  {
    return "Your name: " + name + "\nYour age: " + age + "\nYour gender: " + gender;
  }








}
