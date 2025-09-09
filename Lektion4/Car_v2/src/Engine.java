public class Engine
{
  private String type;
  private int horsePower;
  private int volume;
  private boolean isDiesel;

  public Engine(String type, int horsePower, int volume, boolean isDiesel)
  {
    this.type = type;
    this.horsePower = horsePower;
    this.volume = volume;
    this.isDiesel = isDiesel;
  }
  public Engine(String type, int horsepower, int volume)
  {
    this.type = type;
    this.horsePower = horsepower;
    this.volume = volume;
    this.isDiesel = false;
  }

  public String getType()
  {
    return type;
  }

  public int getHorsepower()
  {
    return horsePower;
  }

  public int getVolume()
  {
    return volume;
  }

  public boolean isDiesel()
  {
    return isDiesel;
  }

  public String toString()
  {
    return "Type: " + type + "Horsepower: " + horsePower + "Volume: " + volume + "Is it a diesel engine?: " + isDiesel;
  }
}
