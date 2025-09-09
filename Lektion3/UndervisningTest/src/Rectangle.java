public class Rectangle
{
  private double length;
  private double width;

  public Rectangle(double length, double width)
  {
    this.length = length;
    this.width = width;
  }

  public void setLength(double length, double width)
  {
    this.length = length;
    this.width = width;
  }

  public double getLength()
  {
    return width;
  }

  public double getWidth()
  {
    return length;
  }

  public double getArea()
  {
    return width*length;
  }


}
