public class Person
{
  private Name name;
  private char gender;
  private MyDate birthday;

  public Person(Name name, char gender, MyDate birthday)
  {
    this.name = name;
    this.gender = gender;
    this.birthday = birthday.copy();
  }

  public Person(Name name, char gender)
  {
    this.name = name;
    this.gender = gender;
    this.birthday = new MyDate();
  }

  public Person(char gender)
  {
    this.gender = gender;
    this.name = null;
    this.birthday = new MyDate();
  }

  public String getName()
  {
    return name.getFullName();
  }

  public char getGender()
  {
    return gender;
  }

  public MyDate getBirthday()
  {
    return birthday.copy();
  }

  public int getAge()
  {
    MyDate today = new MyDate();

    return birthday.yearsBetween(today);
  }

  public void setName(Name name)
  {
    this.name = name;
  }

  public void setGender(char newGender)
  {
    this.gender = newGender;
  }

  public String getStatus()
  {
    MyDate today = new MyDate();

    if (birthday.yearsBetween(today) < 0)
    {
      return "Error";
    }
    else if (birthday.yearsBetween(today) >= 18 && (gender == 'M' || gender == 'm'))
    {
      return "Man";
    }
    else if (birthday.yearsBetween(today) >= 18 && (gender == 'F' || gender == 'f'))
    {
      return "Woman";
    }
    else if (birthday.yearsBetween(today) < 18 && !(gender == 'M' || gender == 'm'))
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
    MyDate today = new MyDate();

    if (birthday.yearsBetween(today) < 0)
    {
      return "Error";
    }
    else if (birthday.yearsBetween(today) < 13)
    {
      return "Child";
    }

    else if (birthday.yearsBetween(today) < 20)
    {
      return "Teenager";
    }

    else if (birthday.yearsBetween(today) < 66)
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
    MyDate today = new MyDate();

    return "Your name: " + name.getFullName() + "\nYour birthday: " + birthday.toString() + "\nYour gender: " + gender;
  }

  public boolean equals(Object other)
  {
    if (other == null || getClass() != other.getClass()) return false;
    Person otherPerson = (Person) other;
    return name.equals(otherPerson.name) &&
        gender == otherPerson.gender &&
        birthday.equals(otherPerson.birthday);
  }
}
