public class Clock
{
  private int hour;
  private int minute;
  private int second;

  public Clock(int hour, int minute, int second)
  {
    set(hour, minute, second);
  }

  public Clock(int totalSeconds)
  {
    set(totalSeconds);
  }

  public void set(int hour, int minute, int second)
  {
    if (hour > 23)
    {
      hour = 23;
    }
    else if (hour < 0)
    {
      hour = 0;
    }



    if (minute > 59)
    {
      minute = 59;
    }
    else if (minute < 0)
    {
      minute = 0;
    }



    if (second > 59)
    {
      second = 59;
    }
    else if (second < 0)
    {
      second = 0;
    }


    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public void set(int totalSeconds)
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

    if (this.hour < 9)
    {
      hours = "0" + this.hour;
    }
    else
    {
      hours = "" + this.hour;
    }

    if (this.minute < 9)
    {
      minutes = "0" + this.minute;
    }
    else
    {
      minutes = "" + this.minute;
    }

    if (this.second < 9)
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
