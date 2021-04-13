package org.lessons;

import org.junit.jupiter.api.Test;

import java.util.Calendar;

/**
 * [Do not forget to leave useful description]
 * <p>
 *
 * @author axteel on 11.04.2021 : 21:32
 * @version 1.0
 */
public class FactoryTest {
    @Test
    public void calendarTest() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

    }
}
