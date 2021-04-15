package org.lessons.prototype.homework;

public abstract class User implements Cloneable{
    private String firstName;
    private String lastname;
    private String username;
    private String password;

    public User(String firstName, String lastname, String username, String password) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
    }

    public User() {
    }

    @Override
    public User clone() {
        try {
            return (User) super.clone();
        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
