import rentalcompany.model.*;

public class DataTest
{
  public static void main(String[] args)
  {
    MyDate dateForMyBirthday = new MyDate(16, 8, 2004);
    MyDate today = new MyDate();
    today.isLeapYear();
    today.numberOfDaysInMonth();

    int dage = dateForMyBirthday.daysBetween(today);
    int years = dateForMyBirthday.yearsBetween(today);

    System.out.println("My birthday: " + dateForMyBirthday);
    System.out.println("Days since my birthday: " + dage + " Days");
    System.out.println("Years since my birthday: " + years + " Years");
    System.out.println(today.numberOfDaysInMonth());

 }
}
