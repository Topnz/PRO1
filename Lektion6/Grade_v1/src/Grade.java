public class Grade
{
  private int grade;

  public Grade(int grade)
  {
    switch (grade)
    {
      case 12:
        this.grade = 12;
        break;
      case 10:
        this.grade = 10;
        break;
      case 7:
        this.grade = 7;
        break;
      case 4:
        this.grade = 4;
        break;
      case 2:
        this.grade = 2;
        break;
      case 0:
        this.grade = 0;
        break;
      default:
        this.grade = -3;
        break;
    }
  }

  public Grade(String ectsGrade)
  {
    if (ectsGrade == "A")
    {
      this.grade = 12;
    }
    else if (ectsGrade == "B")
    {
      this.grade = 10;
    }
    else if (ectsGrade == "C")
    {
      this.grade = 7;
    }
    else if (ectsGrade == "D")
    {
      this.grade = 4;
    }
    else if (ectsGrade == "E")
    {
      this.grade = 2;
    }
    else if (ectsGrade == "Fx")
    {
      this.grade = 0;
    }
    else
    {
      this.grade = -3;
    }
  }

  public int getGrade()
  {
    return grade;
  }

  public String getEctsGrade()
  {
    if (grade == 12)
    {
      return "A";
    }
    else if (grade == 10)
    {
      return "B";
    }
    else if (grade == 7)
    {
      return "C";
    }
    else if (grade == 4)
    {
      return "D";
    }
    else if (grade == 2)
    {
      return "E";
    }
    else if (grade == 0)
    {
      return "Fx";
    }
    else
    {
      return "F";
    }
  }

  public String toString()
  {
    return "Danish Grade: " + grade + "\nECTS grade: " + getEctsGrade();
  }
}

