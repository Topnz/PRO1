public class Time
{
  private int hour;
  private int minute;
  private int second;

  public Time(int hour, int minute, int second)
  {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public Time(int totalSeconds)
  {
    int hours = 0;
    int minutes = 0;
    int seconds = 0;

    if (totalSeconds > 86400)
    {
      return;
    }
    else if (totalSeconds >= 3600)
    {
      hours = totalSeconds / 3600;
      int placeHolder = totalSeconds % 3600;

      minutes = placeHolder / 60;
      seconds = placeHolder % 60;

    }
    else if (totalSeconds >= 60)
    {
      minutes = totalSeconds / 60;
      seconds = totalSeconds % 60;
    }
    else
    {
      seconds = totalSeconds;
    }

    this.hour = hours;
    this.minute = minutes;
    this.second = seconds;
  }


  public int timeInSeconds()
  {
    return hour*3600+minute*60+second;
  }

  public int getHour()
  {
    return hour;
  }

  public int getMinute()
  {
    return minute;
  }

  public int getSecond()
  {
    return second;
  }



  public String toString()
  {
    String hours;
    String minutes;
    String seconds;

    if (this.hour < 10)
    {
      hours = "0" + this.hour;
    }
    else
    {
      hours = "" + this.hour;
    }

    if (this.minute < 10)
    {
      minutes = "0" + this.minute;
    }
    else
    {
      minutes = "" + this.minute;
    }

    if (this.second < 10)
    {
      seconds = "0" + this.second;
    }
    else
    {
      seconds = "" + this.second;
    }

    return hours + ":" + minutes + ":" + seconds;
  }
}
