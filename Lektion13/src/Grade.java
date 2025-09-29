public class Grade
{
  private int grade;
  private String course;
  public final static int LEGAL_GRADES[] = {12, 10, 7, 4, 2, 0, -3};

  public Grade(String course, int grade)
  {
    this.course = course;
    if (isLegalGrade(grade))
    {
      this.grade = grade;
    }
    else
    {
      this.grade = -3;
    }
  }

  public Grade(String course, String ectsGrade)
  {
    this.course = course;
    switch (ectsGrade)
    {
      case "A" -> this.grade = 12;
      case "B" -> this.grade = 10;
      case "C" -> this.grade = 7;
      case "D" -> this.grade = 4;
      case "E" -> this.grade = 2;
      case "F" -> this.grade = 0;
      default -> this.grade = -3;
    }
  }

  public int getGrade()
  {
    return grade;
  }

  public String getCourse()
  {
    return course;
  }

  public String getEctsGrade()
  {
    switch (grade)
    {
      case 12:
        return "A";
      case 10:
        return "B";
      case 7:
        return "C";
      case 4:
        return "D";
      case 2:
        return "E";
      case 0:
        return "F";
      default:
        return "Fx";
    }
  }

  public String toString()
  {
    return course + ", grade=" + grade;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Grade other = (Grade) obj;
    return grade == other.grade && course.equals(other.course);
  }

  public static boolean isLegalGrade(int grade)
  {
    for (int i = 0; i < LEGAL_GRADES.length; i++)
    {
      if (grade == LEGAL_GRADES[i])
      {
        return true;
      }
    }
    return false;
  }
}
