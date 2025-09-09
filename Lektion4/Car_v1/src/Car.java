public class Car
{
  private String make;
  private String model;
  private String colour;
  private boolean manualGear;

  public Car(String make, String model, String colour, boolean manualGear)
  {
    this.make = make;
    this.model = model;
    this.colour = colour;
    this.manualGear = manualGear;
  }

  public String getMake()
  {
    return make;
  }

  public String getModel()
  {
    return model;
  }

  public String getColour()
  {
    return colour;
  }

  public boolean isManualGear()
  {
    return manualGear;
  }

  public void setColour(String colour)
  {
    this.colour = colour;
  }

  public String toString()
  {
    return "Make: " + make
        + " Model: "
        + model
        + " Colour: "
        + colour
        + " Manual: " + manualGear;
  }
}
