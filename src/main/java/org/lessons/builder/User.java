package org.lessons.builder;

import java.util.Date;

/**
 * User.class is a great example of builder
 * <p>
 *
 * @author axteel on 09.04.2021 : 19:27
 * @version 1.0
 */
public class User {
    private Long id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String middleName;
    private Date registration;
    private Date updated;
    private Date deleted;

    private boolean activated;
    private boolean blocked;

    private User(Long id, String username, String password, String firstName,
                String lastName, String middleName, Date registration, Date updated,
                Date deleted, boolean activated, boolean blocked) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.registration = registration;
        this.updated = updated;
        this.deleted = deleted;
        this.activated = activated;
        this.blocked = blocked;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Date getRegistration() {
        return registration;
    }

    public Date getUpdated() {
        return updated;
    }

    public Date getDeleted() {
        return deleted;
    }

    public boolean isActivated() {
        return activated;
    }

    public boolean isBlocked() {
        return blocked;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", registration=" + registration +
                ", updated=" + updated +
                ", deleted=" + deleted +
                ", activated=" + activated +
                ", blocked=" + blocked +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Long id;
        private String username;
        private String password;
        private String firstName;
        private String lastName;
        private String middleName;
        private Date registration;
        private Date updated;
        private Date deleted;

        private boolean activated;
        private boolean blocked;

        public Builder id(Long id) {
            this.id = id;

            return this;
        }

        public Builder username(String username) {
            this.username = username;

            return this;
        }

        public Builder password(String password) {
            this.password = password;

            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;

            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;

            return this;
        }

        public Builder middleName(String middleName) {
            this.middleName = middleName;

            return this;
        }

        public Builder registration(Date registration) {
            this.registration = registration;

            return this;
        }

        public Builder updated(Date updated) {
            this.updated = updated;

            return this;
        }

        public Builder deleted(Date deleted) {
            this.deleted = deleted;

            return this;
        }

        public Builder activated(boolean activated) {
            this.activated = activated;

            return this;
        }

        public Builder blocked(boolean blocked) {
            this.blocked = blocked;

            return this;
        }

        public User build() {
            return new User(id, username, password, firstName,
                    lastName, middleName, registration, updated,
                    deleted, activated, blocked);
        }
    }
}
