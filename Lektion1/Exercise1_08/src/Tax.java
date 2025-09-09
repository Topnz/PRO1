public class Tax
{
  public static void main(String[] args)
  {
    int vare1, vare2, vare3;

    vare1 = 80;
    vare2 = 140;
    vare3 = 230;

    int moms;
    moms = (int) ((vare1 + vare2 + vare3)*1.25);

    System.out.println(moms);

  }
}
