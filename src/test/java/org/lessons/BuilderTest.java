package org.lessons;

import org.junit.jupiter.api.Test;
import org.lessons.builder.Customer;
import org.lessons.builder.Order;
import org.lessons.builder.User;

/**
 * Test for buidler
 * <p>
 *
 * @author axteel on 05.04.2021 : 17:26
 * @version 1.0
 */
public class BuilderTest {

    @Test
    public void testOne() {
        Order order = new Order.Builder()
                .bread("black")
                .dressing("ketchup")
                .condiments("More paper and salt please")
                .meat("beef")
                .build();

        System.out.println(order);
    }

    @Test
    public void betterBuidlerTest() {
        User u = User.builder()
                .id(123l)
                .username("Andrey")
                .password("qwerty")
                .build();

        System.out.println(u);
    }

    @Test
    public void lombokBuilderTest() {
        Customer c = Customer.builder()
                .id(123l)
                .build();
    }

    @Test
    public void casting() {

    }
}
