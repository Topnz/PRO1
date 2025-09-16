public class Email
{
  private String user;
  private String host;
  private String domain;



  public Email(String user, String host, String domain)
  {
    if ((host.length() < 1 || host.length() > 63) ||
        (user.length() < 1 || user.length() > 64) ||
        (domain.length() < 1 || domain.length() > 63))
    {
      this.user = "wrong";
      this.host = "email";
      this.domain = "address";
      return;
    }

    for(int i = 0; i < user.length(); i++)
    {
      char ch = user.charAt(i);
      if (!hasLetterAndNumber(ch)) return;
    }

    hasLetter(host.charAt(0));

    for(int i = 0; i < host.length(); i++)
    {
      char ch = host.charAt(i);
      if (!hasLetterAndNumber(ch)) return;
    }

    for(int i = 0; i < domain.length(); i++)
    {
      char ch = domain.charAt(i);
      if (!hasLetterAndNumber(ch)) return;
    }

    boolean hasLetter = false;

    for(int i = 0; i < domain.length(); i++)
    {
      char ch = domain.charAt(i);
      if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
      {
        hasLetter = true;
        break;
      }
    }

    if (!hasLetter)
    {
      this.user = "wrong";
      this.host = "email";
      this.domain = "address";
      return;
    }

    this.user = user;
    this.host = host;
    this.domain = domain;
  }

  public boolean hasLetterAndNumber(char ch)
  {
    if ((ch >= 'A' && ch <= 'Z') ||
        (ch >= 'a' && ch <= 'z') ||
        (ch >= '0' && ch <= '9'))
    {
      return true;
    }
    this.user = "wrong";
    this.host = "email";
    this.domain = "address";
    return false;
  }


  public boolean hasLetter(char ch)
  {
    if ((ch >= 'A' && ch <= 'Z') ||
        (ch >= 'a' && ch <= 'z'))
    {
      this.user = "wrong";
      this.host = "email";
      this.domain = "address";
      return false;
    }
    return true;
  }



  public String getUser()
  {
    return user;
  }

  public String getHost()
  {
    return host;
  }

  public String getDomain()
  {
    return domain;
  }

  public String toString()
  {
    if (!user.equals("wrong"))
    {
      return user + "@" + host + "." + domain;
    }

    else
    {
      return "Wrong format, bitch";
    }

  }
}
