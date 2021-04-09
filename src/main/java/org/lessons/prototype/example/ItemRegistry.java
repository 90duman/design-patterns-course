package org.lessons.prototype.example;

import java.util.HashMap;
import java.util.Map;

/**
 * [Do not forget to leave useful description]
 * <p>
 *
 * @author axteel on 09.04.2021 : 18:16
 * @version 1.0
 */
public class ItemRegistry {
    private Map<Class, Item> items = new HashMap<>();

    public ItemRegistry() {
        bootstrap();
    }

    public Item createItem(Class cls) {
        return items.get(cls).clone();
    }

    private void bootstrap() {
        Movie movie = new Movie("Empire Strikes Back", "3$", "www.aaa.com/starwars", "2.5h");
        Book book = new Book("Harry Potter I", "4$", "www.bbb.com/harrypotter", 254);
        items.put(Movie.class, movie);
        items.put(Book.class, book);
    }
}
