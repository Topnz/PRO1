public class Guest
{
  private String name;
  private long phone;

  public Guest(String name, long phone)
  {
    this.name = name;
    this.phone = phone;
  }

  public String getName()
  {
    return name;
  }

  public long getPhone()
  {
    return phone;
  }

  @Override public String toString()
  {
    return ("Guestname: " + name + "Phonenumber: " + phone);
  }

  @Override public boolean equals(Object obj)
  {
    if(obj == null || obj.getClass() != getClass())
    {
      return false;
    }

    Guest otherGuest = (Guest) obj;
    return this.name.equals(otherGuest.name) && this.phone == otherGuest.phone;
  }
}
