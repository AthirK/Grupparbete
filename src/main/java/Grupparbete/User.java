package Grupparbete;

public class User 
{
    private String username;
    private String email;
    private int id;
    private UserRole role;
    private boolean active;

    public User(String username, String email, int id, UserRole role, boolean active)
    {
        this.username = username;
        this.email = email;
        this.id = id;
        this.role = role;
        this.active = active;
    }

    // Getters
    public String getUsername()
    {
        return username;
    }

    public String getEmail()
    {
        return email;
    }

    public int getId()
    {
        return id;
    }

    public UserRole getRole()
    {
        return role;
    }

    public boolean isActive() {
        return active;
    }
}
