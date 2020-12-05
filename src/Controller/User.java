package Controller;

public abstract class User
{
    protected String email;
    protected String password;
    protected String first_name;
    protected String last_name;
    
    public User(String email, String password, String first_name, String last_name)
    {
        this.email=email;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
    }
    public String getEmail()
    {
        return email;
    }
    
}
