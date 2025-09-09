public class Car
{
  private String make;
  private String model;
  private String colour;
  private boolean manualGear;
  private Engine engine;

  public Car(String make, String model, String colour, boolean manualGear, Engine engine)
  {
    this.make = make;
    this.model = model;
    this.colour = colour;
    this.manualGear = manualGear;
    this.engine = engine;
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

  public Engine getEngine()
  {
    return engine;
  }

  public int getHorsePower()
  {
    return engine.getHorsepower();
  }

  public void setEngine(Engine engine)
  {
    this.engine = engine;
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
        + " Manual: " + manualGear + " Engine: " + engine;
  }
}
