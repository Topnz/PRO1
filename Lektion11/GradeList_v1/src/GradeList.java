public class GradeList
{
  private int[] grades;
  private int actualNumberOfGrades;
  public static final int[] LEGAL_GRADES = { 12, 10, 7, 4, 2, 0, -3 };

  public GradeList(int maxNumberOfGrades)
  {
    this.actualNumberOfGrades = 0;
    this.grades = new int[maxNumberOfGrades];
  }

  public int size()
  {
    return actualNumberOfGrades;
  }

  public void addGrade(int grade)
  {
    if (actualNumberOfGrades == grades.length) return;
    if (!isLegalGrade(grade)) return;

    grades[actualNumberOfGrades] = grade;
    actualNumberOfGrades++;
  }

  public int getGrade(int index)
  {
    if (index < grades.length && index >= 0)
    {
      return grades[index];
    }
    return LEGAL_GRADES[LEGAL_GRADES.length-1];
  }

  public int getMaxGrade()
  {
    if (actualNumberOfGrades == 0) return LEGAL_GRADES[LEGAL_GRADES.length-1];

    int max = LEGAL_GRADES[LEGAL_GRADES.length-1]; // start with first
    for (int i = 0; i < actualNumberOfGrades; i++) {
      if (grades[i] > max) {
        max = grades[i];
      }
    }
    return max;
  }

  public int getMinGrade()
  {
    if (actualNumberOfGrades == 0) return LEGAL_GRADES[LEGAL_GRADES.length-1];

    int min = LEGAL_GRADES[LEGAL_GRADES.length-1]; // start with last
    for (int i = 0; i < actualNumberOfGrades; i++) {
      if (grades[i] < min) {
        min = grades[i];
      }
    }
    return min;
  }

  public double getAverage()
  {
    int sum = 0;
    for (int i = 0; i < actualNumberOfGrades; i++)
    {
      sum += grades[i];
    }

    return (double) sum / actualNumberOfGrades;
  }

  public int getGradeCount(int grade)
  {
    int count = 0;
    for (int i = 0; i < actualNumberOfGrades; i++)
    {
      if (grades[i] == grade)
      {
        count += 1;
      }
    }
    return count;
  }

  public String getGradeDistribution()
  {
    String distribution = "";
    for (int i = 0; i < LEGAL_GRADES.length; i++)
    {
      int grade = LEGAL_GRADES[i];
      distribution += grade + ": " + getGradeCount(grade) + "\n";
    }
    return distribution;
  }

  @Override public String toString()
  {
    String gradeString = "";
    for (int i = 0; i < actualNumberOfGrades; i++)
    {
      gradeString += grades[i] + ", ";
    }
    return gradeString;
  }



  public static boolean isLegalGrade(int grade)
  {
    for (int i = 0; i < LEGAL_GRADES.length; i++)
    {
      if (LEGAL_GRADES[i] == grade)
      {
        return true;
      }
    }
    return false;
  }

}
