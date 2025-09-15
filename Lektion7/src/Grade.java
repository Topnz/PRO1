public class Grade
{
  private int grade;

  public Grade(int grade)
  {
    this.grade = grade;

    if (getEctsGrade().equals("Illegal Grade"))
    {
      this.grade = -3;
    }
  }

  public Grade(String ects)
  {
    switch (ects)
    {
      case "Fx" ->
      {
        this.grade = 0;
      }
      case "E" ->
      {
        this.grade = 2;
      }
      case "D" ->
      {
        this.grade = 4;
      }
      case "C" ->
      {
        this.grade = 7;
      }
      case "B" ->
      {
        this.grade = 10;
      }
      case "A" ->
      {
        this.grade = 12;
      }
      default ->
      {
        this.grade = -3;
      }
    }
  }

  public int getGrade()
  {
    return grade;
  }

  public String toString()
  {
    return "" + grade;
  }

  public String getEctsGrade()
  {
    switch (grade)
    {
      case 0:
        return "Fx";
      case 2:
        return "E";
      case 4:
        return "D";
      case 7:
        return "C";
      case 10:
        return "B";
      case 12:
        return "A";
      default:
        return "F";
    }
  }
}
