package org.lessons.prototype.homework;

public class Admin extends User{
    private String role;

    public Admin(String firstName, String lastname, String username, String password, String role) {
        super(firstName, lastname, username, password);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "role='" + role + '\'' +
                '}';
    }
}
