public class HotelRoomTest
{
  public static void main(String[] args)
  {
    Guest guestTest = new Guest("Torben", 5024542);
    Guest guestTest2 = new Guest("Preben", 889876123);
    HotelRoom Room1 = new HotelRoom(801, HotelRoom.SINGLE_ROOM);
    HotelRoom Room2 = new HotelRoom(802, HotelRoom.DOUBLE_ROOM);
    Room1.registerGuest(guestTest);

    System.out.println(Room2);
  }



}
