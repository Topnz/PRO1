public class RectangleTest
{
  public static void main(String[] args)
  {
    Rectangle rect1 = new Rectangle(10., 20.0);

    System.out.println("Rectangle length: " + rect1.getLength());
    System.out.println("Rectangle width: " + rect1.getWidth());
    System.out.println("Rectangle Area: " + rect1.getArea());
  }
}
