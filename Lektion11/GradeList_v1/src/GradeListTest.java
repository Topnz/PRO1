public class GradeListTest
{
  public static void main(String[] args)
  {
    GradeList test = new GradeList(9);

    for (int i = 0; i < 7; i++)
    {
      test.addGrade(7);
    }

    test.addGrade(-3);
    test.addGrade(12);

    System.out.println(test.getMaxGrade());
    System.out.println(test.getMinGrade());
    System.out.println(test.getAverage());
    System.out.println(test.getGradeDistribution());
    System.out.println(test.toString());
  }
}
