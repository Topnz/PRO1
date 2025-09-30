public class Mp3PlayerTest
{
  public static void main(String[] args)
  {
    Mp3Player iPod = new Mp3Player(new Time(800));

    Song song1 = new Song("Someone that I used to know", "Gotye", new Time(103));
    Song song2 = new Song("Take me to church", "Hozier", new Time(133));
    Song song3 = new Song("Golden", "Huntr/x", new Time(413));

    iPod.addSong(song1);
    iPod.addSong(song2);
    iPod.addSong(song3);

    System.out.println(iPod);

    System.out.println("Songs longer than 200 seconds: " + iPod.getNumberOfSongsLongerThan(new Time(200)));

    Song[] songs = iPod.getSongsLongerThan(new Time(100));

    for (int i = 0; i < songs.length; i++)
    {
      System.out.println(songs[i] + "\n");
    }

  }

}
