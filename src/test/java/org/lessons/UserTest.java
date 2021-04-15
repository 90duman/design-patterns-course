package org.lessons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.lessons.prototype.example.Book;
import org.lessons.prototype.example.ItemRegistry;
import org.lessons.prototype.example.Movie;
import org.lessons.prototype.homework.Admin;
import org.lessons.prototype.homework.Moderator;
import org.lessons.prototype.homework.UserRegistry;

public class UserTest {

    @Test
    public void userTest() {
        UserRegistry registry = new UserRegistry();

        Admin admin1 = (Admin) registry.createUser(Admin.class);
        Admin admin2 = (Admin) registry.createUser(Admin.class);

        Moderator moderator1 = (Moderator) registry.createUser(Moderator.class);
        Moderator moderator2 = (Moderator) registry.createUser(Moderator.class);

        System.out.println(admin1.getPassword());
        System.out.println(admin2.getPassword());

        System.out.println("++++++++++++++++++++++++++++++++++++");

        System.out.println(moderator1.getPassword());
        System.out.println(moderator2.getPassword());

        Assertions.assertNotEquals(admin1, admin2);
        Assertions.assertNotEquals(moderator1, moderator2);
    }
}
