package org.lessons.prototype.example;

/**
 * [Do not forget to leave useful description]
 * <p>
 *
 * @author axteel on 09.04.2021 : 18:18
 * @version 1.0
 */
public class Book extends Item {
    private int pages;

    public Book(String title, String price, String url, int pages) {
        super(title, price, url);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "pages=" + pages +
                '}';
    }
}
