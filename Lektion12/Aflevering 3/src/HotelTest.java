class HotelTest
{
  public static void main(String[] args)
  {
    HotelRoom[] rooms = new HotelRoom[5];
    rooms[0] = new HotelRoom(101, HotelRoom.SINGLE_ROOM);
    rooms[1] = new HotelRoom(102, HotelRoom.DOUBLE_ROOM);
    rooms[2] = new HotelRoom(201, HotelRoom.FAMIlY_ROOM);
    rooms[3] = new HotelRoom(202, HotelRoom.DOUBLE_ROOM);
    rooms[4] = new HotelRoom(301, HotelRoom.SINGLE_ROOM);


    Hotel hotel = new Hotel("MitHotel", rooms);


    System.out.println(hotel.getName());
    System.out.println("Total rooms: " + hotel.getNumberOfRooms());
    System.out.println("Available: " + hotel.getNumberOfAvailableRooms());


    Guest g1 = new Guest("Alice", 12345678);
    rooms[0].registerGuest(g1);
    Guest g2 = new Guest("Bob", 87654321);
    rooms[3].registerGuest(g2);


    System.out.println("Available after check-in: " + hotel.getNumberOfAvailableRooms());
    System.out.println("First available: " + hotel.getFirstAvailableRoom());
    System.out.println("First available <= 70: " + hotel.getFirstAvailableRoom(70));
    System.out.println("Has Alice? " + hotel.hasGuest(g1));
    System.out.println("Room for Bob: " + hotel.getRoom(g2));


    HotelRoom[] avail = hotel.getAllAvailableRooms();
    System.out.println("All available rooms count: " + avail.length);
  }
}