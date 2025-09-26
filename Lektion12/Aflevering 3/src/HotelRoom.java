public class HotelRoom
{
  private int number;
  private String type;
  private double price;
  private Guest guest;
  private static final double SINGLE_PRICE = 59.50;
  private static final double DOUBLE_PRICE = 68.50;
  private static final double FAMILY_PRICE = 99.25;
  public static final String SINGLE_ROOM = "Single";
  public static final String DOUBLE_ROOM = "Double";
  public static final String FAMIlY_ROOM = "Family";

  public HotelRoom(int number, String type)
  {
    this.number = number;
    this.type = type;
    this.guest = null;
    this.price = getRoomPrice(type);
  }

  public int getNumber()
  {
    return number;
  }

  public String getType()
  {
    return type;
  }

  public double getPrice()
  {
    return price;
  }

  public Guest getGuest()
  {
    return guest;
  }

  public int getFloor()
  {
    return number/100;
  }

  public boolean isOccupied()
  {
    return guest != null;
  }

  public void registerGuest(Guest guest)
  {
    this.guest = guest;
  }

  public void vacate()
  {
    this.guest = null;
  }

  @Override public String toString()
  {
    String occupiedGuest = "Available";
    if (isOccupied())
    {
      occupiedGuest = guest.toString();
    }

    return ("Number: " + number + "Type: " + type
        + "Price: " + price + "Guest:" + occupiedGuest);
  }

  public static double getRoomPrice(String type)
  {
    switch (type)
    {
      case SINGLE_ROOM:
        return SINGLE_PRICE;
      case DOUBLE_ROOM:
        return DOUBLE_PRICE;
      default:
        return FAMILY_PRICE;
    }
  }
}
