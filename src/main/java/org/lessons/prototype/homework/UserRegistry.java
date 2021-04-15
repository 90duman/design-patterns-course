package org.lessons.prototype.homework;

import org.lessons.prototype.example.Item;

import java.util.HashMap;
import java.util.Map;

public class UserRegistry {

    private Map<Class, User> users = new HashMap<>();

    public UserRegistry() {
        registrator();
    }

    public User createUser(Class cls) {
        return users.get(cls).clone();
    }

    public void registrator() {
        Admin admin = new Admin("Alex", "Mine", "alexm", "am123", "admin");
        Moderator moderator = new Moderator("Jon", "Cop", "jcop", "j123", "moderator");
        users.put(Admin.class, admin);
        users.put(Moderator.class, moderator);
    }
}
