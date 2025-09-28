public class UserAccount
{
  //3 variables get called name, username &  password gets called as strings:
  private String name;
  private String username;
  private String password;

  //Constructor with 3 parameters name, username & password,
  // they get initialised as instance variables.
  public UserAccount(String name, String username, String password)
  {
    this.name = name; //Name
    this.username = username; //Username
    this.password = password; //Password
  }

  //Get method for name using getName(),
  // which returns the name of the user
  public String getName()
  {
    return name;
  }

  //Get method for password using getPassword(),
  // which returns the password of the user
  public String getPassword()
  {
    return username;
  }

  //hasPassword method that checks weather a given password
  // matches the current locally saved password
  public boolean hasPassword(String password)
  {
    return this.password.equals(password);
  }

  //Set method for setting a new password (newPassword)
  public void setPassword(String newPassword)
  {
    this.password = newPassword;
  }

  //A toString method that return the following message
  // "Your name: name "Your Username: username"
  @Override public String toString()
  {
    return "Your name is: " + name + "\nYour Username is: " + username;
  }

  @Override public boolean equals(Object obj)
  {
    //Checks if it's the same object in memory,
    // if it is, then it returns true
    if (this == obj)
      return true;

    //Checks if object is null or if it's a different class,
    // if it isn't, then it returns false
    if (obj == null || getClass() != obj.getClass())
      return false;

    //Type-cast to UserAccount
    UserAccount other = (UserAccount) obj;

    //Checks if the different fields are equals
    return
            //Checks weather name & other name is equals AND checks if that equal is equal to...
        this.name.equals(other.name) &&

            // Checks weather username & other username is equals AND checks if that equal is equal to...
        this.username.equals(other.username) &&

            // Checks weather password & other password is equals.
        this.password.equals(other.password);
  }
}