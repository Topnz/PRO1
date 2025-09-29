import java.util.ArrayList;

class HotelTest
{
  public static void main(String[] args)
  {
    ArrayList<HotelRoom> rooms = new ArrayList<>();
    rooms.add(new HotelRoom(101, HotelRoom.SINGLE_ROOM));
    rooms.add(new HotelRoom(102, HotelRoom.SINGLE_ROOM));
    rooms.add(new HotelRoom(103, HotelRoom.SINGLE_ROOM));
    rooms.add(new HotelRoom(104, HotelRoom.SINGLE_ROOM));
    rooms.add(new HotelRoom(105, HotelRoom.SINGLE_ROOM));


    Hotel hotel = new Hotel("MitHotel", rooms);
    System.out.println(hotel.toString());
  }
}