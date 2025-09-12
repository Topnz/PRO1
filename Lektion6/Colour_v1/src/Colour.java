public class Colour
{
  private int red;
  private int green;
  private int blue;

  public Colour(int red, int green, int blue)
  {
    this.red = red;
    this.green = green;
    this.blue = blue;

    //Red
    if (red > 255)
    {
      this.red = 255;
    }
    else if (red < 0)
    {
      this.red = 0;
    }

    //Green
    if (green > 255)
    {
      this.green = 255;
    }
    else if (green < 0)
    {
      this.green = 0;
    }

    //Blue
    if (blue > 255)
    {
      this.blue = 255;
    }
    else if (blue < 0)
    {
      this.blue = 0;
    }
  }

  public Colour(String hex)
  {
    if (hex.length() > 7 || (hex.length() < 6))
    {
      hex = "#FFFFFF";
    }

    String hexRed;
    String hexGreen;
    String hexBlue;

    //hexRed
    hexRed = hex.substring(1,3);

    //hedGreen
    hexGreen = hex.substring(3,5);

    //hexBlue
    hexBlue = hex.substring(5,7);




  }




}
