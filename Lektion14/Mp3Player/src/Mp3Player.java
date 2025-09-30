import java.util.ArrayList;

public class Mp3Player
{
  private ArrayList<Song> songs;
  private Time maxLength;

  public Mp3Player(Time maxLength)
  {
    this.songs = new ArrayList<>();
    this.maxLength = maxLength;
  }

  public Time getLength()
  {
    int allSeconds = 0;
    for (int i=0; i < songs.size(); i++)
    {
      Time length = songs.get(i).getLenght();
      allSeconds += length.timeInSeconds();
    }
    return new Time(allSeconds);
  }

  public Song getSong(int index)
  {
    if (index < songs.size())
    {
      return songs.get(index);
    }
    else
    {
      return null;
    }
  }

  public void addSong(Song song)
  {
    if (getLength().timeInSeconds() + song.getLenght().timeInSeconds() < maxLength.timeInSeconds())
    {
      songs.add(song);
    }
  }

  public int getNumberOfSongs()
  {
    return songs.size();
  }

  @Override public String toString()
  {
    String s = "";
    for (int i=0; i < songs.size(); i++)
    {
      s += songs.get(i).toString();
      if (i != songs.size()-1)
      {
        s += "\n";
      }
    }
    return s;
  }


  public int getNumberOfSongsLongerThan(Time length)
  {
    int counter = 0;
    for (int i = 0; i < songs.size(); i++)
    {
      if (length.timeInSeconds() < songs.get(i).getLenght().timeInSeconds())
      {
        counter++;
      }
    }
    return counter;
  }

  public Song[] getSongsLongerThan(Time length)
  {
    Song[] songArray = new Song[getNumberOfSongsLongerThan(length)];
    int index = 0;

    for(int i = 0; i < songs.size(); i++)
    {
      Song song = songs.get(i);
      if (length.timeInSeconds() < song.getLenght().timeInSeconds())
      {
        songArray[index] = song;
        index++;
      }
    }
    return songArray;
  }



}
