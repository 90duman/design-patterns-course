package org.lessons;

import org.junit.jupiter.api.Test;
import org.lessons.builder.Order;

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
}
