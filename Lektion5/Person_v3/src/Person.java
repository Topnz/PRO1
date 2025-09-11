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

  public String getStatus()
  {
    if (age < 0)
    {
      return "Error";
    }
    else if (age >= 18 && (gender == 'M' || gender == 'm'))
    {
      return "Man";
    }
    else if (age >= 18 && (gender == 'F' || gender == 'f'))
    {
      return "Woman";
    }
    else if (age < 18 && !(gender == 'M' || gender == 'm'))
    {
      return "Girl";
    }
    else
    {
      return "Null";
    }
  }

  public String getAgeStatus()
  {
    if (age < 0)
    {
      return "Error";
    }
    else if (age < 13)
    {
      return "Child";
    }

    else if (age < 20)
    {
      return "Teenager";
    }

    else if (age < 66)
    {
      return "Adult";
    }

    else
    {
      return "Senior";
    }
  }

  public String toString()
  {
    return "Your name: " + name + "\nYour age: " + age + "\nYour gender: " + gender;
  }
}
