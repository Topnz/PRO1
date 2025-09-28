import java.util.Arrays;

public class Hotel
{
  private String name;
  private HotelRoom[] rooms;

  public Hotel(String name, HotelRoom[] rooms)
  {
    this.name = name;
    this.rooms = rooms;
  }


  public String getName()
  {
    return name;
  }

  public int getNumberOfRooms()
  {
    return rooms.length;
  }

  public int getNumberOfAvailableRooms(String roomType)
  {
    int count = 0;
    for (HotelRoom r : rooms)
    {
      if (!r.isOccupied() && r.getType().equals(roomType))
      {
        count++;
      }
    }
    return count;
  }

  public HotelRoom[] getAllAvailableRooms()
  {
    int available = getNumberOfAvailableRooms();
    HotelRoom[] result = new HotelRoom[available];
    int index = 0;
    for (HotelRoom r : rooms)
    {
      if (!r.isOccupied())
      {
        result[index++] = r;
      }
    }
    return result;
  }

  public HotelRoom getFirstAvailableRoom(double maxPrice)
  {
    for (HotelRoom r : rooms)
    {
      if (!r.isOccupied() && r.getPrice() <= maxPrice)
      {
        return r;
      }
    }
    return null;
  }

  public HotelRoom getFirstAvailableRoom()
  {
    for (HotelRoom r : rooms)
    {
      if (!r.isOccupied())
      {
        return r;
      }
    }
    return null;
  }


  public int getNumberOfAvailableRooms()
  {
    int count = 0;
    for (HotelRoom r : rooms)
    {
      if (!r.isOccupied())
      {
        count++;
      }
    }
    return count;
  }

  public boolean hasGuest(Guest guest)
  {
    for (HotelRoom r: rooms)
    {
      if (r.isOccupied())
      {
        Guest g = r.getGuest();
        if (g != null && g.equals(guest))
        {
          return true;
        }
      }
    }
    return false;
  }

  public HotelRoom getRoom(Guest guest)
  {
    for (HotelRoom r : rooms)
    {
      if (r.isOccupied())
      {
        Guest g = r.getGuest();
        if (g != null && g.equals(guest))
        {
          return r;
        }
      }
    }
    return null;
  }

  @Override public String toString()
  {
    return "Hotel{" + "name='" + name + '\'' + ", rooms=" + Arrays.toString(
        rooms) + '}';
  }
}
