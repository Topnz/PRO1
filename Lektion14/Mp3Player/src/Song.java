public class Song
{
  private String title;
  private String artist;
  private Time length;

  public Song(String title, String artist,Time length)
  {
    this.title = title;
    this.artist = artist;
    this.length = length;
  }

  public String getTitle()
  {
    return title;
  }

  public String getArtist()
  {
    return artist;
  }

  public Time getLenght()
  {
    return length;
  }

  @Override public String toString()
  {
    return ("Title: " + title + " Artist: " + artist + " Length: " + length);
  }
}
