package Controller;

import java.sql.Blob;

public abstract class User
{
    protected String email;
    protected String password;
    protected String first_name;
    protected String last_name;
    protected byte[] photo;
    
    public User(String email, String password, String first_name, String last_name, byte[] photo)
    {
        this.email=email;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.photo = photo;
    }
    public String getEmail()
    {
        return email;
    }
    public String getPassword()
    {
        return password;
    }
    public String getFirst_name()
    {
        return first_name;
    }
    public String getLast_name()
    {
        return last_name;
    }
    public byte[] getPhoto()
    {
        return photo;
    }
}
