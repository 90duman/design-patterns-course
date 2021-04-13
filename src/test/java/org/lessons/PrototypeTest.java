package org.lessons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.lessons.prototype.demo.CloneType;
import org.lessons.prototype.demo.Record;
import org.lessons.prototype.demo.Statement;
import org.lessons.prototype.example.Book;
import org.lessons.prototype.example.ItemRegistry;
import org.lessons.prototype.example.Movie;

import java.util.ArrayList;
import java.util.List;

/**
 * [Do not forget to leave useful description]
 * <p>
 *
 * @author axteel on 09.04.2021 : 15:34
 * @version 1.0
 */
public class PrototypeTest {
    @Test
    public void simpleDemoPrototypeTest() {
        // given
        String sql = "select * from movies where title = ?";
        List<String> parameters = new ArrayList<>();
        parameters.add("Star wars");
        Record record = new Record();

        //when
        Statement firstStatement = new Statement(sql, parameters, record);
        System.out.println(firstStatement);
        System.out.println(firstStatement.getSql());
        System.out.println(firstStatement.getParameters());
        System.out.println(firstStatement.getRecord());

        //then
        Statement newStatement = firstStatement.clone(CloneType.SHALLOW);
        System.out.println(newStatement);
        System.out.println(newStatement.getSql());
        System.out.println(newStatement.getParameters());
        System.out.println(newStatement.getRecord());

        newStatement.getRecord().setRec("Recording1");
        System.out.println(firstStatement.getRecord());
        System.out.println(newStatement.getRecord());
    }

    @Test
    public void anotherTest() {
        ItemRegistry registry = new ItemRegistry();

        Book book1 = (Book) registry.createItem(Book.class);
        Book book2 = (Book) registry.createItem(Book.class);

        Movie movie1 = (Movie) registry.createItem(Movie.class);
        Movie movie2 = (Movie) registry.createItem(Movie.class);

        System.out.println(book1.getTitle());
        System.out.println(book2.getTitle());

        System.out.println(movie1.getTitle());
        System.out.println(movie2.getTitle());

        Assertions.assertNotEquals(book1, book2);
        Assertions.assertNotEquals(movie1, movie2);
    }
}
