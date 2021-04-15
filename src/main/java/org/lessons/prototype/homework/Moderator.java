package org.lessons.prototype.homework;

public class Moderator extends User{
    private String moderatorName;

    public Moderator(String firstName, String lastname, String username, String password, String moderatorName) {
        super(firstName, lastname, username, password);
        this.moderatorName = moderatorName;
    }

    public String getModeratorName() {
        return moderatorName;
    }

    public void setModeratorName(String moderatorName) {
        this.moderatorName = moderatorName;
    }

    @Override
    public String toString() {
        return "Moderator{" +
                "moderatorName='" + moderatorName + '\'' +
                '}';
    }
}
