import java.time.LocalDate;
public class MyDate

{
  private int year;
  private int month;
  private int day;

  //Contructor
  public MyDate(int year, int month, int day)
  {
    set(year, month, day);
  }

    public MyDate()
  {
   LocalDate today = LocalDate.now();

   this.year = today.getYear();
   this.month = today.getMonthValue();
   this.day = today.getDayOfMonth();
  }

  //Set
  public void set(int year, int month, int day)
  {
    this.year = year;
    this.month = month;
    this.day = day;
  }


  //Get Year
  public int getYear()
  {
    return year;
  }

  //Get Month
  public int getMonth()
  {
    return month;
  }

  //Get Day
  public int getDay()
  {
    return day;
  }

  //isLeapYear method
  public boolean isLeapYear()
  {
    return (year % 4 == 0 && (year % 100 != 0) || (year % 400 == 0));
  }

  //numberOfDaysInMonth method
  public int numberOfDaysInMonth()
  {
    if (month == 1) {
      return 31;}
    else if (month == 2 && isLeapYear()) {
      return 29;}
    else if (month == 2 && !isLeapYear()) {
      return 28;}
    else if (month == 3) {
      return 31;}
    else if (month == 4) {
      return 30;}
    else if (month == 5) {
      return 31;}
    else if (month == 6) {
      return 30;}
    else if (month == 7) {
      return 31;}
    else if (month == 8) {
      return 31;}
    else if (month == 9) {
      return 30;}
    else if (month == 10) {
      return 31;}
    else if (month == 11) {
      return 30;}
    else if (month == 12) {
      return 31;}
    else {
      return 0;
    }
  }

  //getMonthName method
  public String getMonthName()
  {
    if (month == 1) {
      return "January";}
    else if (month == 2) {
      return "February";}
    else if (month == 3) {
      return "March";}
    else if (month == 4) {
      return "April";}
    else if (month == 5) {
      return "May";}
    else if (month == 6) {
      return "June";}
    else if (month == 7) {
      return "July";}
    else if (month == 8) {
      return "August";}
    else if (month == 9) {
      return "September";}
    else if (month == 10) {
      return "October";}
    else if (month == 11) {
      return "November";}
    else if (month == 12) {
      return "December";}
    else
    {
      return "Not a valid month";
    }
  }

    //Void method stepForwardOneDay
    public void stepForwardOneDay() {
    if (day == 28 && month == 2 && !isLeapYear())
    {  // February non-leap year
      month += 1;
      this.day = 1;
    }
    else if (day == 29 && month == 2 && isLeapYear())
    {  // February leap year
      month += 1;
      this.day = 1;
    }
    else if ((day == 30) && (month == 4 || month == 6 || month == 9 || month == 11))
    { // Months with 30 days
      month += 1;
      this.day = 1;
    }
    else if ((day == 31) && (month == 1 || month == 3 || month == 5 || month == 7 ||
        month == 8 || month == 10))
    { // Months with 31 days
      month += 1;
      this.day = 1;
    }

    if (month == 12)
      {
        year += 1;
        this.month = 1;
      }
    }

    /*
    //isBefore method
    public boolean isBefore()
    {
      if ()
    }
*/

  public String toString()
  {
    return day + "/" + month + "/" + year;
  }
}
