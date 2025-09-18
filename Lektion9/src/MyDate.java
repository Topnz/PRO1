import java.time.LocalDate;

public class MyDate
{
  private int year;
  private int month;
  private int day;

  public MyDate(int year, int month, int day)
  {
    set(year, month, day);
  }

  public MyDate()
  {
    LocalDate today = LocalDate.now();

    set(today.getYear(), today.getMonthValue(), today.getDayOfMonth());
  }

  public void set(int year, int month, int day)
  {
    if (year < 0)
    {
      this.year = -year;
    }
    else
    {
      this.year = year;
    }

    if (month < 1)
    {
      this.month = 1;
    }
    else if (month > 12)
    {
      this.month = 12;
    }
    else
    {
      this.month = month;
    }

    int daysInMonth = numberOfDaysInMonth();

    if (day < 1)
    {
      this.day = 1;
    }
    else if (day > daysInMonth)
    {
      this.day = daysInMonth;
    }
    else
    {
      this.day = day;
    }
  }

  public int getDay()
  {
    return day;
  }

  public int getMonth()
  {
    return month;
  }

  public int getYear()
  {
    return year;
  }

  public boolean isLeapYear()
  {
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
  }

  public int numberOfDaysInMonth()
  {
    if (month <= 0) return 0;
    if (month == 2 && isLeapYear()) return 29;

    switch (month)
    {
      case 2:
        return 28;
      case 4, 6, 9, 11:
        return 30;
      default:
        return 31;
    }
  }

  public String getMonthName()
  {
    switch (month)
    {
      case 1:
        return "January";
      case 2:
        return "February";
      case 3:
        return "March";
      case 4:
        return "April";
      case 5:
        return "May";
      case 6:
        return "June";
      case 7:
        return "July";
      case 8:
        return "August";
      case 9:
        return "September";
      case 10:
        return "October";
      case 11:
        return "November";
      case 12:
        return "December";
      default:
        return "No month set";
    }
  }

  public void stepForwardOneDay()
  {
    day += 1;

    if (day > numberOfDaysInMonth())
    {
      day = 1;
      month += 1;
    }

    if (month > 12)
    {
      month = 1;
      year += 1;
    }
  }

  public boolean isBefore(MyDate other)
  {
    if (this.year < other.year) return true;
    if (this.year > other.year) return false;

    if (this.month < other.month) return true;
    if (this.month > other.month) return false;

    return this.day < other.day;
  }

  public int yearsBetween(MyDate other)
  {
    // Make sure we know which is earlier
    MyDate start = this.copy();
    MyDate end = other.copy();

    if (end.isBefore(start)) {
      start = other.copy();
      end = this.copy();
    }

    int years = end.getYear() - start.getYear();

    // Adjust if the end date is before the "anniversary" in that year
    if (end.getMonth() < start.getMonth() ||
        (end.getMonth() == start.getMonth() && end.getDay() < start.getDay())) {
      years--;
    }

    return years;
  }


  public int daysBetween(MyDate other)
  {
    // Make copies, so we don’t mutate the originals
    MyDate start = this.copy();
    MyDate end = other.copy();

    int count = 0;

    // Ensure start is the earlier date
    if (!start.isBefore(end) && !start.equals(end)) {
      start = other.copy();
      end = this.copy();
    }

    // Step day by day until the dates match
    while (!start.equals(end)) {
      start.stepForwardOneDay();
      count++;
    }

    return count;
  }

  public MyDate copy()
  {
    return new MyDate(year, month, day);
  }

  public String toString()
  {
    String dayText;
    String monthText;

    if (day < 10)
    {
      dayText = "0" + day;
    }
    else
    {
      dayText = "" + day;
    }

    if (month < 10)
    {
      monthText = "0" + month;
    }
    else
    {
      monthText = "" + month;
    }

    return dayText + "/" + monthText + "/" + year;
  }

  public boolean equals(Object other)
  {
    return true; // Implementer
  }
}