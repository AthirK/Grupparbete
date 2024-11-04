package Grupparbete;

// UserDTO class
public class UserDTO
{
    private int id;
    private String username;
    private String email;

    public UserDTO(int id, String username, String email)
    {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    public int getId()
    {
        return id;
    }

    public String getUsername()
    {
        return username;
    }

    public String getEmail()
    {
        return email;
    }

    @Override
    public String toString()
    {
        return "UserDTO id =" + id + ", username = '" + username + "', email = '" + email + "'";
    }
}
