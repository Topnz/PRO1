public class Clock
{
  private int hour;
  private int minute;
  private int second;
  private static final int SECONDS_PER_DAY = 86400;

  int hours = 0;
  int minutes = 0;
  int seconds = 0;

  public Clock(int hour, int minute, int second)
  {
    set(hour, minute, second);
  }

  public void set(int hour, int minute, int second)
  {
    set(hour*3600 + minute*60 + second);
  }

  public void set(int totalSeconds)
  {
   while (totalSeconds < 0)
   {
     totalSeconds += SECONDS_PER_DAY;
   }
   while (totalSeconds >= SECONDS_PER_DAY)
   {
     totalSeconds -= SECONDS_PER_DAY;
   }

   hours = totalSeconds / 3600;
   minutes = (totalSeconds % 3600) / 60;
   seconds = (totalSeconds % 3600) % 60;
   set(hours, minutes, seconds);
  }



  public void tic()
  {
    this.second += 1;

    if (second == 60)
    {
     minute += 1;
     this.second = 0;
    }

    if (minute == 60)
    {
      hour += 1;
      this.minute = 0;
    }

    if (hour == 24)
    {
      this.hour = 0;
    }

  }


  public Clock(int totalSeconds)
  {
    set(totalSeconds);
  }

  public boolean isBefore(Clock time)
  {
    if (time.hour < hour)
    {
      return false;
    }
    else if (time.hour == hour)
    {
      if (time.minute < minute)
      {
        return false;
      }
      else if (time.minute == minute)
      {
        if (time.second < second)
        {
          return false;
        }
        else
        {
          return true;
        }
      }
      return true;
    }
    return true;
  }

  public int toSeconds()
  {
    return (this.hour * 3600) + (this.minute * 60) + this.second;
  }

  public Clock timeTo(Clock time)
  {
    int time1Seconds = toSeconds();
    int time2Seconds = time.toSeconds();

    int difference = time1Seconds - time2Seconds;

    if (difference < 0)
    {
      difference = 0;
    }

    return new Clock(difference);
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
