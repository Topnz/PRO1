import java.util.ArrayList;

public class GradeList
{
  private ArrayList<Grade> grades;

  public GradeList()
  {
    this.grades = new ArrayList<>();
  }

  public int size()
  {
    return grades.size();
  }

  public void addGrade(Grade grade)
  {
    grades.add(grade);
  }

  public void addGrade(int index, Grade grade)
  {
    grades.add(index, grade);
  }

  public void removeGrade(int index)
  {
    grades.remove(index);
  }

  public Grade getGrade(int index)
  {
    return grades.get(index);
  }

  public int getMaxGrade()
  {
    if (grades.size()< 1)
    {
      return -1;
    }
    int max = grades.get(0).getGrade();
    for (int i = 0; i < grades.size(); i++)
    {
      if (grades.get(i).getGrade() > max)
      {
        max = (grades.get(i).getGrade());
      }
    }
    return max;
  }

  public int getMinGrade()
  {
    if (grades.size()< 1)
    {
      return -1;
    }
    int min = grades.get(0).getGrade();
    for (Grade grade:grades)
    {
      if (grade.getGrade() < min)
      {
        min = grade.getGrade();
      }
    }
    return min;
  }

  public double getAverage()
  {
    int sum = 0;
    for (int i=0; i < grades.size(); i++)
    {
      sum += grades.get(i).getGrade();
    }
    return (double) sum/grades.size();
  }
}
